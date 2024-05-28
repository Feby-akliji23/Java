package BangunRuang;
import java.util.Scanner; // library java untuk membaca input

public class lingkaran {
    public static void main(String[] args) {//Feby Akliji Rofiah - A11.2022.14529

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        // sanner membaca input

        System.out.print("Masukkan jari-jari lingkaran   : ");
        double r = scanner.nextInt();

        double phi = 3.14;

        double luas = phi * Math.pow(r, 2); // phi x r pangkat2
        double keliling =  2 * phi * r; // 2 x phi x r

        System.out.printf("\n");
        System.out.println("Luas       : "+luas); 
        System.out.println("Keliling   : "+keliling); 
    }
}
