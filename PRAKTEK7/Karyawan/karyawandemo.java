package Karyawan;
import java.io.*;
import java.text.DecimalFormat;

public class karyawandemo {//Feby Akliji Rofiah - A11.2022.14529
    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("###, ###, ##0.00");
        karyawanbru kar = new karyawanbru();
        karyawanttp ttp = new karyawanttp();
        karyawakontrak kntrk = new karyawakontrak();

        kar.inputkaryawan();
        if (kar.statuspegawai == 1) {
            ttp.inputtetap();
            System.out.println("gaji diterima :" + df.format(ttp.totalgaji()));
        }else
        {
            kntrk.inputkontrak();
            System.out.println("upah diterima : " + df.format(kntrk.totalupah()));
        }
    }
}
