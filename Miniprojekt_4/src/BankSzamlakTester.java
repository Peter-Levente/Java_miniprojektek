import java.util.ArrayList;

public class BankSzamlakTester {
    public static void main(String[] args) {
        ArrayList<Tranzakcio> regsz_tranz = new ArrayList<>();
        ArrayList<Tranzakcio> foly_tranz = new ArrayList<>();
        ArrayList<Tranzakcio> fsz2_tranz = new ArrayList<>();
        ArrayList<Tranzakcio> fsz3_tranz = new ArrayList<>();
        ArrayList<Tranzakcio> tsz_tranz = new ArrayList<>();

        // Regularis szamla tesztek
        System.out.println("Regularisszamla tesztek:");
        System.out.println();
        RegularisSzamla rsz1 = new RegularisSzamla(200, "Nagy Zoltan", 123456, regsz_tranz);

        // Az ujSzamlaSzam() tesztelese 1-et kell kiadjon mert letrejott a szamla
        rsz1.getSzamlakSzama();

        // Betesz teszt
        rsz1.betesz(1000);
        // Kivesz teszt
        rsz1.kivesz(300);
        System.out.println(rsz1);


        // Folyoszamla szamla tesztek
        System.out.println();
        System.out.println("Folyoszamla tesztek:");
        FolyoSzamla fsz1 = new FolyoSzamla(0, "Nagy Zsolt", 123456, foly_tranz);

        // Betesz teszt
        fsz1.betesz(1000);
        fsz1.betesz(600);

        // Kivesz teszt
        fsz1.kivesz(300);
        fsz1.kivesz(150);

        // 4 tranzakcio van igy teszteljuk a levonKoltseg() fuggvenyt
        fsz1.levonKoltseg();
        System.out.println(fsz1);
        System.out.println();

        // itt teszteltem hogy noveli-e ujra a tranzakciokat a nullazas utan
        fsz1.betesz(1000);
        System.out.println(fsz1);

        // Equals tesztek
        System.out.println();
        System.out.println("Equals tesztek folyoszamlakra:");

        FolyoSzamla fsz2 = new FolyoSzamla(2000, "Kis Pista", 1234, fsz2_tranz);
        FolyoSzamla fsz3 = new FolyoSzamla(2050, "Kis Pista", 1234, fsz3_tranz);

        fsz2.kivesz(200);
        fsz3.kivesz(200);

        //truet kene kapni, mert ugyanannyi tranzakcio
        System.out.println(fsz2.equals(fsz3));

        //falset kene kapni, mert nem ugyanannyi a tranzakcio de tobbi megegyezik
        fsz3.kivesz(500);
        System.out.println(fsz2.equals(fsz3));
        // tobbi adatot is jol hasonlitja ossze


        // Takarekszamla tesztek
        System.out.println();
        System.out.println("Takarekszamla tesztek:");
        TakarekSzamla tsz1 = new TakarekSzamla(5500, "Nagy Zsolt", 123456, tsz_tranz);
        System.out.println(tsz1);

        // Teszt kamat rata beallitasara
        tsz1.setKamatRata(3.5);
        // 3.5-ot kene kiirjon, mert annyi van beallitva
        double kamatrata = tsz1.getKamatRata();
        System.out.println("Bealitott kamatrata: " + kamatrata + " %");

        // Kamat hozzadasa teszt
        tsz1.hozzaadKamat();

        // Equals tesztek
        System.out.println();
        System.out.println("Equals tesztek takarekszamlara:");
        TakarekSzamla tsz2 = new TakarekSzamla(200, "Szoboszlai Dominik", 123456, tsz_tranz);
        TakarekSzamla tsz3 = new TakarekSzamla(200, "Szoboszlai Dominik", 123456, tsz_tranz);
        // Kamatratak beallitasa
        tsz2.setKamatRata(2.5);
        tsz3.setKamatRata(2.5);
        // Truet ad, mert egyforma a kamatrata van beallitva
        System.out.println(tsz2.equals(tsz3));
        tsz3.setKamatRata(1.7);
        // Falset kene visszaadjon, mert atalitottam masodik takarekszamla a kamatratajat
        System.out.println(tsz2.equals(tsz3));
        // tobbi adatot is jol hasonlitja ossze
    }
}
