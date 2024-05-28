package BangunRuang;
import java.util.Scanner; // library java untuk membaca input

public class segitiga {
    public static void main(String[] args) {//Feby Akliji Rofiah - A11.2022.14529
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        // sanner membaca input

        System.out.print("Masukkan alas segitiga   : ");
        int alas = scanner.nextInt();

        System.out.print("Masukkan tinggi segitiga   : ");
        int tinggi = scanner.nextInt();
        
        System.out.printf("\n" + "Masukkan sisi A, B, C segitiga");
        System.out.printf("\n"+"Masukkan sisi A   : "); 
        int sisiA = scanner.nextInt();
        System.out.print("Masukkan sisi B   : "); 
        int sisiB = scanner.nextInt();
        System.out.print("Masukkan sisi C   : "); 
        int sisiC = scanner.nextInt();

        float luas = 0.5f * alas * tinggi;
        float keliling =  sisiA + sisiB + sisiC;

        System.out.printf("\n");
        System.out.println("Luas       : "+luas); 
        System.out.println("Keliling   : "+keliling); 
    }
}
