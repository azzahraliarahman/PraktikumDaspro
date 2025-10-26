
import java.util.Scanner;

public class namaHari {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan nomor hari (1-7): ");
        int nomorHari = sc.nextInt();
        String namaHari;

        switch (nomorHari) {
          case 1:
            namaHari = "Senin";
            break;
          case 2:
            namaHari = "Selasa";
            break;
          case 3:
            namaHari = "Rabu";
            break;
          case 4:
            namaHari = "Kamis";
            break;
          case 5:
            namaHari = "Jumat";
            break;
          case 6:
            namaHari = "Sabtu";
            break;
          case 7:
            namaHari = "Minggu";
            break;
          default: 
            namaHari = "Nomor hari tidak valid";
            break;
        }

        System.out.println("Hari ini adalah hari: " + namaHari);
        
    } // <-- Main method ditutup di sini, setelah semua kode selesai
}