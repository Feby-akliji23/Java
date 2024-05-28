package PRAKTEK5;

import java.util.Scanner;

public class Faktorial{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan\t : ");
        int bilangan = scanner.nextInt();//Feby Akliji Rofiah - A11.2022.14529
        
        int faktorial = 1;
        // Menghitung faktorial menggunakan loop dan menampilkan setiap langkah
        for (int i = 2; i <= bilangan; i++) {
            System.out.print((i - 1) + " x " + i + "\t = " + faktorial * i + "\n");
            faktorial *= i;
        }
    }
}
