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
    

    public static int hitungTotalHarga05 (int pilihanMenu, int banyakItem) {
        int harga = 0;
        switch (pilihanMenu) {
            case 1: harga = 15000; break;
            case 2: harga = 20000; break;
            case 3: harga = 22000; break;
            case 4: harga = 12000; break;
            case 5: harga = 10000; break;
            case 6: harga = 18000; break;
            default: 
                System.out.println("Menu tidak tersedia.");
                return 0;
        }

        return harga * banyakItem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();
        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan banyak item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalBayar = hitungTotalHarga05(pilihanMenu, banyakItem);

        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
        sc.close();



        
    }       
}



