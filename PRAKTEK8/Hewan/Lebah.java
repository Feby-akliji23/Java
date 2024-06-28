package PRAKTEK8.Hewan;

public class Lebah extends Hewan {

    public Lebah() {
        super("Serangga", "Kecil dan memiliki sengat");
    }

    @Override
    public void suara() {
        System.out.println("Lebah berdengung...");
    }

    @Override
    public void berjalan() {
        System.out.println("Lebah terbang di udara...");
    }

    @Override
    public void bernafas() {
        System.out.println("Lebah bernafas melalui trakea...");
    }
}