
import java.util.Scanner;
public class ifcetakKrs05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT Sudah Lunas? (True/False)");
        boolean uktLunas = sc.nextBoolean();
        
        String pesan = uktLunas ? "Pembayaran UKT terverifikasi\nSilahkan Cetak KRS dan minta tanda tangan DPA":"Registrasi ditolak, silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
        sc.close();
    }
}