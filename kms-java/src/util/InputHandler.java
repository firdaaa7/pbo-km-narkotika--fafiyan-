package util;

import java.util.Scanner;

public class InputHandler {

    private Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String bacaTeks(String label) {
        String input;
        do {
            System.out.print(label + ": ");
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input tidak boleh kosong, coba lagi.");
            }
        } while (input.isEmpty());
        return input;
    }

    public int bacaAngka(String label) {
        while (true) {
            System.out.print(label + ": ");
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Itu bukan angka yang valid, coba lagi.");
            }
        }
    }

    public double bacaDesimal(String label) {
        while (true) {
            System.out.print(label + ": ");
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Itu bukan angka desimal yang valid, coba lagi.");
            }
        }
    }

