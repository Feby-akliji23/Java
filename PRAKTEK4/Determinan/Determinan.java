package PRAKTEK4.Determinan;

import java.util.Scanner;
//Feby Akliji Rofiah - A11.2022.14529
public class Determinan {
   int a;
   int b;
   int c;
   long d;
   double x1;
   double x2;
   Scanner myObj;

   public Determinan() {
      this.myObj = new Scanner(System.in);
   }

   void inputData() {
      System.out.println("a : ");
      this.a = this.myObj.nextInt();
      System.out.println("b : ");
      this.b = this.myObj.nextInt();
      System.out.println("c : ");
      this.c = this.myObj.nextInt();
   }

   void hitungD() {
      this.d = (long)(this.b * this.b - 4 * this.a * this.c);
   }

   void hitungX() {
      if (this.d > 0L) {
         this.x1 = ((double)(-this.b) + Math.sqrt((double)this.d)) / (double)(2 * this.a);
         this.x2 = ((double)(-this.b) - Math.sqrt((double)this.d)) / (double)(2 * this.a);
      } else if (this.d == 0L) {
         this.x1 = this.x2 = (double)(-this.b / (2 * this.a));
      } else {
         this.x1 = (double)(-this.b / (2 * this.a)) + Math.sqrt((double)(-this.d)) / (double)(2 * this.a);
         this.x2 = (double)(-this.b / (2 * this.a)) + Math.sqrt((double)(-this.d)) / (double)(2 * this.a);
      }

   }

   void cetak() {
      System.out.println("D : " + this.d);
      System.out.println("X1 : " + this.x1);
      System.out.println("X2 : " + this.x2);
   }

    
}
