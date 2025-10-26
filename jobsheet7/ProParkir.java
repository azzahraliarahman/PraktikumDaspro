import java.util.Scanner;
public class ProParkir {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int jenis, durasi, total = 0;
      do {
      System.out.println("Masukkan Jenis Kendaraan (1 Mobil, 2 Motor, 0 Keluar  ): ");
      jenis = sc.nextInt();

      if (jenis == 1 || jenis == 2) {
          System.out.println("Masukkan Durasi Parkir (dalam jam): ");
          durasi = sc.nextInt();
          if (durasi > 5) {
              total +=12500;
              System.out.println("Total Parkir: " + total);
          } else {
              if (jenis == 1) {
                  total += durasi * 3000;
                  System.out.println("Total Parkir: " + total);
              } else if (jenis == 2) {
                  total += durasi * 2000;
                  System.out.println("Total Parkir: " + total);
              }
            }
           
          }else if (jenis != 0) {
          System.out.println("Pilihan tidak valid, silahkan coba lagi.");
          }
      } while (jenis != 0);

      System.out.println("Terima kasih telah menggunakan layanan parkir kami.");
      System.out.println("Total Seluruh pendapatan parkir " + total);

  sc.close();
  } 
}

    