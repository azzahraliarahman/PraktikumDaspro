import java.util.Scanner;
public class sPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah membawa kartu mahasiswa (true/false) : ");
        boolean kartuMahasiswa = sc.nextBoolean();
        System.out.print("Apakah sudah registrasi online  (true/false) : ");
        boolean registrasiOnline = sc.nextBoolean();
        String hasil = (kartuMahasiswa || registrasiOnline) ? "silahkan masuk" : "tidak boleh masuk";
        System.out.println(hasil);
        sc.close();
    }}