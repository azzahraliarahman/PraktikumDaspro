import java.util.Scanner;
public class NilaiMahasiswa05 {
    static Scanner sc = new Scanner(System.in);

    static void inputData (int[] nilaimhs) {
        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke -" + (i + 1) + ":");
            nilaimhs[i] = sc.nextInt();
        }
          
        }
    static void tampilData (int[] nilaimhs) {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.println("Nilai mahasiswa ke -" + (i + 1) + ": " + nilaimhs[i]);
        }   
    }
    static int hitungTotal (int[] nilaimhs) {
        int total = 0;
        for (int nilai : nilaimhs) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilaimhs = new int[n];
        inputData(nilaimhs);
        tampilData(nilaimhs);

        int totalNilai = hitungTotal(nilaimhs);
        System.out.println("\nTotal nilai semua mahasiswa: " + totalNilai);

       System.out.println("rata-rata : "+(double) totalNilai / n);      
       sc.close();
    }
}
                                                                                           

