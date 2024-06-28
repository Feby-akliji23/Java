package PRAKTEK8.Matematika;

public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        //Feby Akliji Rofiah - A11.2022.14529
        // Operasi dengan int
        mtk.a = 20;
        mtk.b = 20;
        mtk.c = 10;
        mtk.d = 5;
        mtk.e = 2;
        mtk.pertambahan();
        mtk.pengurangan();
        mtk.perkalian();
        mtk.pembagian();

        // Operasi dengan double
        mtk.i = 30;
        mtk.j = 40;
        mtk.k = 50;
        mtk.l = 9;
        mtk.m = 12;
        mtk.addition();
        mtk.subtraction();
        mtk.multiplication();
        mtk.division();

        // Uji method overloading dengan tiga parameter double
        double x = 12.5;
        double y = 28.7;
        double z = 14.2;
        mtk.pertambahan(x, y, z);
        mtk.pengurangan(x, y, z);
        mtk.perkalian(x, y, z);
        mtk.pembagian(x, y, z);
    }
}
