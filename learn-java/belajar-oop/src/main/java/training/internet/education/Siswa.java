package training.internet.education;

public class Siswa {
	public static Integer jumlahSiswa = 0;
	private String nomor;
	private String nama;
	private String email;
	
	public static void tampilkanJumlahSiswa() {
		System.out.println("Jumlah siswa saat ini adalah : "+jumlahSiswa);
		//System.out.println("Siswa terbaru adalah "+nama);//instance variable
	}
	
	//constructor
	//
	public Siswa() {
		jumlahSiswa = jumlahSiswa + 1;
	}
	
	public String getNama(){
		System.out.println(nama + " adalah nasabah ke-"+jumlahSiswa);
		return this.nama;
	}

	public String getNomor() {
		return nomor;
	}

	public void setNomor(String nomor) {
		this.nomor = nomor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	//getter(mengambil value) setter(set value)
	
}
