package PRAKTEK3.Suhu;

public class Suhu {
    int c;
    float hasil;

    public Suhu (int c)
    {   //Feby Akliji Rofiah - A11.2022.14529
        this.c=c;
    }

    void cKelvin(int c)
    {
        hasil = c + 273.15f;
        System.out.println(c + "° Kelvin\t :"+hasil+" °K");
    }
    void cFahrenheit(int c)
    {
        hasil = c + 273.15f;
        System.out.println(c + "° Fahrenheit\t :"+hasil+" °F");
    }
    
    void cRankine(int c)
    {
        hasil = c * 1.8f + 491.67f;
        System.out.println(c + "° Rankine\t :"+hasil+" °Ra");
    }

    void cDelisle(int c)
    {
        hasil = (100- c) * 1.5f;
        System.out.println(c + "° Delisle\t :"+hasil+" °De");
     }

    void cNewton(int c)
    {
        hasil = c * 33/100;
        System.out.println(c + "° Newton\t :"+hasil+" °N");
    }

    void cReamur(int c)
    {
        hasil = c * 0.8f;
        System.out.println(c + "° Reamur\t :"+hasil+" °Re");
    }

    void cRomer(int c)
    {
        hasil = c * 21/40 + 7.5f;
        System.out.println(c + "° Romer\t :"+hasil+" °Ro");
    }
}
    