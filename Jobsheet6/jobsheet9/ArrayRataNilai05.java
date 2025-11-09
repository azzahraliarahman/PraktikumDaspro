package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        double totaltdkLulus = 0;
        int jmlLulus = 0;
        int jmlTdkLulus = 0;
        

        for (int i=0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiwa ke- "+(i+1)+": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i=0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus +=nilaiMhs[i];
                jmlLulus++;
            } else {
                totaltdkLulus +=nilaiMhs[i];
                jmlTdkLulus++;

            }
        }
       double rataLulus = 0;
       if (jmlLulus > 0) {
           rataLulus = totalLulus / jmlLulus;
       }
       double rataTdkLulus = 0;
       if (jmlTdkLulus > 0) {
           rataTdkLulus = totaltdkLulus / jmlTdkLulus;
       }
       System.out.println("Rata-rata nilai lulus: "+rataLulus);
       System.out.println("Rata-rata nilai tidak lulus: "+rataTdkLulus);
         sc.close();
    }
    
}
