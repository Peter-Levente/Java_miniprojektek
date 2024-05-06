import java.util.ArrayList;

public class Hallgato {
    protected final int ID;
    protected final String vezeteknev;
    protected final String keresztnev;
    protected ArrayList<Jegy> jegyek = new ArrayList<>();

    protected static int nextID = 1;

    public Hallgato(String vezeteknev, String keresztnev) {
        this.ID = nextID++;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Hallgato{" +
                "ID=" + ID +
                ", vezeteknev='" + vezeteknev + '\'' +
                ", keresztnev='" + keresztnev + '\'' +
                ", jegyek=" + jegyek +
                '}';
    }

    public void ujBejegyzes(String tantargy, int jegy) {
        Jegy ujJegy = new Jegy(tantargy, jegy);
        jegyek.add(ujJegy);
    }

    public double tantargyAtlag(String tantargy_neve) {
        double atlag = 0;
        double osszjegyek = 0;
        int jegyekszama = 0;
        for (Jegy jegy : jegyek) {
            if (jegy.getTantargy_neve().equals(tantargy_neve)) {
                osszjegyek += jegy.getJegy();
                jegyekszama++;
            }
        }
        if (jegyekszama > 0) {
            atlag = osszjegyek / jegyekszama;
        } else {
            System.out.println(jegyekszama);
        }
        return atlag;
    }

    public ArrayList<String> getTantargyak() {
        ArrayList<String> tantargyak = new ArrayList<>();
        for (Jegy jegy : jegyek) {
            if (!tantargyak.contains(jegy.getTantargy_neve())) {
                tantargyak.add(jegy.getTantargy_neve());
            }
        }
        return tantargyak;
    }

    public void listazas() {
        System.out.println(this.vezeteknev + " " + this.keresztnev);

        ArrayList<String> tantargyak = getTantargyak();

        for (String tantargy : tantargyak) {
            double atlag = tantargyAtlag(tantargy);
            System.out.println("    " + tantargy + ": " + atlag);
        }
    }
}