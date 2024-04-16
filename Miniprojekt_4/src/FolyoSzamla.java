import java.util.ArrayList;

public class FolyoSzamla extends RegularisSzamla {
    private int tranzakciokSzama = 0;
    private int ingyenes_tranz_szama = 3;
    private double tranz_ara = 6.50;

    public FolyoSzamla(double egyenleg, String tulajdonos_neve, int szamlaszam, ArrayList tranzakciok) {
        super(egyenleg, tulajdonos_neve, szamlaszam, tranzakciok);
    }

    public int getTranzakciokSzama() {
        return tranzakciokSzama;
    }

    public void setTranzakciokSzama(int tranzakciokSzama) {
        this.tranzakciokSzama = tranzakciokSzama;
    }

    public int getIngyenes_tranz_szama() {
        return ingyenes_tranz_szama;
    }

    public void setIngyenes_tranz_szama(int ingyenes_tranz_szama) {
        this.ingyenes_tranz_szama = ingyenes_tranz_szama;
    }

    public double getTranz_ara() {
        return tranz_ara;
    }

    public void setTranz_ara(double tranz_ara) {
        this.tranz_ara = tranz_ara;
    }

    @Override
    public String toString() {
        return "FolyoSzamla:" +
                " tulajdonos_neve= " + tulajdonos_neve +
                ", szamlaszam= " + szamlaszam +
                ", egyenleg= " + egyenleg +
                ", tranzakciok= " + tranzakciok+
                ", tranzakciok szama= " + tranzakciokSzama;

    }

    @Override
    public int betesz(double osszeg) {
        this.egyenleg+=osszeg;
        tranzakciokSzama++;
        Tranzakcio tr = new Tranzakcio(Tranzakcio.TranzakcioTipus.DEPOSIT, osszeg);
        tranzakciok.add(tr);
        return tranzakciok.size();
    }

    @Override
    public int kivesz(double osszeg) {
        this.egyenleg-=osszeg;
        tranzakciokSzama++;
        Tranzakcio tr = new Tranzakcio(Tranzakcio.TranzakcioTipus.WITDRAW, osszeg);
        tranzakciok.add(tr);
        return tranzakciok.size();
    }

    public double levonKoltseg() {
        double regi_egyenleg=egyenleg;

        if (tranzakciokSzama > ingyenes_tranz_szama) {
            double levonando_osszeg;

            levonando_osszeg= tranz_ara * (tranzakciokSzama - ingyenes_tranz_szama);
            egyenleg=egyenleg-levonando_osszeg;
            tranzakciokSzama = 0;

            System.out.println();
            System.out.println("Tullepted a "+ ingyenes_tranz_szama+" ingyenes tranzakciod szamat!"
                    +"\nA levont összeg: "+levonando_osszeg+" ezt levontuk az azelotti egyenlegedbol: "+regi_egyenleg
                    + "\nUj egyenleged: "+egyenleg);
            System.out.println();

        }return egyenleg;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        FolyoSzamla folyoSzamla = (FolyoSzamla) obj;

        return getTulajdonos_neve().equals(folyoSzamla.getTulajdonos_neve()) &&
                getSzamlaszam() == folyoSzamla.getSzamlaszam() &&
                getTranzakciokSzama() == folyoSzamla.getTranzakciokSzama();
    }
}