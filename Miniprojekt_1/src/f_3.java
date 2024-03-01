import java.util.Scanner;

public class f_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int szam1;
        int szam2;
        int muvelet;

        System.out.print("Enter first number: ");
        szam1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        szam2 = scanner.nextInt();


        do {
            System.out.print("""
                    Enter 1 for addition
                    Enter 2 for subtraction
                    Enter 3 for multiplication
                    Enter 4 for division
                    Enter 5 to Exit
                    """);
            muvelet = scanner.nextInt();

            int result;
            if (muvelet == 1) {
                result = szam1 + szam2;
                System.out.println("Result: " + result);
            } else if (muvelet == 2) {
                result = szam1 - szam2;
                System.out.println("Result: " + result);
            } else if (muvelet == 3) {
                result = szam1 * szam2;
                System.out.println("Result: " + result);
            } else if (muvelet == 4) {
                result = szam1 / szam2;
                System.out.println("Result: " + result);
            }
        } while (muvelet != 5);
    }
}