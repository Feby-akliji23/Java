package PRAKTEK4.Determinan;

import java.util.Scanner;
//Feby Akliji Rofiah - A11.2022.14529
public class DeterminanDemo {
   public DeterminanDemo() {
   }

   public static void main(String[] args) {
      Determinan determinan = new Determinan();
      Scanner input = new Scanner(System.in);

      for(char jawaban = 'Y'; jawaban == 'Y' || jawaban == 'y'; jawaban = input.next().charAt(0)) {
         determinan.inputData();
         determinan.hitungD();
         determinan.hitungX();
         determinan.cetak();
         System.out.println("Input data lagi [Y/T] ?");
      }

      input.close();
   }
}

