public class Film {
    private String naam;
    private int lengte;
    private Double prijs; // Basisprijs

    public Film(String nM, int len, Double prijs){
        this.naam = nM;
        this.lengte = len;
        this.prijs = prijs;
    }

    public double getPrice() {
        return prijs;
    }

    public int getLengte(){
        return lengte;
    }

    public String getNaam(){
        return naam;
    }

    public String toString() {
        return naam;
    }
}