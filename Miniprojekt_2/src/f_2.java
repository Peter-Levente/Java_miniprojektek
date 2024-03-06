import java.util.Scanner;

public class f_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sz;
        System.out.print("Kerek egy szot:");
        sz = scanner.next();

        String modositottSzo=sz.replace('a','*');

        System.out.println("Eredeti szó: " + sz);
        System.out.println("Módosított szó: " + modositottSzo);

    }
}

