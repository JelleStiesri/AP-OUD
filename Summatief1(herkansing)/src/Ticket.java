public class Ticket implements Item{
    private String naam;
    private Film film;
    private double prijs;
    private Bezoeker bezoeker;
    private Stoel stoel;

    public Ticket(String naam, Film film, Stoel stoel, boolean luxe) {
        this.naam = naam;
        this.film = film;
        this.stoel=stoel;
        if (!luxe) {
            this.prijs = film.getPrijs();
        }else {
            this.prijs = film.getPrijs() * 1.5;
        }
    }

    public void setBezoeker(Bezoeker bezoeker){
        this.bezoeker = bezoeker;
    }

    public Film getFilm() {
        return film;
    }

    public Stoel getStoel() {
        return stoel;
    }

    @Override
    public double getPrijs() {
        return prijs;
    }

    @Override
    public String getNaam() {
        return naam;
    }

    public String toString() {
        return naam;
    }

}