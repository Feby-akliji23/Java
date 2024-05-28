package PRAKTEK5.HitungNilai;

import java.util.Scanner;

public class hitungNilaiDemo {
    public static void main(String[] args) {//Feby Akliji Rofiah - A11.2022.14529
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        // Array untuk menyimpan data siswa
        hitungNilai.Siswa[] siswaArray = new hitungNilai.Siswa[jumlahSiswa];

        // Meminta input data untuk setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nSiswa ke-" + (i + 1) + ":");
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
            scanner.nextLine(); // Membuang newline

            // Membuat objek Siswa dan menyimpannya dalam array
            siswaArray[i] = new hitungNilai.Siswa(nim, nama, nilaiUts, nilaiTugas, nilaiUas);
        }

        // Menampilkan daftar nilai siswa
        hitungNilai.daftarNilai(siswaArray);
    }
}
