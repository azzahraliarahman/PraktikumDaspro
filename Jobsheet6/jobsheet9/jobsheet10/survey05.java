package jobsheet10;

import java.util.Scanner;

public class survey05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] survey = new int[10][6];

    double totalKeseluruhan = 0;

    System.out.println("---Masukkan Data Survey---");

    for (int i = 0; i < survey.length; i++) {
        System.out.println("Responden ke- " + (i + 1) + ":");
        
        for (int j = 0; j < survey[i].length; j++) {
            System.out.print("Masukkan nilai pertanyaan ke- " + (j + 1) + "(Skala 1-5): ");
            survey[i][j] = sc.nextInt();
            totalKeseluruhan += survey[i][j];

        }
        System.out.println();

    }
    System.out.println("---Rata-rata Per Respoden---");

    for (int i = 0; i < survey.length; i++) {
    double totalperResponden = 0;
    
    for (int j = 0; j < survey[i].length; j++) {
        totalperResponden += survey[i][j];
    }

    double rataRataResponden = totalperResponden / survey[i].length;
    System.out.println("Rata-rata Responden ke- " + (i + 1) + ": " + rataRataResponden);
    }

    System.out.println("\n---Rata-rata Per Pertanyaan---");

    for (int j = 0; j < survey[0].length; j++) {
        double totalperPertanyaan = 0;

        for (int i = 0; i < survey.length; i++) {
            totalperPertanyaan += survey[i][j];
        }

        double rataRataPertanyaan = totalperPertanyaan / survey.length;
        System.out.println("Rata-rata Pertanyaan ke- " + (j + 1) + ": " + rataRataPertanyaan);


    }

    System.out.println("\n---Rata-rata Keseluruhan---");
    double rataRataKeseluruhan = totalKeseluruhan / (survey.length * survey[0].length);
    System.out.println("Rata-rata Keseluruhan: " + rataRataKeseluruhan);
}
    }



    



