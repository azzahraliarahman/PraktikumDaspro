package jobsheet7;
import java.util.Scanner;
public class ProTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargatkt = 50000;
        int totalTiketHarian = 0;
        double totPenjualanHarian = 0;

        System.out.print("==============================\n");
        System.out.print("  Program Penjualan Tiket Bioskop\n");
        
        System.out.print("==============================\n");
        System.out.print("Masukkan jumlah tiket per transaksi: ");
        System.out.print("Ketik '0' untuk mengakhiri dan melihat total jualan harian\n");

        while (true) { 
            System.out.print("Jumlah tiket yang dibeli: ");
            int jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                System.out.println("Program dihentikan. Menghitung total penjualan harian...");
                break; 
            }

            if (jmlTiket < 0) {
               
                System.out.println("input tidak valid! Jumlah tidak boleh negatif. Silakan coba lagi.");
                continue;
            } 
             double harga = hargatkt * jmlTiket;
             double diskon = 0;
             String persen = "0%";

             if (jmlTiket > 10) {
                diskon = 0.15;
                persen = "15%";
            } else if (jmlTiket >= 4) {
                diskon = 0.10;
                persen = "10%";
             }

             double hrgEnd = harga - (harga * diskon);

             System.out.println("-----------Struk Pembelian Tiket-----------");
             System.out.println("Jumlah Tiket       : " + jmlTiket);
             System.out.println("Harga Tiket       : Rp " + harga);
             System.out.println("Diskon            : " + persen);
             System.out.println("Total Harga       : Rp " + hrgEnd);
             System.out.println("-------------------------------------------");

             totalTiketHarian += jmlTiket;
             totPenjualanHarian += hrgEnd;
        }
            sc.close();
        System.out.println("Total tiket terjual hari ini: " + totalTiketHarian + " tiket");
        System.out.println("Total Penjualan Harian: Rp " + totPenjualanHarian);

        }


    }
