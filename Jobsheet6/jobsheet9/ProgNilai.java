import java.util.Scanner;
public class ProgNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiwa yang akan diinput: ");
        int jmlNilai = sc.nextInt();

        int[] arrNilai = new int[jmlNilai];

        double total = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        System.out.println("----------------------------------------------------");


        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();

            total += arrNilai[i];

            if (arrNilai[i] > nilaiTertinggi) {
                nilaiTertinggi = arrNilai[i];
            }
            if (arrNilai[i] < nilaiTerendah) {
                nilaiTerendah = arrNilai[i];
        }

    }

    System.out.println("----------------------------------------------------");
    System.out.println("           Hasil Analisis Nilai Mahasiswa          ");
    System.out.println("----------------------------------------------------");

    if (jmlNilai > 0) {
        double rataRata = total / jmlNilai;
        System.out.printf("Rata-rata nilai mahasiswa: %.2f%n", rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

        System.out.println("----------------------------------------------------");
        System.out.println("           Daftar Nilai Mahasiswa          ");
        System.out.println("----------------------------------------------------");

        for (int nilai : arrNilai) {
            System.out.println(nilai + "");
        }
        System.out.println();
    } else {
        System.out.println("Tidak ada nilai yang diinput.");
    } 
    sc.close();
}
}