package PRAKTEK5.Sorting;

public class BubbleSort {
    // Fungsi untuk melakukan Bubble Sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;//Feby Akliji Rofiah - A11.2022.14529
        // Cetak array awal sebelum sorting dimulai
        System.out.println("Initial Array:");
        printArray(arr);
        // Lakukan iterasi sebanyak (panjang array - 1) kali
        for (int i = 0; i < n-1; i++) {
            // Lakukan iterasi dalam sebanyak (panjang array - i - 1) kali
            for (int j = 0; j < n-i-1; j++) {
                // Jika angka sebelum lebih besar dari angka setelahnya, tukar posisi keduanya
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // Cetak array setiap kali ada pertukaran posisi
                    printArray(arr);
                }
            }
        }
    }
    
    // Fungsi untuk mencetak array
    public static void printArray(int arr[]) {
    // Iterasi melalui setiap elemen dalam array
        for (int i = 0; i < arr.length; i++) {
            // Cetak elemen array ke konsol dengan spasi di antara setiap elemen
            System.out.print(arr[i] + " ");
        }
        // Cetak baris baru setelah mencetak semua elemen array
        System.out.println();
    }

    public static void main(String args[]) {
    // Inisialisasi array dengan elemen-elemen yang diberikan
        int arr[] = {7, 1, 3, 5, 2};
        // Panggil fungsi Bubble Sort dan berikan array sebagai argumennya
        bubbleSort(arr);
    }


    
}
