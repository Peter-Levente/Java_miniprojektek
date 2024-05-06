import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Naplo {
    protected ArrayList<Hallgato> hallgatok = new ArrayList<>();

    public Naplo(String fajlnev) {

        try {
            File file = new File("Miniprojekt_5\\src\\" + fajlnev);

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String sor = scanner.nextLine();
                String adatok[] = sor.split(",");

                if (adatok.length >= 2) {
                    Hallgato hallgato = new Hallgato(adatok[0], adatok[1]);
                    hallgatok.add(hallgato);
                } else {
                    System.out.println("Hibás sor a fájlban: " + sor);
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void listazNevek() {
        for (Hallgato h : hallgatok) {
            System.out.println(h.getID() + ". " + h.getVezeteknev() + " " + h.getKeresztnev());
        }
    }

    public void ujJegy(int ID, Jegy jegy) {
        for (Hallgato hallgato : hallgatok) {
            if (hallgato.getID() == ID) {
                hallgato.ujBejegyzes(jegy.getTantargy_neve(), jegy.getJegy());
            }
        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println();
            System.out.println(hallgato.getID() + ". " + hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
            System.out.println();
            ArrayList<String> tantargyak = hallgato.getTantargyak();

            for (String tantargy : tantargyak) {
                double atlag = hallgato.tantargyAtlag(tantargy);
                System.out.println(tantargy + ": " + atlag);
            }
        }
    }
}