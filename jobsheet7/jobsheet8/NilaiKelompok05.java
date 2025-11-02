package jobsheet8;
import java.util.Scanner;
public class NilaiKelompok05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int i,nilai,kelTertinggi=0;
       float totalNilai,rataNilai,rataTertinggi=0;
       i=1;
      
       while (i <= 6) {
        System.out.println("Kelompok" + i);
        totalNilai=0;
       
      for (int j = 1; j<=5; j++) {
      System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
      nilai = sc.nextInt();
      totalNilai += nilai;
     
      }   
        rataNilai = totalNilai / 5;
        System.out.println("Rata-rata Nilai Kelompok" + i + "=" + rataNilai);
       
        if (rataNilai > rataTertinggi) {
        rataTertinggi = rataNilai;
        kelTertinggi = i;
    }
    i++;
   ;
     }
    System.out.println("Kelompok dengan Rata-rata Tertinggi adalah Kelompok " + kelTertinggi + " dengan nilai " + rataTertinggi);
    sc.close();
}
}
