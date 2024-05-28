package PRAKTEK5.Sorting;

public class QuickSort {
    // Fungsi untuk melakukan Quick Sort
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {//Feby Akliji Rofiah - A11.2022.14529
            // Temukan posisi pivot
            int pi = partition(arr, low, high);
            // Urutkan elemen-elemen sebelum dan setelah pivot secara rekursif
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Fungsi untuk membagi array dan mengembalikan posisi pivot
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Tukar posisi elemen ke-i dan ke-j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Tukar posisi elemen pivot dengan elemen ke-(i+1)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
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
        // Cetak array awal sebelum sorting dimulai
        System.out.println("Initial Array:");
        printArray(arr);
        // Panggil fungsi Quick Sort
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

