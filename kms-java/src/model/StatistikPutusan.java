package model;

import java.util.ArrayList;

public class StatistikPutusan {

    private static final String[] KATEGORI_JENIS = {"Sabu-sabu", "Ganja", "Ekstasi", "Heroin", "Lainnya"};
    private static final String[] KATEGORI_PERAN = {"Bandar", "Kurir", "Pengguna", "Penyimpan", "Lainnya"};

    private int totalPutusan;
    private double rataRataVonis;
    private double rataRataDenda;
    private String jenisNarkotikaTerbanyak;
    private String[] distribusiPeran;


    public int getTotalPutusan() {
        return totalPutusan;
    }

    public double getRataRataVonis() {
        return rataRataVonis;
    }

    public double getRataRataDenda() {
        return rataRataDenda;
    }

    public String getJenisNarkotikaTerbanyak() {
        return jenisNarkotikaTerbanyak;
    }

    public String[] getDistribusiPeran() {
        return distribusiPeran;
    }
}
