import java.util.ArrayList;

public class RegularisSzamla implements Bankszamla {
    protected double egyenleg;
    protected String tulajdonos_neve;
    protected int szamlaszam;
    private static int szamlakSzama;
    protected ArrayList<Tranzakcio> tranzakciok;

    public RegularisSzamla(double egyenleg, String tulajdonos_neve, int szamlaszam, ArrayList tranzakciok) {
        this.egyenleg = egyenleg;
        this.tulajdonos_neve = tulajdonos_neve;
        this.szamlaszam = szamlaszam;
        this.szamlakSzama = ujSzamlaSzam();
        this.tranzakciok = tranzakciok;
    }

    private int ujSzamlaSzam() {
        szamlakSzama += 1;
        return szamlakSzama;
    }

    public double getEgyenleg() {
        return egyenleg;
    }

    public void setEgyenleg(double egyenleg) {
        this.egyenleg = egyenleg;
    }

    public String getTulajdonos_neve() {
        return tulajdonos_neve;
    }

    public void setTulajdonos_neve(String tulajdonos_neve) {
        this.tulajdonos_neve = tulajdonos_neve;
    }

    public int getSzamlaszam() {
        return szamlaszam;
    }

    public void setSzamlaszam(int szamlaszam) {
        this.szamlaszam = szamlaszam;
    }

    public static int getSzamlakSzama() {
        int osszes_szamla = szamlakSzama;
        System.out.println("Szamlak szama: " + osszes_szamla);
        System.out.println();
        return szamlakSzama;
    }

    public ArrayList getTranzakciok() {
        return tranzakciok;
    }

    public void setTranzakciok(ArrayList tranzakciok) {
        this.tranzakciok = tranzakciok;
    }

    @Override
    public int betesz(double osszeg) {
        this.egyenleg += osszeg;
        Tranzakcio tr = new Tranzakcio(Tranzakcio.TranzakcioTipus.DEPOSIT, osszeg);
        tranzakciok.add(tr);
        return tranzakciok.size();
    }

    @Override
    public int kivesz(double osszeg) {
        this.egyenleg -= osszeg;
        Tranzakcio tr = new Tranzakcio(Tranzakcio.TranzakcioTipus.WITDRAW, osszeg);
        tranzakciok.add(tr);
        return tranzakciok.size();
    }

    @Override
    public String toString() {
        return "RegularisSzamla:" +
                " tulajdonos_neve= " + tulajdonos_neve +
                ", szamlaszam= " + szamlaszam +
                ", egyenleg= " + egyenleg +
                ", tranzakciok=" + tranzakciok;
    }
}