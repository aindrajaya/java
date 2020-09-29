package belajar.java.fundamental;

import java.io.IOException;
import java.util.List;

import training.internet.education.Siswa;
import training.internet.education.helper.SiswaFileImporter;

public class DemoBacaFile {
	public static void main(String[] args) throws IOException {
		SiswaFileImporter si = new SiswaFileImporter("src/main/resources/daftar-siswa.txt");
		List<Siswa> hasilImport = si.proses();
		System.out.println(hasilImport.size() +" data berhasil di import");
		
		for(Siswa x : hasilImport){
			System.out.println("Nomor : "+x.getNomor());
			System.out.println("Nama : "+x.getNama());
			System.out.println("Email : "+x.getEmail());
		}
	}
}
