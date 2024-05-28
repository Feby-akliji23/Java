package BangunRuang;
import java.util.Scanner; // library java untuk membaca input

public class kubus {
    public static void main(String[] args) {//Feby Akliji Rofiah - A11.2022.14529

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        // sanner membaca input

        System.out.print("Masukkan sisi kubus   : ");
        double s = scanner.nextInt();

        double luas = 6 * (s*s); // 6 ( s x s )
        double keliling =  2 * s; // 12 x s 

        System.out.printf("\n");
        System.out.println("Luas       : "+luas); 
        System.out.println("Keliling   : "+keliling); 
    }
}
