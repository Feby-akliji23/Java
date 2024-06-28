package PRAKTEK8.Hewan;

public class Paus extends Hewan {

    public Paus() {
        super("Mamalia", "Besar dan hidup di air");
    }

    @Override
    public void suara() {
        System.out.println("Paus bersuara...");
    }

    @Override
    public void berjalan() {
        System.out.println("Paus berenang di laut...");
    }

    @Override
    public void bernafas() {
        System.out.println("Paus bernafas dengan paru-paru...");
    }
}