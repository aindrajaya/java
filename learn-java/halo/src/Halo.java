package belajar.java.fundamental;

import java.util.Date;
import training.internet.education.Siswa;

public class Halo {
    private Date sekarang = new Date();

    public void sapa(String nama){
        System.out.println("Halo " + nama);
    }

    public void tampilWaktu(){
        System.out.println("Waktu sekarang : " + sekarang);
    }

    public static void main(String[] x){
        System.out.println("Memuat main method");

        Siswa s = new Siswa("Rudiansyah");
        System.out.println("Halo "+s.getNama());
    }
}
