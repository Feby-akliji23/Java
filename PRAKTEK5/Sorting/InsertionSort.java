package PRAKTEK5.Sorting;

public class InsertionSort {
    // Fungsi untuk melakukan Insertion Sort
    public static void insertionSort(int arr[]) {
        int n = arr.length;//Feby Akliji Rofiah - A11.2022.14529
        // Cetak array awal sebelum sorting dimulai
        System.out.println("Initial Array:");
        printArray(arr);
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            // Pindahkan angka-angka yang lebih besar dari key ke kanan
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            // Cetak array setiap kali ada perubahan
            printArray(arr);
        }
    }
    
    // Fungsi untuk mencetak array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] = {7, 1, 3, 5, 2};
        // Panggil fungsi Insertion Sort
        insertionSort(arr);
    }
}
