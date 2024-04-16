import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tranzakcio {
    protected LocalDateTime idopont;

    enum TranzakcioTipus {
        DEPOSIT, WITDRAW
    }

    protected TranzakcioTipus tranzTipus;
    protected double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, Double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    public LocalDateTime getIdopont() {
        return idopont;
    }

    public void setIdopont(LocalDateTime idopont) {
        this.idopont = idopont;
    }

    public TranzakcioTipus getTranzTipus() {
        return tranzTipus;
    }

    public void setTranzTipus(TranzakcioTipus tranzTipus) {
        this.tranzTipus = tranzTipus;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(double osszeg) {
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String Idopont = idopont.format(formatter);
        return "\nTranzakcio:" +
                " idopont=" + Idopont +
                ", tranzTipus=" + tranzTipus +
                ", osszeg=" + osszeg;
    }
}