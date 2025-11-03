package jobsheet8;
import java.util.Scanner;
public class HasilCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totSelPelanggan = 0;
        int totSelitem = 0;

        System.out.println("Jumlah cabang cafe: ");
        int jmlCabang = sc.nextInt();

        System.out.println("\n=== Input jualan per Cabang ===");
        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("\n===Cabang " + i + "===");
            System.out.print("Jumlah pelanggan: ");
            int jmlPelanggan = sc.nextInt();

            int itemPCabang = 0;
            
            for (int j = 1; j <= jmlPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int itemPelanggan = sc.nextInt();

                 itemPCabang+= itemPelanggan; 
            }

            
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jmlPelanggan + " orang");
            System.out.println("- Item terjual: " + itemPCabang + " item");

           
            totSelPelanggan += jmlPelanggan;
            totSelitem += itemPCabang;
        }

        
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totSelPelanggan + " orang");
        System.out.println("Item terjual: " + totSelitem + " item");

        sc.close();
    }
}