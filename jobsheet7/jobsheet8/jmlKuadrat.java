package jobsheet8;



public class jmlKuadrat {
    public static void main(String[] args) {
      
        
        
        int totJmlKuadrat = 0;
        String prosesPenjumlahan = "";

      

        for (int n = 1; n <= 5; n++) {
            
            int kuadrat = n * n;

            totJmlKuadrat += kuadrat;

            if (n == 1) {
                prosesPenjumlahan = "" + kuadrat;
            } else {
                prosesPenjumlahan += " + " + kuadrat;
            }
            if (n == 1) {
                System.out.println("n =" + n + "-> jumlah Kuadrat ="  + totJmlKuadrat);
            } else {
                System.out.println("n =" + n + "-> jumlah Kuadrat" + prosesPenjumlahan + " = " + totJmlKuadrat);
            }
        }
      
    }
}


