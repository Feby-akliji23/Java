package Mable;
// Mendefinisikan kelas MejaTamu yang merupakan turunan dari Meja dan mengimplementasikan Discountable
class MejaTamu extends Meja implements Discountable {
    String bentukKaca;
    
    public MejaTamu(int harga, String bahan, int jmlKaki, String bentukKaca) {
        super(harga, bahan, jmlKaki);
        this.bentukKaca = bentukKaca;
    }
    
    @Override
    public void discount(int harga) {
        this.harga -= harga;
    }
}