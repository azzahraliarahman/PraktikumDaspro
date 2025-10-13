import java.util.Scanner;

public class CM1_AzzahraAulia05Revisi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- TAHAP 1: INPUT DATA MAHASISWA ---
        System.out.println("INPUT DATA MAHASISWA");
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

       // Input Nilai Mata Kuliah 1: Algoritma dan Pemrograman
        System.out.println("\n-Mata Kuliah 1: Algoritma dan Pemrograman");
        System.out.print("Nilai UTS : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas1 = sc.nextDouble();

       // Input Nilai Mata Kuliah 2: Struktur Data 
        System.out.println("\n-Mata Kuliah 2: Struktur Data");
        System.out.print("Nilai UTS : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas2 = sc.nextDouble();

        // --- TAHAP 2: PROSES PERHITUNGAN ---
        
       // Menghitung nilai akhir dengan bobot: UTS 30%, UAS 40%, Tugas 30% 
        double nilaiAkhirAlgo = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double nilaiAkhirStrukdat = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

       // Konversi nilai angka ke nilai huruf 
        String nilaiHurufAlgo = konversiNilaiKeHuruf(nilaiAkhirAlgo);
        String nilaiHurufStrukdat = konversiNilaiKeHuruf(nilaiAkhirStrukdat);

       // Menentukan status kelulusan per mata kuliah (LULUS jika nilai >= 60)
        String statusAlgo = nilaiAkhirAlgo >= 60 ? "LULUS" : "TIDAK LULUS";
        String statusStrukdat = nilaiAkhirStrukdat >= 60 ? "LULUS" : "TIDAK LULUS";

        // Menghitung rata-rata nilai akhir
        double rataRata = (nilaiAkhirAlgo + nilaiAkhirStrukdat) / 2;
        String sSem;
        String ketSem = "";

      // Menentukan status kelulusan semester menggunakan nested if
    if (statusAlgo.equals("LULUS") && statusStrukdat.equals("LULUS")) {
            if (rataRata >= 70) { //
                sSem = "LULUS";
            } else {
                sSem = "TIDAK LULUS";//
                ketSem= " (Rata-rata < 70)";
            }
        } else {
            // Jika salah satu atau kedua mata kuliah tidak lulus
            sSem = "TIDAK LULUS";//
        }

        // --- TAHAP 3: TAMPILKAN OUTPUT ---
        System.out.println("\n================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.printf("%-25s %-7s %-7s %-7s %-12s %-12s %-10s\n", 
            "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-25s %-7.0f %-7.0f %-7.0f %-12.2f %-12s %-10s\n", 
            "Algoritma Pemrograman", uts1, uas1, tugas1, nilaiAkhirAlgo, nilaiHurufAlgo, statusAlgo);
        System.out.printf("%-25s %-7.0f %-7.0f %-7.0f %-12.2f %-12s %-10s\n", 
            "Struktur Data", uts2, uas2, tugas2, nilaiAkhirStrukdat, nilaiHurufStrukdat, statusStrukdat);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("\nRata-rata Nilai Akhir: %.2f\n", rataRata);
        System.out.println("Status Semester      : " + sSem + ketSem);
        System.out.println("================================================================");

        sc.close();
    }

    /**
     * Fungsi untuk mengonversi nilai angka menjadi nilai huruf sesuai tabel.
     */
    public static String konversiNilaiKeHuruf(double nilai) {
        if (nilai > 80) return "A";
        else if (nilai > 73) return "B+";
        else if (nilai > 65) return "B";
        else if (nilai > 60) return "C+";
        else if (nilai > 50) return "C";
        else if (nilai > 39) return "D";
        else return "E";
    }
}