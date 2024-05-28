package PRAKTEK4;

import java.util.Scanner;
//Feby Akliji Rofiah - A11.2022.14529
public class Penjualan {
   private String kode;
   private String nama;
   private float harga;
   private int jumlah;

   public Penjualan() {
   }

   public void setData(String kode, String nama, float harga, int jumlah) {
      this.kode = kode;
      this.nama = nama;
      this.harga = harga;
      this.jumlah = jumlah;
   }

   public float getTotalPembelian() {
      return this.harga * (float)this.jumlah;
   }

   public String getBonus() {
      float totalPembelian = this.getTotalPembelian();
      if (totalPembelian >= 500000.0F && this.jumlah > 5) {
         return "Setrika";
      } else if (totalPembelian >= 100000.0F && this.jumlah > 3) {
         return "Payung";
      } else {
         return !(totalPembelian >= 50000.0F) && this.jumlah <= 2 ? "Tidak ada bonus" : "Ballpoint";
      }
   }

   public void cetakNota() {
      System.out.println("========== NOTA PEMBELIAN ==========");
      System.out.println("Kode Barang: " + this.kode);
      System.out.println("Nama Barang: " + this.nama);
      System.out.println("Harga Barang: " + this.harga);
      System.out.println("Jumlah Barang: " + this.jumlah);
      System.out.println("Total Pembelian: " + this.getTotalPembelian());
      System.out.println("Bonus: " + this.getBonus());
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Penjualan penjualan = new Penjualan();

      char input;
      do {
         do {
            System.out.println("Masukkan kode barang: ");
            String kode = scanner.nextLine();
            System.out.println("Masukkan nama barang: ");
            String nama = scanner.nextLine();
            System.out.println("Masukkan harga barang: ");
            float harga = scanner.nextFloat();
            System.out.println("Masukkan jumlah barang: ");
            int jumlah = scanner.nextInt();
            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();
            System.out.println("Input data lagi [Y/T] ?");
            input = scanner.next().charAt(0);
            scanner.nextLine();
         } while(input == 'Y');
      } while(input == 'y');

      System.out.println("Terima kasih!");
      scanner.close();
   }
}

