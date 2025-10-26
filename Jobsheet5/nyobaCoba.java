import java.util.Scanner;

public class nyobaCoba {

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

        System.out.println("\n================== Jalur Masuk ==================");
        System.out.println("1. SNMPTN");
        System.out.println("2. SBMPTN");
        System.out.println("3. Mandiri");
        System.out.print("Pilih jalur masuk (1-3): ");
        int jalurMasuk = sc.nextInt();
        String jalur;
        String ketJalur = "";
        
        

        // --- TAHAP 2: PROSES PERHITUNGAN ---
        
       // Menghitung nilai akhir dengan bobot: UTS 30%, UAS 40%, Tugas 30% 
        double nilaiAkhirAlgo = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double nilaiAkhirStrukdat = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

       // Konversi nilai angka ke nilai huruf 
       
        String nilaiHurufAlgo;
        if (nilaiAkhirAlgo > 80) {
            nilaiHurufAlgo = "A";
        } else if (nilaiAkhirAlgo > 73) {
            nilaiHurufAlgo = "B+";
        } else if (nilaiAkhirAlgo > 65) {
            nilaiHurufAlgo = "B";
        } else if (nilaiAkhirAlgo > 60) {
            nilaiHurufAlgo = "C+";
        } else if (nilaiAkhirAlgo > 50) {
            nilaiHurufAlgo = "C";
        } else if (nilaiAkhirAlgo > 39) {
            nilaiHurufAlgo = "D";
        } else {
            nilaiHurufAlgo = "E";
        }

        String nilaiHurufStrukdat;
        if (nilaiAkhirStrukdat > 80) {
            nilaiHurufStrukdat = "A";
        } else if (nilaiAkhirStrukdat > 73) {
            nilaiHurufStrukdat = "B+";
        } else if (nilaiAkhirStrukdat > 65) {
            nilaiHurufStrukdat = "B";
        } else if (nilaiAkhirStrukdat > 60) {
            nilaiHurufStrukdat = "C+";
        } else if (nilaiAkhirStrukdat > 50) {
            nilaiHurufStrukdat = "C";
        } else if (nilaiAkhirStrukdat > 39) {
            nilaiHurufStrukdat = "D";
        } else {
            nilaiHurufStrukdat = "E";
        }       
       

       // Menentukan status kelulusan per mata kuliah (LULUS jika nilai >= 60)
        String statusAlgo = nilaiAkhirAlgo >= 60 ? "LULUS" : "TIDAK LULUS";
        String statusStrukdat = nilaiAkhirStrukdat >= 60 ? "LULUS" : "TIDAK LULUS";                                                                                                                      

        // Menghitung rata-rata nilai akhir
        double rataRata = (nilaiAkhirAlgo + nilaiAkhirStrukdat) / 2;
        String sSem;
        String ketSem = "";

        if (rataRata >= 65) {
            jalur = "SNBP";
        } else if (rataRata >= 60) {
            jalur = "SBMPTN";
        } else if (rataRata < 50) {
            jalur = "Mandiri";
            ;
        } else {
            jalur = "Jalur tidak valid";
        }

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
        System.out.println("Jalur Masuk          : " + jalur);
        System.out.println("================================================================");

        sc.close();
    }
}
    