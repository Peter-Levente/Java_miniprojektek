import java.util.ArrayList;

public class HorrorFilm extends Film implements IKorhataros {
    private int korh;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Film korhatara: " + korh;
    }

    @Override
    public int Korhatar() {
        return korh;
    }

    @Override
    public int buntetes(int kor) {
        if (kor - korh < 0) {
            return Math.abs(kor - korh) * getAr();
        }
        return 0;
    }

    public static ArrayList<IKorhataros> getHorrorFilms(ArrayList<Film> films) {
        ArrayList<IKorhataros> horrorFilms = new ArrayList<>();
        for (Film film : films) {
            if (film instanceof HorrorFilm) {
                horrorFilms.add((IKorhataros) film);
            }
        }
        return horrorFilms;
    }

    public static int osszesBuntetes(ArrayList<IKorhataros> films, int kor) {
        int osszBuntetes = 0;
        for (IKorhataros film : films) {
            if (film instanceof HorrorFilm) {
                osszBuntetes += ((HorrorFilm) film).buntetes(kor);
            }
        }
        return osszBuntetes;
    }
}