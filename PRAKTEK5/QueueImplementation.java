package PRAKTEK5;

import java.util.LinkedList; // Import library LinkedList untuk mengimplementasikan Queue
import java.util.Queue; // Import library Queue untuk menggunakan struktur data Queue
import java.util.Scanner; // Import library Scanner untuk menerima input dari pengguna

public class QueueImplementation {//Feby Akliji Rofiah - A11.2022.14529
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna
        Queue<Integer> queue = new LinkedList<>(); // Membuat objek Queue dengan menggunakan LinkedList dari Java Util

        char choice; // Variabel untuk menyimpan pilihan pengguna (y/n)
        do {
            System.out.println("\nQueue Operations"); // Menampilkan menu operasi Queue
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.print("Your Choice? ");
            int option = scanner.nextInt(); // Menerima pilihan operasi dari pengguna

            switch (option) {
                case 1:
                    System.out.print("Enter number of elements to insert: ");
                    int numElements = scanner.nextInt(); // Menerima jumlah elemen yang ingin dimasukkan oleh pengguna
                    for (int i = 0; i < numElements; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        int element = scanner.nextInt(); // Menerima elemen yang ingin dimasukkan oleh pengguna
                        queue.offer(element); // Menambahkan elemen ke dalam Queue
                    }
                    break;
                case 2:
                    if (!queue.isEmpty()) { // Memeriksa apakah Queue tidak kosong sebelum menghapus elemen
                        int removedElement = queue.poll(); // Menghapus dan mengembalikan elemen dari depan Queue
                        System.out.println("Removed Element: " + removedElement); // Menampilkan elemen yang dihapus
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) { // Memeriksa apakah Queue tidak kosong sebelum melihat elemen teratas
                        int peekedElement = queue.peek(); // Melihat elemen teratas tanpa menghapusnya
                        System.out.println("Peeked Element: " + peekedElement); // Menampilkan elemen teratas
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 4:
                    if (queue.isEmpty()) { // Memeriksa apakah Queue kosong
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("Queue cannot become full."); // Queue tidak pernah menjadi penuh dalam implementasi ini
                    break;
                case 6:
                    System.out.println("Size = " + queue.size()); // Mendapatkan jumlah elemen dalam Queue
                    System.out.println("Queue = " + queue); // Menampilkan seluruh isi Queue
                    break;
                default:
                    System.out.println("Invalid option."); // Menampilkan pesan jika opsi yang dimasukkan tidak valid
            }

            System.out.print("Do you want to continue (Type y or n)? ");
            choice = scanner.next().charAt(0); // Meminta pengguna untuk melanjutkan atau berhenti
        } while (choice == 'y' || choice == 'Y'); // Melakukan loop jika pengguna ingin melanjutkan

        scanner.close(); // Menutup objek scanner setelah selesai digunakan
    }
}
