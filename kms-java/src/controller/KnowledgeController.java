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

