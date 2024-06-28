package Mable;
// Mendefinisikan kelas MejaMakan yang merupakan turunan dari Meja
class MejaMakan extends Meja {
    int jmlKursi;
    
    public MejaMakan(int harga, String bahan, int jmlKaki, int jmlKursi) {
        super(harga, bahan, jmlKaki);
        this.jmlKursi = jmlKursi;
    }
}