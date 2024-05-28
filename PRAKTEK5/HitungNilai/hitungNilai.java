package PRAKTEK5.HitungNilai;

public class hitungNilai {

    // Kelas untuk merepresentasikan data siswa
    static class Siswa {//Feby Akliji Rofiah - A11.2022.14529
        String nim;
        String nama;
        double nilaiUts;
        double nilaiTugas;
        double nilaiUas;
        double nilaiTugasFix;
        double nilaiUtsFix;
        double nilaiUasFix;
        double nilaiAkhirFix;

        // Konstruktor untuk membuat objek Siswa
        Siswa(String nim, String nama, double nilaiUts, double nilaiTugas, double nilaiUas) {
            this.nim = nim;
            this.nama = nama;
            this.nilaiUts = nilaiUts;
            this.nilaiTugas = nilaiTugas;
            this.nilaiUas = nilaiUas;

            // Perhitungan nilai fix berdasarkan proporsi
            this.nilaiTugasFix = 0.35 * nilaiTugas;
            this.nilaiUtsFix = 0.20 * nilaiUts;
            this.nilaiUasFix = 0.45 * nilaiUas;
            this.nilaiAkhirFix = 0.20 * nilaiUts + 0.35 * nilaiTugas + 0.45 * nilaiUas;
        }
    }

    // Method untuk menampilkan data nilai siswa
    public static void daftarNilai(Siswa[] siswaArray) {
        System.out.println("\nDaftar Nilai:");

        // Iterasi untuk setiap siswa dalam array
        for (int i = 0; i < siswaArray.length; i++) {
            System.out.println("\nData Siswa ke-" + (i + 1) + ":");
            System.out.println("NIM           : " + siswaArray[i].nim);
            System.out.println("Nama          : " + siswaArray[i].nama);
            System.out.printf("Nilai Tugas   : %.1f (20%%) \t: %.1f\n", siswaArray[i].nilaiTugas, siswaArray[i].nilaiTugasFix);
            System.out.printf("Nilai UTS     : %.1f (35%%) \t: %.1f\n", siswaArray[i].nilaiUts, siswaArray[i].nilaiUtsFix);
            System.out.printf("Nilai UAS     : %.1f (45%%) \t: %.1f\n", siswaArray[i].nilaiUas, siswaArray[i].nilaiUasFix);
            System.out.printf("Nilai Akhir   : %.1f\n", siswaArray[i].nilaiAkhirFix);
        }
    }

    
}

