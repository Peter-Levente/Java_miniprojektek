import java.util.Random;
import java.util.Scanner;

public class bonusz_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int szam = random.nextInt(101);
        int tipp;
        int n = 1;
        //System.out.println("Véletlenszerű szám: " + szam);
        System.out.print("Kérek egy tippet: ");
        tipp = scanner.nextInt();


        for (int i = 1; tipp != szam; i++) {
            if (tipp > szam) {
                System.out.println("sok – a szám kisebb");
                System.out.println();
                System.out.print("Kérek egy tippet: ");
                n = i;
                tipp = scanner.nextInt();
            }
            if (tipp < szam) {
                System.out.println("kevés – a szám nagyobb");
                System.out.println();
                System.out.print("Kérek egy tippet: ");
                n = i;
                tipp = scanner.nextInt();

            }
        }
        System.out.println("Eltalálta " + n + " lépés után.");
    }
}


