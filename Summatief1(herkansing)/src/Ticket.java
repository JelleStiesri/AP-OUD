public class Ticket implements Item{
    private String naam;
    private Film film;
    private double prijs;

    public Ticket(String naam, Film film, boolean luxe) {
        this.naam = naam;
        this.film = film;
        if (!luxe) {
            this.prijs = film.getPrice();
        }else {
            this.prijs = film.getPrice() * 1.5;
        }
    }

    public Film getFilm() {
        return film;
    }

    @Override
    public double getPrijs() {
        return prijs;
    }

    @Override
    public String getNaam() {
        return naam;
    }


}