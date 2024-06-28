package PRAKTEK8.Matematika;

public class Matematika {
    int a, b, c, d, e;
    double hasil;
    //Feby Akliji Rofiah - A11.2022.14529
    // Method untuk operasi dengan int
    void pertambahan() {
        hasil = a + b;
        System.out.println("Pertambahan\t" + a + " + " + b + " = " + hasil);
    }

    void pengurangan() {
        hasil = c - d;
        System.out.println("Pengurangan\t" + c + " - " + d + " = " + hasil);
    }

    void perkalian() {
        hasil = c * a;
        System.out.println("Perkalian\t" + c + " x " + a + " = " + hasil);
    }

    void pembagian() {
        hasil = a / e;
        System.out.println("Pembagian\t" + a + " / " + e + " = " + hasil);
    }

    double i, j, k, l, m;

    // Method untuk operasi dengan double
    void addition() {
        hasil = i + j;
        System.out.println("\nPertambahan\t" + i + " + " + j + " = " + hasil);
    }

    void subtraction() {
        hasil = k - l;
        System.out.println("Pengurangan\t" + k + " - " + l + " = " + hasil);
    }

    void multiplication() {
        hasil = l * m;
        System.out.println("Perkalian\t" + l + " x " + m + " = " + hasil);
    }

    void division() {
        hasil = k / m;
        System.out.println("Pembagian\t" + k + " / " + m + " = " + hasil);
    }

    // Overloading method untuk operasi dengan tiga parameter double
    void pertambahan(double x, double y, double z) {
        hasil = x + y + z;
        System.out.println("Pertambahan\t" + x + " + " + y + " + " + z + " = " + hasil);
    }

    void pengurangan(double x, double y, double z) {
        hasil = x - y - z;
        System.out.println("Pengurangan\t" + x + " - " + y + " - " + z + " = " + hasil);
    }

    void perkalian(double x, double y, double z) {
        hasil = x * y * z;
        System.out.println("Perkalian\t" + x + " x " + y + " x " + z + " = " + hasil);
    }

    void pembagian(double x, double y, double z) {
        hasil = x / y / z;
        System.out.println("Pembagian\t" + x + " / " + y + " / " + z + " = " + hasil);
    }
}
