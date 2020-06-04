public class Zaal{
    private String zaalnaam;
    private int stoelen;
    private Bioscoop bios;
    private Film film;
    private double filmprijs;

    public Zaal(String nM, int St, Bioscoop bs) {
        this.zaalnaam = nM;
        this.stoelen = St;
        this.bios = bs;
    }

    public void setFilm(Film fm) {
        this.film = fm;
        this.filmprijs = fm.getPrice();
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