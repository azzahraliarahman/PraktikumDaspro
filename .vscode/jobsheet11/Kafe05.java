import java.util.Scanner;
public class Kafe05 {
    public static void Menu() { 
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp  12,000");
        System.out.println("5. Roti bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp  18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");


    }
    

    public static int hitungTotalHarga05 (int pilihanMenu, int banyakItem, String kodePromo) {
        int harga = 0;
        switch (pilihanMenu) {
            case 1: harga = 15000; break;
            case 2: harga = 20000; break;
            case 3: harga = 22000; break;
            case 4: harga = 12000; break;
            case 5: harga = 10000; break;
            case 6: harga = 18000; break;
            default: 
                return 0;
        }

        int totalHarga = harga * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo 'DISKON50' berhasil digunakan. Anda mendapatkan potongan harga 50%.");
            totalHarga = totalHarga / 2;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo 'DISKON30' berhasil digunakan. Anda mendapatkan potongan harga 30%.");
            totalHarga = (int)(totalHarga * 0.7);
        } else if (!kodePromo.equals(""))
            System.out.println("Kode promo tidak valid atau tidak digunakan.");
        
        return totalHarga;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeluruhnya = 0;
        String lanjut = "Y";
        System.out.println("Selamat datang di Resto Kafe!");

        while (lanjut.equalsIgnoreCase("Y")) {
            Menu();

        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan banyak item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();  

        System.out.print("Masukkan kode promo (jika ada) atau tekan Enter untuk melanjutkan: ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga05(pilihanMenu, banyakItem, kodePromo);

        totalSeluruhnya += totalHarga;

        System.out.println("Subtotal : Rp " + totalHarga);

        System.out.print("Apakah Anda ingin memesan lagi? (Y/N): ");
        lanjut = sc.nextLine();
    }

        System.out.println("Total keseluruhan : Rp " + totalSeluruhnya);
        sc.close();



        
    }       
}



