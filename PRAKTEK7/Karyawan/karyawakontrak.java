package Karyawan;
import java.io.*;

public class karyawakontrak extends karyawanbru{
    double upahharian;//Feby Akliji Rofiah - A11.2022.14529
    int jumlahanak;
    int harimasuk;

    void inputkontrak() throws IOException
    {
        BufferedReader keyboard = new BufferedReader
        (new InputStreamReader(System.in));

        System.out.println("\n--Karyawan kontrak--\n");
        System.out.print("Upah harian \t: ");
        upahharian = Double.parseDouble(keyboard.readLine());
        System.out.print("jumlah masuk \t: ");
        harimasuk = Integer.parseInt(keyboard.readLine());
        System.out.print("jumlah anak \t: ");
        jumlahanak = Integer.parseInt(keyboard.readLine());

    }

    double totalupah()
    {
        return (harimasuk * upahharian) + (jumlahanak * (0.1 * (harimasuk*upahharian)));
    }
}
