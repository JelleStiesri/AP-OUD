import java.util.*;

public class Zaal{
    private String zaalNaam;
    private ArrayList<Stoel> stoelen = new ArrayList<>();
    private Bioscoop bioscoop;
    private Film film;
    private double filmPrijs;

    public Zaal(String zaalNaam, Bioscoop bioscoop) {
        this.zaalNaam = zaalNaam;
        this.bioscoop = bioscoop;
    }

    public void setFilm(Film film) {
        this.film = film;
        this.filmPrijs = film.getPrijs();
    }

    public void addStoel(Stoel stoel){
        stoelen.add(stoel);
    }

    public double getFilmPrijs() {
        return filmPrijs;
    }

    public String getZaalnaam(){
        return zaalNaam;
    }
    
    public String toString() {
        return String.format("Film: '%s' - Lengte: %s minuten", film.getNaam(), film.getLengte());
    }
}