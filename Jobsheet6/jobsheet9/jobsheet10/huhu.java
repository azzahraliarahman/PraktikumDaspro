package jobsheet10;

public class huhu {
    
    public static void main(String[] args) {

        String[] tipeStudio = {
                "Regular",
                "Dolby Atmos",
                "IMAX",
                "Premiere",
                "Luxury Suite"
        };

        int[][] hari = {
                { 12, 18, 14 }, // Regular
                { 9, 11, 10 }, // Dolby Atmos
                { 8, 12, 15 }, // IMAX
                { 7, 9, 8 }, // Premiere
                { 5, 7, 6 } // Luxury Suite
        };

        // hargaTiket[0] = Weekday, hargaTiket[1] = Weekend
        int[] hargaTiket = { 40000, 70000 };

        int[] banyakTiket = new int[5];
        int totalPendapatan = 0;

        // Menghitung total tiket setiap studio
        for (int i = 0; i < hari.length; i++) {
            for (int j = 0; j < hari[i].length; j++) {
                banyakTiket[i] += hari[i][j];
            }
        }

        // Output tiap studio + hitung pendapatan
        System.out.println("=== TOTAL PENJUALAN TIKET PER STUDIO ===");
        for (int i = 0; i < tipeStudio.length; i++) {

            int weekday = hari[i][0] + hari[i][1];
            int weekend = hari[i][2];

            int pendapatanStudio = (weekday * hargaTiket[0]) + (weekend * hargaTiket[1]);
            totalPendapatan += pendapatanStudio;

            System.out.println(tipeStudio[i] + " : " + banyakTiket[i] + " tiket (Rp " + pendapatanStudio + ")");
        }

        // Total tiket seluruh studio
        int totalSemuaTiket = 0;
        for (int t : banyakTiket) {
            totalSemuaTiket += t;
        }

        // Total tiket hari Senin (kolom 0)
        int totalTiketSenin = 0;
        for (int i = 0; i < hari.length; i++) {
            totalTiketSenin += hari[i][0];
        }

        // Rata-rata tiket per studio
        double rataRata = (double) totalSemuaTiket / tipeStudio.length;

        System.out.println("\n=== RINGKASAN ===");
        System.out.println("Total tiket hari Senin : " + totalTiketSenin);
        System.out.println("Total seluruh tiket    : " + totalSemuaTiket);
        System.out.println("Total pendapatan       : Rp " + totalPendapatan);
        System.out.printf("Rata-rata per studio   : %.2f tiket\n", rataRata);
    }
}


