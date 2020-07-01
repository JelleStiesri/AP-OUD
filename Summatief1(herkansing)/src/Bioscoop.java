public class Bioscoop {
    private String naam;
    private String adres;

    public Bioscoop(String naam, String adres) {
        this.naam = naam;
        this.adres = adres;
    }

    public String toString() {
        return "'"+naam+"'" + " - Adres: " + adres + "\n";
    }
}