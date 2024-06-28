package PRAKTEK8.Hewan;

public class Singa extends Hewan {

    public Singa() {
        super("Mamalia", "Besar dan berbulu");
    }

    @Override
    public void suara() {
        System.out.println("Singa mengaum...");
    }

    @Override
    public void berjalan() {
        System.out.println("Singa berjalan dengan empat kaki...");
    }

    @Override
    public void bernafas() {
        System.out.println("Singa bernafas dengan paru-paru...");
    }
}