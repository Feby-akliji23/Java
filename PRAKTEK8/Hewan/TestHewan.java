package PRAKTEK8.Hewan;

import java.util.Scanner;

public class TestHewan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hewan hewan = null;
        boolean running = true;

        while (running) {
            System.out.println("Pilih Hewan:");
            System.out.println("1. Singa");
            System.out.println("2. Elang");
            System.out.println("3. Lebah");
            System.out.println("4. Paus");
            System.out.println("5. Keluar");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hewan = new Singa();
                    break;
                case 2:
                    hewan = new Elang();
                    break;
                case 3:
                    hewan = new Lebah();
                    break;
                case 4:
                    hewan = new Paus();
                    break;
                case 5:
                    running = false;
                    continue;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            if (hewan != null) {
                hewan.suara();
                hewan.berjalan();
                hewan.bernafas();
            }
        }
        
        scanner.close();
    }
}