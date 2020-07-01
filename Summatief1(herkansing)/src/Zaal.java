import java.util.*;

public class Zaal{
    private String zaalnaam;
    private ArrayList<Stoel> stoelen = new ArrayList<>();
    private Bioscoop bios;
    private Film film;
    private double filmprijs;

    public Zaal(String zaalnaam, Bioscoop bios) {
        this.zaalnaam = zaalnaam;
        this.bios = bios;
    }

    public void setFilm(Film film) {
        this.film = film;
        this.filmprijs = film.getPrijs();
    }

    public void addStoel(Stoel stoel){
        stoelen.add(stoel);
    }

    public double getFilmprijs() {
        return filmprijs;
    }

    public String getZaalnaam(){
        return zaalnaam;
    }

    @Override
    public String toString() {
        return String.format("Film: '%s' - Lengte: %s minuten", film.getNaam(), film.getLengte());
    }
}