
import java.util.Scanner;

public class cafeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappucino", "Chocolate ice"};

        System.out.println("---Selamat datang di cafe Zahra---");
        System.out.print("Menu yang tersedia: ");
        for (String item : menu) {
            System.out.print("-" + item);

        }
        System.out.println("--------------------------------");
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cariMenu = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
               found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Menu " + cariMenu + " tersedia di cafe Zahra.");
        } else {
            System.out.println("Maaf, menu " + cariMenu + " tidak tersedia di cafe Zahra.");
        }
        sc.close();
    }
}
