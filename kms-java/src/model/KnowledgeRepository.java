package model;

import java.util.ArrayList;

public class KnowledgeRepository {

    private ArrayList<Putusan> daftarPutusan;

    public KnowledgeRepository() {
        this.daftarPutusan = new ArrayList<>();
    }

    public void simpan(Putusan p) {
        daftarPutusan.add(p);
    }

    public Putusan cariByNomor(String nomor) {
        for (Putusan p : daftarPutusan) {
            if (p.getNomorPerkara().equalsIgnoreCase(nomor)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Putusan> cariByNama(String nama) {
        ArrayList<Putusan> hasil = new ArrayList<>();
        for (Putusan p : daftarPutusan) {
            if (p.getNamaTerdakwa().toLowerCase().contains(nama.toLowerCase())) {
                hasil.add(p);
            }
        }
        return hasil;
    }

    public ArrayList<Putusan> filterByJenis(String jenis) {
        ArrayList<Putusan> hasil = new ArrayList<>();
        for (Putusan p : daftarPutusan) {
            if (p.getJenisNarkotika().equalsIgnoreCase(jenis)) {
                hasil.add(p);
            }
        }
        return hasil;
    }
    public ArrayList<Putusan> filterByPengadilan(String pengadilan) {
        ArrayList<Putusan> hasil = new ArrayList<>();
        for (Putusan p : daftarPutusan) {
            if (p.getPengadilan().equalsIgnoreCase(pengadilan)) {
                hasil.add(p);
            }
        }
        return hasil;
    }

    public boolean hapus(String nomor) {
        Putusan target = cariByNomor(nomor);
        if (target != null) {
            daftarPutusan.remove(target);
            return true;
        }
        return false;
    }

    public ArrayList<Putusan> getDaftarSemua() {
        return daftarPutusan;
    }

    public int getTotalData() {
        return daftarPutusan.size();
    }

    public void muatDataAsli() {

        simpan(new Putusan(
                "3/Pid.Sus/2024/PN Sby", "PN Surabaya", "02-01-2024",
                "I Putu Gede Dhani Gita", 25, "Sabu-sabu", 2.38,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Tidak Diketahui", 96, 1000000000.0,
                "Cokia Ana Pontia O, S.H., M.H."));

        simpan(new Putusan(
                "7/Pid.Sus/2024/PN.Sby", "PN Surabaya", "30-01-2024",
                "Muhammad Ricky Bagus Saputro Bin Mugito", 26, "Sabu-sabu", 1.17,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Tidak Diketahui", 54, 1000000000.0,
                "Alex Adam Faisal, S.H."));

        simpan(new Putusan(
                "10/Pid.Sus/2024/PN Sby", "PN Surabaya", "22-02-2024",
                "M. Ilham Wahyudi Bin Ilyas", 29, "Sabu-sabu", 1.626,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Tidak Diketahui", 84, 1500000000.0,
                "Cokia Ana Pontia O, S.H., M.H."));

        simpan(new Putusan(
                "11/Pid.Sus/2024/PN.Sby", "PN Surabaya", "26-02-2024",
                "Gatut Setyo Utomo Bin Suratno", 23, "Sabu-sabu", 0.146,
                "Pasal 114 ayat (1) Jo Pasal 132 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 84, 1000000000.0,
                "Rudito Surotomo, S.H., M.H."));

        simpan(new Putusan(
                "13/Pid.Sus/2024/PN Sby", "PN Surabaya", "15-02-2024",
                "Mochamad Yahya Bin Hadi", 33, "Sabu-sabu", 2.24,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 72, 1000000000.0,
                "Silfi Yanti Zulfia, S.H., M.H."));

        simpan(new Putusan(
                "15/Pid.Sus/2024/PN Sby", "PN Surabaya", "15-01-2024",
                "Bryan Dodik Prasetyo Alias Tole Bin Mulyadi", 23, "Sabu-sabu", 0.62,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 84, 1500000000.0,
                "Ni Putu Sri Indayani, S.H., M.H."));

        simpan(new Putusan(
                "20/Pid.Sus/2024/PN Sby", "PN Surabaya", "21-02-2024",
                "Imam Afandi Bin Arkan", 32, "Sabu-sabu", 0.395,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 72, 1000000000.0,
                "Khadwanto, S.H."));

        simpan(new Putusan(
                "21/Pid.Sus/2024/PN.Sby", "PN Surabaya", "29-02-2024",
                "Wahyu Ade Pratama Firmansyah Bin Trio Wahyu Wicaksono", 20, "Sabu-sabu", 0.374,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 78, 1000000000.0,
                "Rudito Surotomo, S.H., M.H."));

        simpan(new Putusan(
                "23/Pid.Sus/2024/PN Sby", "PN Surabaya", "14-03-2024",
                "Arif Fadilah Alias Hulk Bin Tiam", 30, "Sabu-sabu", 4.475,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 78, 1000000000.0,
                "Cokia Ana Pontia O, S.H., M.H."));

        simpan(new Putusan(
                "25/Pid.Sus/2024/PN Sby", "PN Surabaya", "15-03-2024",
                "Moch Mansjur Bin Rupi", 28, "Sabu-sabu", 18.70,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 108, 1000000000.0,
                "Tongani, S.H., M.H."));

        simpan(new Putusan(
                "27/Pid.Sus/2024/PN Sby", "PN Surabaya", "06-03-2024",
                "Moch. Fahri Bin Jinab", 52, "Sabu-sabu", 1.814,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 90, 1000000000.0,
                "Silfi Yanti Zulfia, S.H., M.H."));

        simpan(new Putusan(
                "28-A/Pid.Sus/2024/PN Sby", "PN Surabaya", "29-02-2024",
                "Kuswantoro Bin Tohir", 26, "Sabu-sabu", 101.30,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 108, 1000000000.0,
                "Darwanto, S.H., M.H."));

    }

