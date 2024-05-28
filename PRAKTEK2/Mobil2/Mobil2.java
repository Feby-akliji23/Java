package PRAKTEK2.Mobil2;

public class Mobil2 {//Feby Akliji Rofiah - A11.2022.14529

    public String merek1;
    public String merek2;
    public String warna;
    public String maju;
    public String mundur;
    public String belok;
    public String rodaAvanza;
    public String rodaXenia;
    public String mesinAvanza;
    public String mesinXenia;
    public String rodaAvanza2;
    public String rodaXenia2;
    public String mesinAvanza2;
    public String mesinXenia2;
    public String mesinAvanza3;
    public String mesinXenia3;

    public void Mobilku (String merek1, String merek2, String warna, String maju, String mundur, String belok, String rodaAvanza, 
                        String rodaXenia, String mesinAvanza, String mesinXenia, String rodaAvanza2, String rodaXenia2, String mesinAvanza2, 
                        String mesinXenia2, String mesinAvanza3, String mesinXenia3)

    {
        this.merek1 = merek1;
        this.merek2 = merek2;
        this.warna = warna;
        this.mundur = mundur;
        this.belok = belok;
        this.rodaAvanza = rodaAvanza;
        this.rodaXenia = rodaXenia;
        this.mesinAvanza = mesinAvanza;
        this.mesinXenia = mesinXenia;
        this.rodaAvanza2 = rodaAvanza2;
        this.rodaXenia2 = rodaXenia2;
        this.mesinAvanza2 = mesinAvanza2;
        this.mesinXenia2 = mesinXenia2;
        this.mesinAvanza3 = mesinAvanza3;
        this.mesinXenia3 = mesinXenia3;
        
    }

    public void info (){

        System.out.println("Hidupkan Mobil : "+ this.merek1 + " "+this.warna);
        System.out.println("Ubah Gigi Mobil : " + this.merek1 + " " +this.warna );
        System.out.println(this.maju);
        System.out.println(this.mundur );
        System.out.println(this.belok );
        System.out.println("Roda Avanza : " + this.rodaAvanza );
        System.out.println("Roda Xenia : " + this.rodaXenia);
        System.out.println("Mesin Avanza : " + this.mesinAvanza );
        System.out.println("Mesin Xenia : " + this.mesinXenia );
        System.out.println("Roda Avanza : " + this.rodaAvanza2 );
        System.out.println("Roda Xenia : " + this.rodaXenia2);
        System.out.println("Mesin Avanza : " + this.mesinAvanza2 );
        System.out.println("Mesin Xenia : " + this.mesinXenia2 );
        System.out.println("Mesin Avanza : " + this.mesinAvanza3 );
        System.out.println("Mesin Xenia : " + this.mesinXenia3 );
        System.out.println("Matikan Mobil : " + this.merek1 +" "+ this.warna );
    }
}
