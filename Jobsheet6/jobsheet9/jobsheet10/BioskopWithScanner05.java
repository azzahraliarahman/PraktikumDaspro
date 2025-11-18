package jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String [][] penonton = new String [4][2];

        while (true) {
          System.out.println("--- Menu Bioskop ---");
          System.out.println("1. Input Data Penonton");
          System.out.println("2. Tampilkan Data Penonton");
          System.out.println("3. Exit");
          System.out.println("Pilih menu (1-3): ");

          int pilihan = sc.nextInt();
          sc.nextLine();

          switch (pilihan) {
            case 1 :
             System.out.print("Masukkan nama : ");
             nama = sc.nextLine();
             System.out.println("Masukkan baris (1-4) : ");
             baris = sc.nextInt();
             System.out.println("Masukkan kolom (1-2) : ");
             kolom = sc.nextInt();

             if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
             System.out.println("Nomor baris atau kolom tidak valid.");
             System.out.println("Silahkan coba lagi.");
            
                }

             else if (penonton[baris-1][kolom-1] != null) {
                System.out.println("Kursi (Baris" + baris + ", Kolom " + kolom + ") sudah terisi.");
             }
             else {
                penonton[baris-1][kolom-1] = nama;
                System.out.println("Data penonton berhasil ditambahkan.");
             }
             break;

             case 2 :
             System.out.println("-----------------------------");
             System.out.println("Daftar Penonton Bioskop");
             System.out.println("-----------------------------");

             for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    String namaPenonton = penonton[i][j];
                    if (namaPenonton == null) {
                        namaPenonton = "***";
                    }
                    System.out.printf("Baris %d, Kolom %d: %-15s \t" , (i+1), (j+1), namaPenonton);
                }
                System.out.println();
            }
            System.out.println("-----------------------------");
            break;
            case 3 :
                System.out.println("Terima kasih telah menggunakan program ini.");
                sc.close();
                System.exit(0);
            default :
                System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
        }
        System.out.println();


                   
                }
             }



          }
        
    
