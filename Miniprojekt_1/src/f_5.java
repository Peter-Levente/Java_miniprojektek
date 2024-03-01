import java.util.Scanner;

public class f_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sz;
        System.out.print("Adjon meg szoveget: ");
        sz = scanner.next();

        for (int i = 0; i < sz.length(); i++) {
            char karakter = sz.charAt(i);
            if (!Character.isAlphabetic(karakter)) {
                System.out.println("A string nem csak alfabetikus karaktereket tartalmaz.");
                return;
            }
        }
        System.out.println("A string csak alfabetikus karaktereket tartalmaz.");
    }
}