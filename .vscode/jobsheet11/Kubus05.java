import java.util.Scanner;
public class Kubus05 {
    static int htgVlm (int sisi) {
        return sisi * sisi * sisi;
    }

    static int htgLuasPrmkn (int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int volume = htgVlm(sisi);
        int luasPermukaan = htgLuasPrmkn(sisi);

        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}
