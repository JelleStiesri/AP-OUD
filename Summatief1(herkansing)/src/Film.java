public class Film {
    private String naam;
    private int lengte;
    private Double prijs; // Baisprijs

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
}