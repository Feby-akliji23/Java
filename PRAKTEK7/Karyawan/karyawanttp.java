package Karyawan;
import java.io.*;

public class karyawanttp extends karyawanbru {
    double gajipokok;//Feby Akliji Rofiah - A11.2022.14529
    int jumlahanak;
    
    void inputtetap() throws IOException
    {
        BufferedReader keyboard = new BufferedReader
        (new InputStreamReader(System.in));
        
        System.out.println("\n--Karyawan Tetap--\n");
        System.out.print("Gaji pokok \t: ");
        gajipokok = Double.parseDouble(keyboard.readLine());
        System.out.print("Jumlah anak \t: ");
        jumlahanak = Integer.parseInt(keyboard.readLine());
    }
 
    double totalgaji()
    {
        return gajipokok + (jumlahanak * (0.1 *gajipokok));
    }
}