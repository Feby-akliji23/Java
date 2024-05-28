package Karyawan;
import java.io.*;//Feby Akliji Rofiah - A11.2022.14529

public class karyawanbru {
    String nip;
    String nama;
    int statuspegawai;

    void inputkaryawan() throws IOException
{
    BufferedReader keyboard = new BufferedReader
    (new InputStreamReader(System.in));
    System.out.println("--Data Karyawan--\n");
    System.out.print("NIP \t: ");
    nip = keyboard.readLine();
    System.out.print("Nama \t: ");
    nama = keyboard.readLine();
    System.out.print("Status Pegawai \t: ");
    statuspegawai=Integer.parseInt(keyboard.readLine());
    }
}



