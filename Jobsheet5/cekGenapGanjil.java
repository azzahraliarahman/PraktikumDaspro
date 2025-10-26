import java.util.Scanner;
public class cekGenapGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(angka + " adalah bilangan " + hasil);
        sc.close();
    }
    
}
