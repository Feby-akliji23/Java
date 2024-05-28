package PRAKTEK6.Transportasi;

public class Bicycle {
    //Feby Akliji Rofiah - A11.2022.14529
    int speed = 0;
    int gear = 0;

    //method
    void ChangeGear (int newValue){
        gear = gear + newValue;
        System.out.println("\nGear: "+ gear);
    }
    void speedUp (int increment){
        speed = speed + increment;
        System.out.println("\nSpeed: "+ speed);
    }
}
