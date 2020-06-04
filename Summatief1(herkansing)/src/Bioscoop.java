public class Bioscoop {
    private String naam;
    private String adres;

    public Bioscoop(String nM, String aD) {
        this.naam = nM;
        this.adres = aD;
    }

    public String toString() {
        return "'"+naam+"'" + " - Adres: " + adres + "\n";
    }
}