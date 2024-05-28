package PRAKTEK2;

import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM         : ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama        : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Nilai UTS   : ");
        double nilaiUts = scanner.nextDouble();

        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS   : ");
        double nilaiUas = scanner.nextDouble();

        double nilaiTugasFix = 0.35 * nilaiTugas;
        double nilaiUtsFix = 0.20 * nilaiUts;
        double nilaiUasFix = 0.45 * nilaiUas;
        double nilaiAkhirFix = 0.20 * nilaiUts + 0.35 * nilaiTugas + 0.45 * nilaiUas;

        System.out.println("\nNIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.printf("Nilai Tugas   : %.1f (20%%) \t: %.1f\n", nilaiTugas, nilaiTugasFix);
        System.out.printf("Nilai UTS     : %.1f (35%%) \t: %.1f\n", nilaiUts, nilaiUtsFix);
        System.out.printf("Nilai UAS     : %.1f (45%%) \t: %.1f\n", nilaiUas, nilaiUasFix);
        System.out.printf("Nilai Akhir   : %.1f\n", nilaiAkhirFix);
    }
}
