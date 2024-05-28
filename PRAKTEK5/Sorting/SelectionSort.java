package PRAKTEK5.Sorting;

public class SelectionSort {
    // Fungsi untuk melakukan Selection Sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;//Feby Akliji Rofiah - A11.2022.14529
        // Cetak array awal sebelum sorting dimulai
        System.out.println("Initial Array:");
        printArray(arr);
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                // Temukan elemen terkecil di antara elemen-elemen yang belum diurutkan
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Tukar elemen ke-i dengan elemen terkecil
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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
        // Panggil fungsi Selection Sort
        selectionSort(arr);
    }
}
