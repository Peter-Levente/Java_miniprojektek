import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes("Matek",10);
        hallgato.ujBejegyzes("Matek",8);
        hallgato.ujBejegyzes("Roman",7);
        hallgato.ujBejegyzes("Roman",8);
        hallgato.ujBejegyzes("Magyar",9);

        hallgato.listazas();*/

        Naplo naplo = new Naplo("hallgatok.csv");
        naplo.listazNevek();

        try {
            File file = new File("Miniprojekt_5\\src\\jegyek.csv");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String sor = scanner.nextLine();
                String adatok[] = sor.split(",");

                if (adatok.length >= 3) {
                    int hallgatoID = Integer.parseInt(adatok[0]);
                    String tantargy = adatok[1];
                    int jegy = Integer.parseInt(adatok[2]);

                    Jegy ujJegy = new Jegy(tantargy, jegy);
                    naplo.ujJegy(hallgatoID, ujJegy);
                } else {
                    System.out.println("Hibás sor a fájlban: " + sor);
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        naplo.listazHallgatoiAdatok();
    }
}
