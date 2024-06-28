package Mable;
// Mendefinisikan kelas Almari yang merupakan turunan dari Mebel
class Almari extends Mebel {
    boolean roda;
    
    public Almari(int harga, String bahan, boolean roda) {
        super(harga, bahan);
        this.roda = roda;
    }
}