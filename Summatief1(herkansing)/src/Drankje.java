public class Drankje implements  Item{
    private String naam;
    private double prijs;

    public Drankje(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
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