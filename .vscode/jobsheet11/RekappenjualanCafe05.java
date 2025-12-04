import java.util.Scanner;

public class RekapPenjualanCafe05 {

    // --- FUNGSI 1: INPUT DATA (Sesuai instruksi) ---
    // Menggunakan Array 2 Dimensi untuk menyimpan angka penjualan
    static void inputData(int[][] data, String[] namaMenu, Scanner sc) {
        System.out.println("=== INPUT DATA PENJUALAN ===");
        // Loop Baris (Menu)
        for (int i = 0; i < data.length; i++) {
            System.out.println("Input penjualan untuk menu: " + namaMenu[i]);
            // Loop Kolom (Hari)
            for (int j = 0; j < data[0].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    // --- FUNGSI 2: TAMPILKAN TABEL ---
    static void tampilData(int[][] data, String[] namaMenu) {
        System.out.println("\n=== REKAP DATA PENJUALAN ===");
        
        // Cetak Header Hari (Hari 1 sampai Hari Terakhir)
        System.out.print("Menu\t\t");
        for (int j = 0; j < data[0].length; j++) {
            System.out.print("H-" + (j + 1) + "\t");
        }
        System.out.println();

        // Cetak Baris Menu dan Datanya
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s\t", namaMenu[i]); // Cetak nama menu
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + "\t"); // Cetak angka
            }
            System.out.println();
        }
    }

    // --- FUNGSI 3: MENU PENJUALAN TERTINGGI ---
    static void menuTertinggi(int[][] data, String[] namaMenu) {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < data.length; i++) {
            int totalPerMenu = 0;
            // Hitung total satu baris (satu menu)
            for (int j = 0; j < data[0].length; j++) {
                totalPerMenu += data[i][j];
            }

            // Cek apakah ini rekor tertinggi
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                menuTerlaris = namaMenu[i];
            }
        }
        System.out.println("\nMenu Tertinggi: " + menuTerlaris + " (Total: " + maxPenjualan + ")");
    }

    // --- FUNGSI 4: RATA-RATA PENJUALAN ---
    static void rataRata(int[][] data, String[] namaMenu) {
        System.out.println("\n=== Rata-rata Penjualan ===");
        for (int i = 0; i < data.length; i++) {
            double total = 0;
            for (int j = 0; j < data[0].length; j++) {
                total += data[i][j];
            }
            // Hitung rata-rata: Total dibagi jumlah hari (data[0].length)
            double rata = total / data[0].length;
            System.out.printf("%-10s: %.2f\n", namaMenu[i], rata);
        }
    }

    // --- MAIN (3.a) ---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Karena Soal 3.a mengacu pada tabel di gambar, kita set manual nama menunya
        String[] namaMenu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        
        // Buat Array [5 Menu][7 Hari]
        int[][] dataPenjualan = new int[5][7];

        // Panggil Fungsi-Fungsi
        inputData(dataPenjualan, namaMenu, sc);
        tampilData(dataPenjualan, namaMenu);
        menuTertinggi(dataPenjualan, namaMenu);
        rataRata(dataPenjualan, namaMenu);
        
        sc.close();
    }
}