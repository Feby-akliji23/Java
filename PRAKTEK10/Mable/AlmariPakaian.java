package Mable;
// Mendefinisikan kelas AlmariPakaian yang merupakan turunan dari Almari dan mengimplementasikan Discountable
class AlmariPakaian extends Almari implements Discountable {
    int jmlPintu;
    
    public AlmariPakaian(int harga, String bahan, boolean roda, int jmlPintu) {
        super(harga, bahan, roda);
        this.jmlPintu = jmlPintu;
    }
    
    @Override
    public void discount(int harga) {
        this.harga -= harga;
    }
}