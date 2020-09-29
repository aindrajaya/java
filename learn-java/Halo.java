import java.util.Date;

public class Halo{
    private Date sekarang = new Date();

    public void sapa(String nama){
        System.out.println("Hallo" + nama);
    }

    public void tampilkanWaktu(){
        System.out.println("Wakti sekarang : " + sekarang);
    }
}