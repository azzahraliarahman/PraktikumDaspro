import java.util.Scanner;
public class ifcetakKrs05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT Sudah Lunas? (True/False)");
        boolean uktLunas = input.nextBoolean();
        
        if (uktLunas) {
        System.out.println("Pembayaran UKT terverikasi");
        System.out.println("Silahkan Cetak KRS dan minta tanda tangan DPA");
        }
        else {
        System.out.println("Registrasi ditolak,silakan lunasi UKT terlebih dahulu");}
    }
}