package BangunRuang;
import java.util.Scanner; // library java untuk membaca input

public class persegi {
    public static void main(String[] args) { //Feby Akliji Rofiah - A11.2022.14529
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        // sanner membaca input

        System.out.print("Masukkan sisi persegi   : "); 
        // memasukan angka ynang diinginkan

        int sisi = scanner.nextInt();
        //membaca dan menyimpan ke dalam variabel sisi 

        int luas = sisi * sisi;
        int keliling = 4 * sisi;

        System.out.println("Luas       : "+luas); 
        System.out.println("Keliling   : "+keliling); 
        
    }
}
