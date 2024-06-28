package Mable;
public class DemoMable {
    public static void main(String[] args) {
        AlmariMakan almariMakan = new AlmariMakan(1000, "Kayu", true, 4);
        almariMakan.discount(100);
        System.out.printf("Harga AlmariMakan setelah diskon: %d%n", almariMakan.harga);

        MejaTamu mejaTamu = new MejaTamu(500, "Kayu", 4, "Bulat");
        mejaTamu.discount(50);
        System.out.printf("Harga MejaTamu setelah diskon: %d%n", mejaTamu.harga);
    }
}
