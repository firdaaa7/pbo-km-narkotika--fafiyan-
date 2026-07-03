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

