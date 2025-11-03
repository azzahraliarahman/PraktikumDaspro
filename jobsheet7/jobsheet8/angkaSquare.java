package jobsheet8;

public class angkaSquare {
 public static void main(String[] args) {
        
    int uk3 = 3;

    for (int i = 1; i <= uk3; i++) {
        for (int j = 1; j <= uk3; j++) {

          if (i == 1 || i == uk3 || j == 1 || j == uk3) {
                System.out.print("3 ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    System.out.println();

    System.out.println("Pola angka 5");
    int uk5 = 5;
    String SKiri = " ";

    for (int i =1; i <= uk5; i++) {
        for (int j = 1; j <= uk5; j++) {

            if (i == 1 || i == uk5 || j == 1 || j == uk5) {
                System.out.print("5 ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();

    }
    
}
}
