package PRAKTEK6.latihan2.id.ac.dinus;

import PRAKTEK6.latihan2.id.ac.dinus.lib.YourLib;
import PRAKTEK6.latihan2.id.ac.dinus.lib.MyLib;
import PRAKTEK6.latihan2.id.ac.dinus.test.*;

public class AksesLib2 {
    public static void main(String[] a)
    {
        MyLib m=new MyLib(); m.cetak();
        YourLib y=new YourLib(); y.cetak2();
        HisLib h=new HisLib(); h.cetak3();
    }

}
