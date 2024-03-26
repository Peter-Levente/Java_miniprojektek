import java.util.ArrayList;

public class Film {
    private String cim;
    private int ar;
    private int[] velemenyek;

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public int[] getVelemenyek() {
        return velemenyek;
    }

    @Override
    public String toString() {
        return "Film cime: " + cim +
                ", Film ara: " + ar;
    }

    public void setVelemenyek(int[] velemenyek) {
        if (velemenyek.length <= 20) {
            this.velemenyek = velemenyek;
        } else {
            throw new IllegalArgumentException("A vélemények tömb nem lehet hosszabb, mint 20 elem.");
        }
    }

    public void Velemenyezes(int velemeny) {
        if (velemeny >= 1 && velemeny >= 5) {
            for (int i = 0; i < velemenyek.length; i++) {
                if (velemenyek[i] == 0) {
                    velemenyek[i] = velemeny;
                    break;
                }
            }
        } else {
            throw new IllegalArgumentException("A vélemény értéke csak 1 és 5 között lehet.");
        }
    }

    public void Atlag(String filmCim, int[] velemenyek_tomb) {
        double sum = 0;
        double atlag;

        for (int i = 0; i < velemenyek_tomb.length; i++) {
            sum += velemenyek_tomb[i];
        }
        atlag = sum / velemenyek_tomb.length;

        if (sum == 0) {
            System.out.println("A film még nem kapott egy véleményt sem!");
        } else {
            System.out.println(filmCim + "vélemenyeinek átlaga: " + atlag);
        }
    }

    public static void RendezesArSzerint(ArrayList<Film> filmek) {
        for (int i = 0; i < filmek.size(); i++) {
            for (int j = 0; j < filmek.size() - 1; j++) {
                if (filmek.get(j).getAr() < filmek.get(j + 1).getAr()) {
                    Film ideiglenes = filmek.get(j);
                    filmek.set(j, filmek.get(j + 1));
                    filmek.set(j + 1, ideiglenes);
                }
            }
        }
        System.out.println();
        System.out.println("Filmek ar szerint novekvo sorrendben:");
        System.out.println();
        for (Film film : filmek) {
            System.out.println("Film címe: " + film.getCim() + ", Ár: " + film.getAr());
        }
    }
}