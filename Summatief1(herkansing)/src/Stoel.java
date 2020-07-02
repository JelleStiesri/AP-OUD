public class Stoel {
    public Zaal zaal;
    public String nummer;
    public Bezoeker persoon;
    public Ticket ticket;

    public Stoel(String nummer) {
        this.nummer=nummer;
    }

    public void setZaal(Zaal zaal){
        this.zaal = zaal;
    }

    public void setTicket(Ticket ticket) {
        this.ticket=ticket;
    }

    public void setPersoon(Bezoeker persoon) {
        this.persoon=persoon;
    }

    public Bezoeker getPersoon(){
        return persoon;
    }

    public String toString() {
        return nummer;
    }
}
