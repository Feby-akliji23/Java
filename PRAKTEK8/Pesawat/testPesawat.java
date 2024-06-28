package PRAKTEK8.Pesawat;

public class testPesawat {
    public static void main(String[] args) {
        pesawat pesawat1 = new pesawat();
        System.out.println("...airbus...");
        pesawat1.terbang();
        pesawat1.mendarat();

        pesawat pesawat2 = new pesawat();
        System.out.println("...fl16...");
        pesawat2.terbang();
        pesawat2.mendarat();

        pesawatTempur pesawatTempur = new pesawatTempur();
        System.out.println("...fl16...");
        pesawatTempur.terbang();
        pesawatTempur.mendarat();
        pesawatTempur.manuver();
    }
}
