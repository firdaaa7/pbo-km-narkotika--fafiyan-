package view;

import controller.KnowledgeController;
import model.Putusan;
import model.StatistikPutusan;
import util.InputHandler;
import util.DataTidakValidException;
import java.util.ArrayList;


public class ConsoleView {

    private KnowledgeController controller;
    private InputHandler input;

    public ConsoleView(KnowledgeController controller) {
        this.controller = controller;
        this.input = new InputHandler();
    }

    public void mulai() {
        boolean lanjut = true;
        while (lanjut) {
            tampilkanMenu();
            int pilihan = input.bacaPilihanMenu("Pilih menu", 1, 7);
            switch (pilihan) {
                case 1: prosesTambahData(); break;
                case 2: prosesLihatSemua(); break;
                case 3: prosesCariData(); break;
                case 4: prosesFilterData(); break;
                case 5: prosesHapusData(); break;
                case 6: prosesStatistik(); break;
                case 7: lanjut = false; System.out.println("Sampai jumpa!"); break;
            }
        }
    }
    private void tampilkanMenu() {
        System.out.println("\n===== KMS PUTUSAN NARKOTIKA =====");
        System.out.println("1. Tambah Data");
        System.out.println("2. Lihat Semua Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Filter Data");
        System.out.println("5. Hapus Data");
        System.out.println("6. Lihat Statistik");
        System.out.println("7. Keluar");
    }
    private void tampilkanDaftar(ArrayList<Putusan> daftar) {
        if (daftar.isEmpty()) {
            System.out.println("Tidak ada data.");
            return;
        }
        for (Putusan p : daftar) {
            p.tampilkan();
        }
    }
}
