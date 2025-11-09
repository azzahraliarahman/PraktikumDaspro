import java.util.Scanner;
public class progCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();

        sc.nextLine(); // membersihkan newline setelah nextInt()

       

        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];

        double totbiaya = 0;

        System.out.println("----------------------------------------------------");
        System.out.println("               Masukkan detail pesanan :                  ");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("---pesanan ke-" + (i + 1) + "---\n");


            System.out.println("Masukkan nama pesanan: ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga pesanan (contoh : 15000): Rp ");
            hargaPesanan[i] = sc.nextDouble();

            sc.nextLine(); // membersihkan newline setelah nextDouble()
            
            totbiaya += hargaPesanan[i];

            System.out.println();
        }

            System.out.println("=================================================");
            System.out.println("               Daftar Pesanan Anda               ");
            System.out.println("=================================================");

           for (int i = 0; i < jmlPesanan; i++) {
                System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
            }

            System.out.println("-------------------------------------------------");
            System.out.println("Total Biaya: Rp " + totbiaya);
            System.out.println("=================================================");
            System.out.println("         Terima kasih telah berkunjung!          ");
            System.out.println("=================================================");
            sc.close();
        }

    }

