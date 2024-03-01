import java.util.Scanner;

public class f_2 {
    public static void Jelszoellenorzo(String helyes_jelszo) {
        Scanner scanner = new Scanner(System.in);
        String jelszo;


        for (int i = 1; i <= 3; i++) {
            System.out.print("Adja meg a jelszavat: ");
            jelszo = scanner.next();
            if (jelszo.equals(helyes_jelszo)) {
                System.out.print("Sikeres bejelentkezes!");
                return;
            } else if (i < 3) {
                System.out.println("Rossz jelszo! " + "Maradt " + (3 - i) + " probalkozasod.");
            }
        }
        System.out.println("Haromszor rontotta el a jelszot, belepes megtagadva!");
    }

    public static void main(String[] args) {
        Jelszoellenorzo("1234");
    }
}


