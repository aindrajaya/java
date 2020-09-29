package belajar.java.fundamental;

import java.util.Date;
import training.internet.education.Siswa;

public class Halo{
    private Date sekarang = new Date();

    public void sapa(String nama){
        System.out.println("Hallo" + nama);
    }

    public void tampilkanWaktu(){
        System.out.println("Waktu sekarang : " + sekarang);
    }

    public static void main(String[] x){
        Siswa s = new Siswa("Rudi");
        System.out.println("Menjalankan method main");
        System.out.println("Halo "+ s.getNama());
    }
}