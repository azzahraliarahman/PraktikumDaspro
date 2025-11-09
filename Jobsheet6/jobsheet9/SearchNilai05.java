package jobsheet9;
import java.util.Scanner;
public class SearchNilai05 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan banyakya nilai yang akan diinput :");
    int jmlNilai = sc.nextInt();
      int[] arrNilai = new int[jmlNilai]; ;
      
      for (int i = 0; i < arrNilai.length; i++) {
        System.out.print("Masukkan nilai mahasiwa ke-"+(i+1)+" : ");
        arrNilai[i] = sc.nextInt();
      }

      System.out.println();

      System.out.print("Masukkan nilai yang ingin dicari : ");
      int key = sc.nextInt();

      int hasil = -1;

      for (int i = 0; i < arrNilai.length; i++) {
        if (key == arrNilai[i]) {
            hasil = i;
            break;
        }
      }
      if (hasil != -1) {
        System.out.println("Nilai" + key + "ketemu, merupakan nilai mahasiwa ke-" + (hasil+1) );
      }else {
     System.out.println("Nilai yang dicari tidak ditemukan" );
   } 
   sc.close();
}

}
