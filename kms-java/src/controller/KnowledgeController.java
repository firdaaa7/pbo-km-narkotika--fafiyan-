package controller;

import model.Putusan;
import model.KnowledgeRepository;
import model.StatistikPutusan;
import util.DataTidakValidException;
import java.util.ArrayList;

public class KnowledgeController {

    private KnowledgeRepository repository;

    public KnowledgeController() {
        this.repository = new KnowledgeRepository();
    }

    public boolean tambahData(Putusan p) throws DataTidakValidException {
        if (p == null || p.getNomorPerkara().isEmpty()) {
            throw new DataTidakValidException("Nomor perkara tidak boleh kosong.");
        }
        if (repository.cariByNomor(p.getNomorPerkara()) != null) {
            throw new DataTidakValidException("Nomor perkara '" + p.getNomorPerkara() + "' sudah ada (duplikat).");
        }
        repository.simpan(p);
        return true;
    }

    public ArrayList<Putusan> getSemuaData() {
        return repository.getDaftarSemua();
    }

