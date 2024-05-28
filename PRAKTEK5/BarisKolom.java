package PRAKTEK5;
import java.util.Scanner;

public class BarisKolom {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bilangan : ");
        int bilangan = scanner.nextInt();
        System.out.print("\n");

        // Mencetak baris dengan 5 kolom
        printNumbers(bilangan, 5);
        
        System.out.println("\n-------------------------\n");
        
        //Feby Akliji Rofiah - A11.2022.14529
        
        System.out.print("Dipecah : ");
        int dipecah = scanner.nextInt();
        System.out.print("\n");

        // Mencetak baris dengan jumlah kolom sesuai input pengguna
        printNumbers(bilangan, dipecah);
    }

    // Fungsi untuk mencetak baris dengan jumlah kolom yang ditentukan
    private static void printNumbers(int bilangan, int kolom) {
        for (int i = 1; i <= bilangan; i++) {
            System.out.print(i + " ");
            if (i % kolom == 0 || i == bilangan) {
                System.out.println();
            }
        }
    }
}

