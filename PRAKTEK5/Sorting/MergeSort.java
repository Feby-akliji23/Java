package PRAKTEK5.Sorting;

public class MergeSort {
    // Fungsi untuk menggabungkan dua bagian array yang telah diurutkan
    public static void merge(int arr[], int l, int m, int r) {
        // Hitung panjang dua subarray
        int n1 = m - l + 1;
        int n2 = r - m;
        // Buat dua array sementara untuk menyimpan subarray
        int L[] = new int[n1];
        int R[] = new int[n2];
        // Salin data dari array asli ke dua subarray sementara
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        // Inisialisasi indeks untuk subarray kiri, kanan, dan array hasil
        int i = 0, j = 0;
        int k = l;
        // Gabungkan dua subarray ke dalam array asli secara terurut
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i]; // Masukkan elemen dari subarray kiri
                i++;
            } else {
                arr[k] = R[j]; // Masukkan elemen dari subarray kanan
                j++;
            }
            k++;
        }//Feby Akliji Rofiah - A11.2022.14529
        // Tambahkan sisa elemen dari subarray kiri atau kanan jika ada
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        // Cetak array setiap kali ada perubahan
        printArray(arr);
    }

    
    // Fungsi untuk melakukan Merge Sort secara rekursif
    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
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
        // Cetak array awal sebelum sorting dimulai
        System.out.println("Initial Array:");
        printArray(arr);
        // Panggil fungsi Merge Sort
        mergeSort(arr, 0, arr.length - 1);
    }
}
