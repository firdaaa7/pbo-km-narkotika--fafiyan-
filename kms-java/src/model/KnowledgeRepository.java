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

        simpan(new Putusan(
                "28-B/Pid.Sus/2024/PN Sby", "PN Surabaya", "29-02-2024",
                "Choirul Uman Bin Marsilan", 33, "Sabu-sabu", 101.30,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 108, 1000000000.0,
                "Darwanto, S.H., M.H."));

        simpan(new Putusan(
                "28-C/Pid.Sus/2024/PN Sby", "PN Surabaya", "29-02-2024",
                "Saipul Bahri Bin Marsilan", 20, "Sabu-sabu", 101.30,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 108, 1000000000.0,
                "Darwanto, S.H., M.H."));

        simpan(new Putusan(
                "29/Pid.Sus/2024/PN.Sby", "PN Surabaya", "07-05-2024",
                "Akhmad Riyanto Bin Abdul Azis", 43, "Sabu-sabu", 998.8,
                "Pasal 114 ayat (2) Jo Pasal 132 (1) UU No. 35 Tahun 2009",
                "Bandar", 180, 2000000000.0,
                "Alex Adam Faisal, S.H."));

        // Nomor 30: 2 terdakwa → suffix -A, -B
        simpan(new Putusan(
                "30-A/Pid.Sus/2024/PN Sby", "PN Surabaya", "19-02-2024",
                "Abdul Bakir Bin Asnawi", 49, "Sabu-sabu", 20.88,
                "Pasal 114 ayat (2) Jo Pasal 132 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 108, 1000000000.0,
                "Suparno, S.H., M.H."));

        simpan(new Putusan(
                "30-B/Pid.Sus/2024/PN Sby", "PN Surabaya", "19-02-2024",
                "Sujono Bin Nuradji", 37, "Sabu-sabu", 20.88,
                "Pasal 114 ayat (2) Jo Pasal 132 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 108, 1000000000.0,
                "Suparno, S.H., M.H."));

        simpan(new Putusan(
                "31/Pid.Sus/2024/PN.Sby", "PN Surabaya", "23-04-2024",
                "Muchamad Umar Faroq Bin Mat Sukri", 34, "Sabu-sabu", 998.8,
                "Pasal 114 ayat (2) Jo Pasal 132 (1) UU No. 35 Tahun 2009",
                "Bandar", 192, 2000000000.0,
                "Heru Hanindyo, S.H., M.H., LL.M."));

        simpan(new Putusan(
                "32/Pid.Sus/2024/PN Sby", "PN Surabaya", "05-02-2024",
                "Alfin Irfian Bin Siswo", 27, "Sabu-sabu", 0.956,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 84, 900000000.0,
                "Dr. Nurnaningsih Amriani, S.H., M.H."));

        simpan(new Putusan(
                "34/Pid.Sus/2024/PN Sby", "PN Surabaya", "07-03-2024",
                "Abdul Gefur Bin Asmar", 37, "Sabu-sabu", 0.836,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 60, 800000000.0,
                "Mochammad Djoenaidie, S.H., M.H."));

        simpan(new Putusan(
                "36/Pid.Sus/2024/PN Sby", "PN Surabaya", "15-02-2024",
                "Alias Tover Tukan Alias Itong Bin Nico Laos Tukan", 33, "Sabu-sabu", 1.63,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 72, 1000000000.0,
                "Moch Taufik Tatas Prihyantono, S.H."));

        simpan(new Putusan(
                "39/Pid.Sus/2024/PN Sby", "PN Surabaya", "15-02-2024",
                "Moch. Riadi Bin Moch. Ridwan", 35, "Sabu-sabu", 1.08,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 78, 1000000000.0,
                "Erintuah Damanik, S.H., M.H."));

        simpan(new Putusan(
                "45-A/Pid.Sus/2024/PN Sby", "PN Surabaya", "06-03-2024",
                "Yoga Hardono Bin Sudarno", 46, "Sabu-sabu", 1.055,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 144, 2000000000.0,
                "Antyo Harri Susetyo, S.H."));

        simpan(new Putusan(
                "45-B/Pid.Sus/2024/PN Sby", "PN Surabaya", "06-03-2024",
                "Hendrawan Bin Sanurin", 29, "Sabu-sabu", 1.055,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 144, 2000000000.0,
                "Antyo Harri Susetyo, S.H."));

        simpan(new Putusan(
                "49/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Abdur Rohman Bin Tahli", 40, "Sabu-sabu", 2.16,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 92, 1000000000.0,
                "R. Yoes Hartyarso, S.H., M.H."));

        simpan(new Putusan(
                "50/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Guntur Pamungkas alias Tupai Bin Wahyudi", 27, "Sabu-sabu", 2.756,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 96, 1200000000.0,
                "Sudar, S.H., M.Hum."));

        simpan(new Putusan(
                "54/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Warda Andreansyah Bin Suwarso (Alm)", 24, "Sabu-sabu", 0.079,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 72, 1000000000.0,
                "Heru Hanindyo, S.H., M.H., LL.M."));

        simpan(new Putusan(
                "55/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Ilham Reza Izzuddin alias Reza Bin Eko Suhartono", 25, "Ganja", 12.72,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 92, 1000000000.0,
                "Antyo Harry Susetyo, S.H."));

        simpan(new Putusan(
                "58/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Kasmanto Bin Slamet", 38, "Sabu-sabu", 0.079,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 60, 1000000000.0,
                "Saifudin Zuhri, S.H., M.Hum."));

        simpan(new Putusan(
                "61/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Fausen alias Kacong Bin Sonhaji", 23, "Sabu-sabu", 0.079,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 92, 800000000.0,
                "Taufan Mandala, S.H., M.Hum."));

        simpan(new Putusan(
                "62/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Muhammad Rohman Bin Lukdin", 45, "Sabu-sabu", 0.079,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 60, 800000000.0,
                "Dr. Nurnaningsih Amriani, S.H., M.H."));

        simpan(new Putusan(
                "64-A/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "M. Abdul Sakur Bin M. Hariri", 26, "Ekstasi", 7.96,
                "Pasal 132 ayat (1) Jo Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 108, 1000000000.0,
                "Widiarso, S.H., M.H."));

        simpan(new Putusan(
                "64-B/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Musaffa Bin Umar", 36, "Ekstasi", 7.96,
                "Pasal 132 ayat (1) Jo Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 108, 1000000000.0,
                "Widiarso, S.H., M.H."));

        simpan(new Putusan(
                "65/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Musaffa Bin Umar", 36, "Ekstasi", 7.96,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Pengguna", 108, 1000000000.0,
                "Ferdinand Marcus Leander, S.H., M.H."));

        simpan(new Putusan(
                "66/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Herianto alias Heri Bin Sukri (Alm)", 40, "Sabu-sabu", 3.14,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 99, 1000000000.0,
                "Toniwidjaya Hansberd Hilly, S.H."));

        simpan(new Putusan(
                "67/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Lanang Firdaus Ingpranata Buana Bin Raden Monmowangsa", 20,
                "Tembakau sintetis (Gorilla/Sinte)", 39.4,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 104, 1000000000.0,
                "Hj. Halima Umaternate, S.H., M.H."));

        simpan(new Putusan(
                "79/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Moch. Nopel Bin Binakram (Alm)", 42, "Sabu-sabu", 0.513,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 72, 1000000000.0,
                "Djuanto, S.H., M.H."));

        simpan(new Putusan(
                "80/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Moch. Dahlan Bin Rasit (Alm)", 45, "Sabu-sabu", 10.00,
                "Pasal 114 ayat (2) UU No. 35 Tahun 2009",
                "Bandar", 84, 1000000000.0,
                "Heru Hanindyo, S.H., M.H., LL.M."));

        simpan(new Putusan(
                "84/Pid.Sus/2024/PN Sby", "PN Surabaya", "26-02-2024",
                "Husnul Yaqin alias Asmad Bin Zahrah", 41, "Sabu-sabu", 2.12,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 48, 800000000.0,
                "Dr. Nurnaningsih Amriani, S.H., M.H."));

        simpan(new Putusan(
                "86/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Moch. Oesman Bin Mat Sui", 48, "Sabu-sabu", 2.12,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 84, 1000000000.0,
                "I Dewa Gede Suarditha, S.H., M.H."));

        simpan(new Putusan(
                "87/Pid.Sus/2024/PN Sby", "PN Surabaya", "26-02-2024",
                "Yuli Subagyo Bin Irsad", 46, "Sabu-sabu", 0.079,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 48, 800000000.0,
                "Ni Putu Sri Indayani, S.H., M.H."));

        simpan(new Putusan(
                "88/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Ahmad Faishol alias Faishol Bin Shobari", 29, "Sabu-sabu", 0.079,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 168, 1000000000.0,
                "Ferdinand Marcus Leander, S.H., M.H."));

        simpan(new Putusan(
                "91/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Ketot Samiawan alias Wawa Bin Ponimin (Alm)", 34, "Sabu-sabu", 0.047,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 99, 1000000000.0,
                "Silfi Yanti Zulfia, S.H., M.H."));

        simpan(new Putusan(
                "94/Pid.Sus/2024/PN Sby", "PN Surabaya", "29-04-2024",
                "Fikri Ramadanu Bin Mardjuki", 21, "Sabu-sabu", 0.047,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 48, 800000000.0,
                "Dr. Nurnaningsih Amriani, S.H., M.H."));

        simpan(new Putusan(
                "95/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Rasmat alias Lahmat Bin Mat Radji", 58, "Sabu-sabu", 0.047,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 96, 1000000000.0,
                "Alex Adam Faisal, S.H."));

        simpan(new Putusan(
                "96-A/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Achmad Junaidi Bin Achmad Nur", 36, "Sabu-sabu", 2.12,
                "Pasal 132 ayat (1) UU No. 35 Tahun 2009",
                "Kurir", 84, 1000000000.0,
                "Ni Putu Sri Indayani, S.H., M.H."));

        simpan(new Putusan(
                "96-B/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Fajar Apriyanto Bin Sutrisno", 34, "Sabu-sabu", 2.12,
                "Pasal 132 ayat (1) UU No. 35 Tahun 2009",
                "Kurir", 84, 1000000000.0,
                "Ni Putu Sri Indayani, S.H., M.H."));

        simpan(new Putusan(
                "97/Pid.Sus/2024/PN Sby", "PN Surabaya", "04-03-2024",
                "Dimas Agus Setiawan Bin Dadik Masturiawan", 21, "Sabu-sabu", 0.75,
                "Pasal 114 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 84, 1000000000.0,
                "Ferdinand Marcus Leander, S.H., M.H."));

        simpan(new Putusan(
                "98/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-02-2024",
                "Moch. Saiful Bin Moch. Hustadi", 37, "Sabu-sabu", 1.31,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Bandar", 60, 800000000.0,
                "Mangapul, S.H."));

        simpan(new Putusan(
                "112/Pid.Sus/2024/PN Sby", "PN Surabaya", "03-04-2024",
                "Yasin Arif Bin M. Lutfi (Alm)", 33,
                "Sabu-sabu", 1.03,
                "Pasal 132 ayat (1) UU No. 35 Tahun 2009",
                "Kurir", 84, 1000000000.0,
                "Cokia Ana Pontia O, S.H., M.H."));

        simpan(new Putusan(
                "114/Pid.Sus/2024/PN Sby", "PN Surabaya", "30-04-2024",
                "Mochamad Bushiri Bin Agoes Soepriadi", 23,
                "Sabu-sabu", 0.291,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 48, 800000000.0,
                "Dr. Nurnaningsih Amriani, S.H., M.H."));

        simpan(new Putusan(
                "119/Pid.Sus/2024/PN Sby", "PN Surabaya", "26-03-2024",
                "Agham Taufan Ariesti Bin Moch. Zainal Arifin", 30,
                "Sabu-sabu", 0.322,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 54, 800000000.0,
                "Sutrisno, S.H., M.H."));

        simpan(new Putusan(
                "121/Pid.Sus/2024/PN Sby", "PN Surabaya", "27-03-2024",
                "Tri Melania Hendriany Binti Paulus Hendro Buniko", 44,
                "Sabu-sabu", 0.182,
                "Pasal 112 ayat (1) UU No. 35 Tahun 2009",
                "Pengguna", 48, 800000000.0,
                "Khadwanto, S.H."));


    }
}

