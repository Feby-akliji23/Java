package PRAKTEK8.Hewan;

public class Elang extends Hewan {

    public Elang() {
        super("Burung", "Memiliki sayap dan paruh tajam");
    }

    @Override
    public void suara() {
        System.out.println("Elang berbunyi...");
    }

    @Override
    public void berjalan() {
        System.out.println("Elang terbang di udara...");
    }

    @Override
    public void bernafas() {
        System.out.println("Elang bernafas dengan paru-paru...");
    }
}