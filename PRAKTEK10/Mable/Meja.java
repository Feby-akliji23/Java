package Mable;
// Mendefinisikan kelas Meja yang merupakan turunan dari Mebel
class Meja extends Mebel {
    int jmlKaki;
    
    public Meja(int harga, String bahan, int jmlKaki) {
        super(harga, bahan);
        this.jmlKaki = jmlKaki;
    }
}
