import java.util.Scanner;

public class f_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int szam;

        do {
            System.out.print("Adjon meg egy 1 és 10 közötti egész számot: ");
            szam = scanner.nextInt();

            if (szam < 1 || szam > 10) {
                System.out.println("Nem egy 1 és 10 közötti egész számot adott meg!");
            } else {
                System.out.println("A megadott szám: " + szam);
            }
        } while (szam < 1 || szam > 10);
        scanner.close();

        for (int i = 1; i < 11; i++) {
            System.out.println(szam + "x" + i + "=" + szam * i);
        }
    }

}