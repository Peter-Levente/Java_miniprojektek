import java.util.ArrayList;

public class TakarekSzamla extends RegularisSzamla {
    private double kamatRata;

    public TakarekSzamla(double egyenleg, String tulajdonos_neve, int szamlaszam, ArrayList tranzakciok) {
        super(egyenleg, tulajdonos_neve, szamlaszam, tranzakciok);
    }

    public void hozzaadKamat() {
        double kamat_nelkuli_egyenleg = this.egyenleg;
        double kamat;
        kamat = egyenleg * kamatRata / 100;
        this.egyenleg = this.egyenleg + kamat;
        System.out.println();
        System.out.println("Egyeneleged kamatozott! " + kamat_nelkuli_egyenleg + " -> " + this.egyenleg);
    }

    public double getKamatRata() {
        return kamatRata;
    }

    public void setKamatRata(double kamatRata) {
        this.kamatRata = kamatRata;
    }

    @Override
    public String toString() {
        return "TakarekSzamla:" +
                " tulajdonos_neve= " + tulajdonos_neve +
                ", szamlaszam= " + szamlaszam +
                ", egyenleg= " + egyenleg +
                ", tranzakciok= " + tranzakciok;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        TakarekSzamla takarekSzamla = (TakarekSzamla) obj;

        return getTulajdonos_neve().equals(takarekSzamla.getTulajdonos_neve()) &&
                getSzamlaszam() == takarekSzamla.getSzamlaszam() &&
                getKamatRata() == takarekSzamla.getKamatRata();
    }
}