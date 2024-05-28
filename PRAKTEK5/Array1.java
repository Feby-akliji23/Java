package PRAKTEK5;

public class Array1 {//Feby Akliji Rofiah - A11.2022.14529
    public static void main(String[] args) {
        int[] x;
        x = new int[5];

        x[0] = 68;
        x[1] = 7;
        x[2] = 28;
        x[3] = 90;
        x[4] = 32;

        System.out.println("Jumlah Data: " + x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Data ke - " + (i + 1) + " = " + x[i]);
        }
        
        System.out.println("Hasil nilai [0] = " + x[0]);
        System.out.println("Hasil nilai [1] = " + x[1]);
        System.out.println("Hasil nilai [2] = " + x[2]);
        System.out.println("Hasil nilai [3] = " + x[3]);
        System.out.println("Hasil nilai [4] = " + x[4]);
    }
}
