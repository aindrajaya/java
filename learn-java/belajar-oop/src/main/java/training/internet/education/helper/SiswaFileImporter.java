package training.internet.education.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import training.internet.education.Siswa;

public class SiswaFileImporter {
	private File fileInput;
	private BufferedReader fileReader;
	
	//sebagai constructor
	public SiswaFileImporter(String namaFile){
		this.fileInput = new File(namaFile);
	}
	
	private void bukaFile() throws FileNotFoundException{
		if(!fileInput.exists()) {
			throw new FileNotFoundException("File tidak ada");
		}
		
		fileReader = new BufferedReader(new FileReader(fileInput));
	}
	
	private void tutupFile() throws IOException{
		if(fileReader != null) {
			fileReader.close();
		}
	}
	 
	public List<Siswa> proses() throws IOException{
		bukaFile();
		
		String data = fileReader.readLine();
		System.out.println("Header : "+data);
		
		List<Siswa> hasil = new ArrayList<Siswa>();
		data = fileReader.readLine();
		
		while(data != null) {
			System.out.println("Data : "+data);
			
			String[] isiVariabel = data.split(",");
			if(isiVariabel.length != 3) {
				throw new IllegalStateException("Format data salah, harusnya ada 3 data");
			}
			
			Siswa s = new Siswa();
			s.setNomor(isiVariabel[0]);
			s.setNama(isiVariabel[1]);
			s.setEmail(isiVariabel[2]);
			hasil.add(s);
			data = fileReader.readLine();
		}
		
		tutupFile();
		return hasil;
	}
}
