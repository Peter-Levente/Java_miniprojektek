import java.util.ArrayList;

public class Teszter {
    public static void main(String[] args) {
        ArrayList<Film> films = new ArrayList<>();

        films.add(new Film("Halalos Iramban", 50));
        films.add(new Film("Fegyvertelen Katona", 60));
        films.add(new Film("Titanic", 30));
        films.add(new Film("Avatar", 35));
        films.add(new Film("Indul a bakterhaz", 25));
        films.add(new Film("Harag", 35));

        films.add(new HorrorFilm("Demonok kozott", 50, 17));
        films.add(new HorrorFilm("AZ", 40, 16));
        films.add(new HorrorFilm("Sikoly", 25, 16));
        films.add(new HorrorFilm("Az apaca", 35, 17));
        films.add(new HorrorFilm("Az ordoguzo", 55, 18));
        films.add(new HorrorFilm("Mosolyogj", 30, 16));

        System.out.println("Osszes film:");
        System.out.println();
        for (Film film : films) {
            System.out.println(film);
        }

        Film.RendezesArSzerint(films);

        ArrayList<IKorhataros> korhataros_filmek = HorrorFilm.getHorrorFilms(films);
        System.out.println("\nKorhatáros filmek:");
        for (IKorhataros film : korhataros_filmek) {
            System.out.println(film);
        }

        int buntetes_18_evesnek = HorrorFilm.osszesBuntetes(korhataros_filmek, 18);
        System.out.println("\nAz összes büntetés 18 éves kor esetén: " + buntetes_18_evesnek);

        int buntetes_17_evesnek = HorrorFilm.osszesBuntetes(korhataros_filmek, 17);
        System.out.println("\nAz összes büntetés 17 éves kor esetén: " + buntetes_17_evesnek);

        int buntetes_16_evesnek = HorrorFilm.osszesBuntetes(korhataros_filmek, 16);
        System.out.println("\nAz összes büntetés 16 éves kor esetén: " + buntetes_16_evesnek);
    }
}