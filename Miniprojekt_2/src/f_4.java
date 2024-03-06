import java.util.Scanner;

public class f_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérek egy karakterláncot:");
        String input = scanner.next();

        if (!input.isEmpty()) {
            char currentcaracter = input.charAt(0);
            int count = 1;

            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == currentcaracter) {
                    count++;
                } else {
                    System.out.print(currentcaracter);
                    System.out.print(count);
                    currentcaracter = input.charAt(i);
                    count = 1;
                }
            }
            System.out.print(currentcaracter);
            System.out.print(count);
        }
    }
}
