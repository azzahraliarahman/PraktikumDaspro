import java.util.Scanner;
public class aksesWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Siapakah anda Mahasiswa atau Dosen?");
        String user = sc.nextLine();

        if(user.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if(user.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukkan jumlah SKS yang diambil :");
            int sks = sc.nextInt();

            if(sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        }
        else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }
    
}
