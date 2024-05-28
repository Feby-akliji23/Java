package PRAKTEK5;

// ------------------ KODE PROGRAM AWAL ------------------

// import java.util.ArrayList;    
// public class ArrayListDemo {
//     public static void main(String args[]) {
//     ArrayList<Integer> nilail = new ArrayList<Integer>();
//     ArrayList<Integer> nilai2 = new ArrayList<Integer>();
//     ArrayList<Integer> jumlah = new ArrayList<Integer>();
//     System.out.println("Nilai 1");
//     for(int i=0; i<5; i++) {
//         nilail.add(i); System.out.println("Index ke " + i + " = " +
//         nilail.get(i)); }
//     System.out.println("Nilai 2");
//     for(int i=0; i<5; i++) {
//         nilai2.add(i); System.out.println("Index ke " + i + " = " +
//         nilai2.get(i)); }
//     for(int i=0; i<5; i++) {
//         jumlah.add(nilail.get(i) + nilai2.get(i)); }
//         System.out.println("Hasil Jumlah nilail + nilai2");
//     for(int i=0; i<5; i++) {
//         System.out.println("Jumlah index ke "+ i + " = " +jumlah.get(i)); }
//     }
// }

// ------------------ KODE DITAMBAHKAN INPUT PENGGUNA ------------------

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {//Feby Akliji Rofiah - A11.2022.14529
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna

        ArrayList<Integer> nilai1 = new ArrayList<Integer>(); // ArrayList untuk menyimpan nilai1
        ArrayList<Integer> nilai2 = new ArrayList<Integer>(); // ArrayList untuk menyimpan nilai2
        ArrayList<Integer> hasilJumlah = new ArrayList<Integer>(); // ArrayList untuk menyimpan hasil penjumlahan
        ArrayList<Integer> hasilKurang = new ArrayList<Integer>(); // ArrayList untuk menyimpan hasil pengurangan
        ArrayList<Integer> hasilKali = new ArrayList<Integer>(); // ArrayList untuk menyimpan hasil perkalian
        ArrayList<Double> hasilBagi = new ArrayList<Double>(); // ArrayList untuk menyimpan hasil pembagian

        // Meminta pengguna untuk memasukkan jumlah data
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();

        // Memasukkan nilai untuk array nilai1
        System.out.println("Masukkan nilai untuk Array nilai1:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Index ke " + i + " = ");
            nilai1.add(scanner.nextInt()); // Memasukkan nilai ke ArrayList nilai1
        }

        // Memasukkan nilai untuk array nilai2
        System.out.println("Masukkan nilai untuk Array nilai2:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Index ke " + i + " = ");
            nilai2.add(scanner.nextInt()); // Memasukkan nilai ke ArrayList nilai2
        }

        // Operasi penjumlahan
        for (int i = 0; i < jumlahData; i++) {
            hasilJumlah.add(nilai1.get(i) + nilai2.get(i)); // Menambahkan hasil penjumlahan ke ArrayList hasilJumlah
        }

        // Operasi pengurangan
        for (int i = 0; i < jumlahData; i++) {
            hasilKurang.add(nilai1.get(i) - nilai2.get(i)); // Menambahkan hasil pengurangan ke ArrayList hasilKurang
        }

        // Operasi perkalian
        for (int i = 0; i < jumlahData; i++) {
            hasilKali.add(nilai1.get(i) * nilai2.get(i)); // Menambahkan hasil perkalian ke ArrayList hasilKali
        }

        // Operasi pembagian
        for (int i = 0; i < jumlahData; i++) {
            hasilBagi.add((double) nilai1.get(i) / nilai2.get(i)); // Menambahkan hasil pembagian ke ArrayList hasilBagi
        }

        // Menampilkan hasil
        System.out.println("\nHasil Operasi:");
        System.out.println("Penjumlahan: " + hasilJumlah);
        System.out.println("Pengurangan: " + hasilKurang);
        System.out.println("Perkalian: " + hasilKali);
        System.out.println("Pembagian: " + hasilBagi);

        scanner.close(); // Menutup objek scanner
    }
}
