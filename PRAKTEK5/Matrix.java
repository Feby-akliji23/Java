package PRAKTEK5;

import java.util.Scanner;

public class Matrix {//Feby Akliji Rofiah - A11.2022.14529
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna

        while (true) { // Memulai loop utama program
            System.out.println("\nMenu:"); // Menampilkan menu pilihan
            System.out.println("1. Penjumlahan Matriks");
            System.out.println("2. Transposisi Matriks C");
            System.out.println("3. Perkalian Matriks");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: "); // Meminta pengguna untuk memilih menu
            int choice = scanner.nextInt(); // Membaca pilihan pengguna

            switch (choice) { // Memilih operasi berdasarkan pilihan pengguna
                case 1:
                    additionOperation(scanner); // Memanggil method untuk operasi penjumlahan
                    break;
                case 2:
                    transposeOperation(scanner); // Memanggil method untuk operasi transposisi
                    break;
                case 3:
                    multiplicationOperation(scanner); // Memanggil method untuk operasi perkalian
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program."); // Menampilkan pesan keluar
                    return; // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali."); // Menampilkan pesan jika pilihan tidak valid
            }
        }
    }

    // Method untuk input matriks
    public static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols]; // Membuat array untuk menyimpan matriks
        for (int i = 0; i < rows; i++) { // Loop untuk baris
            for (int j = 0; j < cols; j++) { // Loop untuk kolom
                System.out.print("Input elemen matrix [" + i + "," + j + "] = "); // Meminta pengguna untuk memasukkan elemen matriks
                matrix[i][j] = scanner.nextInt(); // Memasukkan elemen matriks
            }
        }
        return matrix; // Mengembalikan matriks yang diinput
    }

    // Method untuk menampilkan matriks
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) { // Loop untuk setiap baris matriks
            for (int num : row) { // Loop untuk setiap elemen dalam baris
                System.out.print(num + " "); // Menampilkan elemen matriks
            }
            System.out.println(); // Pindah ke baris baru setelah satu baris matriks ditampilkan
        }
    }

    // Method untuk penjumlahan matriks
    public static void additionOperation(Scanner scanner) {
        // Meminta input matriks A
        System.out.print("Input baris matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Input kolom matrix A: ");
        int colsA = scanner.nextInt();
        int[][] matrixA = inputMatrix(rowsA, colsA, scanner);

        // Meminta input matriks B
        System.out.print("Input baris matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Input kolom matrix B: ");
        int colsB = scanner.nextInt();
        int[][] matrixB = inputMatrix(rowsB, colsB, scanner);

        // Penjumlahan matriks A dan B
        if (rowsA != rowsB || colsA != colsB) {
            System.out.println("Matriks tidak dapat dijumlahkan karena ukurannya tidak sama.");
        } else {
            int[][] sum = addMatrices(matrixA, matrixB); // Memanggil method untuk penjumlahan matriks
            System.out.println("Hasil penjumlahan matriks A dan B:");
            printMatrix(sum); // Menampilkan hasil penjumlahan matriks
        }
    }

    // Method untuk transposisi matriks C
    public static void transposeOperation(Scanner scanner) {
        // Meminta input matriks C
        System.out.print("Input baris matrix C: ");
        int rowsC = scanner.nextInt();
        System.out.print("Input kolom matrix C: ");
        int colsC = scanner.nextInt();
        int[][] matrixC = inputMatrix(rowsC, colsC, scanner);

        // Transposisi matriks C
        int[][] transposeA = transposeMatrix(matrixC); // Memanggil method untuk transposisi matriks
        System.out.println("Hasil transposisi matriks C:");
        printMatrix(transposeA); // Menampilkan hasil transposisi matriks
    }

    // Method untuk perkalian matriks
    public static void multiplicationOperation(Scanner scanner) {
        // Meminta input matriks A
        System.out.print("Input baris matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Input kolom matrix A: ");
        int colsA = scanner.nextInt();
        int[][] matrixA = inputMatrix(rowsA, colsA, scanner);

        // Meminta input matriks B
        System.out.print("Input baris matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Input kolom matrix B: ");
        int colsB = scanner.nextInt();
        int[][] matrixB = inputMatrix(rowsB, colsB, scanner);

        // Perkalian matriks A dan B
        if (colsA != rowsB) {
            System.out.println("Perkalian matriks tidak memungkinkan karena jumlah kolom matriks A tidak sama dengan jumlah baris matriks B.");
        } else {
            int[][] product = multiplyMatrices(matrixA, matrixB); // Memanggil method untuk perkalian matriks
            System.out.println("Hasil perkalian matriks A dan B:");
            printMatrix(product); // Menampilkan hasil perkalian matriks
        }
    }

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols]; // Membuat array untuk menyimpan hasil penjumlahan matriks
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j]; // Menjumlahkan elemen matriks A dan B
            }
        }
        return result; // Mengembalikan hasil penjumlahan matriks
    }

    // Method untuk transposisi matriks
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows]; // Membuat array untuk menyimpan hasil transposisi matriks
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = matrix[j][i]; // Menukar baris dan kolom
            }
        }
        return result; // Mengembalikan hasil transposisi matriks
    }

    // Method untuk perkalian matriks
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB]; // Membuat array untuk menyimpan hasil perkalian matriks
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j]; // Melakukan perkalian matriks
                }
            }
        }
        return result; // Mengembalikan hasil perkalian matriks
    }
}
