package PRAKTEK8.Hewan;

public abstract class Hewan {
    String jenis;
    String ciri;

    public Hewan(String jenis, String ciri) {
        this.jenis = jenis;
        this.ciri = ciri;
    }

    public abstract void suara();
    public abstract void berjalan();
    public abstract void bernafas();
}