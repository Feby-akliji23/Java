package ZooAbstack;

// Zoo3Abstract.java
abstract class Binatang {  // abstract class
    abstract void makan();  // abstract method
    abstract void tidur();
    void mati() {
        System.out.println("mati............");
    }
}

class Harimau extends Binatang {
    void makan() {
        System.out.println("harimau makan............");
    }

    void tidur() {
        System.out.println("harimau tidur............");
    }
}

class Bebek extends Binatang {
    void makan() {
        System.out.println("bebek makan............");
    }

    void tidur() {
        System.out.println("bebek tidur............");
    }
}

public class Zoo3Abstract {
    static void test(Binatang a) {
        a.makan();
        a.tidur();
        a.mati();
    }

    public static void main(String[] args) {
        Harimau macan = new Harimau();
        Bebek donald = new Bebek();
        // Binatang b = new Binatang();
        // --> error abstract class tdk bisa dibuat object
        test(macan);
        test(donald);
    }
}
