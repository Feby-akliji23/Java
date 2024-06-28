package Mable;
// Mendefinisikan kelas AlmariMakan yang merupakan turunan dari Almari dan mengimplementasikan Discountable
class AlmariMakan extends Almari implements Discountable {
    int jmlRoda;
    
    public AlmariMakan(int harga, String bahan, boolean roda, int jmlRoda) {
        super(harga, bahan, roda);
        this.jmlRoda = jmlRoda;
    }
    
    @Override
    public void discount(int harga) {
        this.harga -= harga;
    }
}