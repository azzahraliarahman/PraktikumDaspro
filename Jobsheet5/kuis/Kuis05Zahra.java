//nama
//nim
//absen

package kuis;

public class Kuis05Zahra {
public static void main(String[] args) {
   String[] parkir = {"Outdoor", "Basement","VIP"};
   String[] jenisKendaraan = {"Mobil", "Motor", "Sepeda", "Truk", "Bus"};
    int[][] kendaraan = {
        {6,12,4,2,1},
        {8,10,6,3}, 
        {3,2,1,1,1}
    };



    double rodaDua = 5000;
    double rodaEmpat = 10000;
    double totalPendapatan = 0;
    String rataRatajenisKendaraanParkirOutdoor = "";
    String JenisParkir = "";
    String jenisKendaraanPalingBanyak = "";

   for (int i = 0; i < kendaraan.length; i++) {
       System.out.println("Jenis Parkir: " + parkir[i]);
       double totalPerJenisParkir = 0;

       for (int j = 0; j < kendaraan[i].length; j++) {
           int jumlahKendaraan = kendaraan[i][j];
           String jenisKendaraanSaatIni = jenisKendaraan[j];

           double tarif = (j == 0 || j == 3 || j == 4) ? rodaEmpat : rodaDua;
           double pendapatan = jumlahKendaraan * tarif;
           totalPerJenisParkir += pendapatan;

           System.out.println("  Jenis Kendaraan: " + jenisKendaraanSaatIni + ", Jumlah: " + jumlahKendaraan + ", Pendapatan: " + pendapatan);

           if (i == 0) {
               rataRatajenisKendaraanParkirOutdoor += jenisKendaraanSaatIni + " ";
           }
       }

       System.out.println("Total Pendapatan untuk " + parkir[i] + ": " + totalPerJenisParkir + "\n");
       totalPendapatan += totalPerJenisParkir;
         jenisKendaraanPalingBanyak = "";

         int maxKendaraan = 0;
            for (int j = 0; j < kendaraan[i].length; j++) {
                if (kendaraan[i][j] > maxKendaraan) {
                    maxKendaraan = kendaraan[i][j];
                    jenisKendaraanPalingBanyak = jenisKendaraan[j];
                }
            }
            System.out.println("Jenis Kendaraan Terbanyak pada Parkir " + parkir[i] + ": " + jenisKendaraanPalingBanyak + " dengan jumlah " + maxKendaraan + "\n");
   }
   jenisKendaraanPalingBanyak = "";
    int maxKendaraan = 0;
         for (int i = 0; i < kendaraan.length; i++) {
              for (int j = 0; j < kendaraan[i].length; j++) {
                if (kendaraan[i][j] > maxKendaraan) {
                     maxKendaraan = kendaraan[i][j];
                     jenisKendaraanPalingBanyak = jenisKendaraan[j];
                
                }
                
              }
         }
         System.out.println("Jenis Kendaraan Terbanyak secara Keseluruhan: " + jenisKendaraanPalingBanyak + " dengan jumlah " + maxKendaraan + "\n");
    System.out.println("Total Pendapatan Keseluruhan: " + totalPendapatan);
   
}
}
            