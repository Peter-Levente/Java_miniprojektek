import java.util.Scanner;

public class f_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sz;
        System.out.print("Kerek egy szot:");
        sz = scanner.next();
        StringBuilder ujsz = new StringBuilder();

        for (int i = 0; i < sz.length(); i++) {
            char karakter1 = sz.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < ujsz.length(); j++) {
                char karakter2 = ujsz.charAt(j);
                if (karakter1 == karakter2) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                ujsz.append(karakter1);
            }
        }
        System.out.println("Tobbszor elofordulo karakterek nelkul: " + ujsz);
    }
}
