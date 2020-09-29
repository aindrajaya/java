package belajar.java.fundamental;

import java.util.Date;

import training.internet.education.Siswa;

public class Halo {

	private Date sekarang = new Date();
	
	public void sapa(String nama){
		System.out.println("Halo " + nama);
	}	
	
	public void tampilWaktu(){
		System.out.println("Waktu sekarang : "+sekarang);
	}
	
	public static void main(String[] args) {
		System.out.println("Menjalankan method main");
		
		//ex. Class Variable
		System.out.println("Jumlah Siswa Awal : "+Siswa.jumlahSiswa);
		Siswa.tampilkanJumlahSiswa();
		
		Siswa s = new Siswa();
		s.setNama("Rudiansyah"); 
		//ex. instance/object variable
		System.out.println("Halo "+s.getNama());
		//ex. Class Variable
		System.out.println("Jumlah Siswa : "+Siswa.jumlahSiswa);
		s.getNama();

		Siswa s2 = new Siswa();
		s2.setNama("Rudiansyahdu");
		//ex. instance/object variable
		System.out.println("Halo "+s2.getNama());
		//ex. Class Variable
		System.out.println("Jumlah Siswa : "+Siswa.jumlahSiswa);
		
		Siswa.tampilkanJumlahSiswa();
	}

}
