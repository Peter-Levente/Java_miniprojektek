import java.util.Scanner;

public class f_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sz;
        System.out.print("Kerek egy szot:");
        sz = scanner.next();

        if (!sz.isEmpty()) {
            char elsoKarakter = sz.charAt(0);
            char utolsoKarakter = sz.charAt(sz.length() - 1);
            System.out.println("Az első karakter: " + elsoKarakter + " és az utolsó karakter: " + utolsoKarakter);
        } else {
            System.out.println("A megadott szó üres!");
        }
    }
}
