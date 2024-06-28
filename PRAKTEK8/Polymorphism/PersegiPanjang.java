package PRAKTEK8.Polymorphism;

//Polymorphism

public class PersegiPanjang {
    double p, l, luas;
    void hitungLuas(){
        luas = p*l;
    }
    void cetak(){
        System.err.println("Panjang\t:  "+p);
        System.err.println("Lebar\t:  "+l);
        System.err.println("Luas\t:  "+luas);
    }
}
