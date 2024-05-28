package PRAKTEK2.Mobil1;

public class TesMobil {
    public static void main(String[] args) {//Feby Akliji Rofiah - A11.2022.14529
        Mobil avanza = new Mobil();
        Mobil.maju(); // the static method maju() from the type of Mobil should be accesed in a static way
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda        : "+ avanza.roda);
        System.out.println("Mesin        : "+ Mobil.mesin); // the static field Mobil.mesin should be accesed in a static way
    }
}
