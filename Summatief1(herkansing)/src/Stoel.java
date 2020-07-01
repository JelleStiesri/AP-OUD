public class Stoel {
    public Zaal zaal;
    public String nummer;
    public Bezoeker persoon;
    public Ticket ticket;

    public Stoel(String nummer, Zaal zaal) {
        this.zaal=zaal;
        this.nummer=nummer;
    }

    public void setTicket(Ticket ticket) {
        this.ticket=ticket;
    }

    public Bezoeker getPersoon(){
        return persoon;
    }

    public void setPersoon(Bezoeker persoon) {
        this.persoon=persoon;
    }

    public String toString() {
        return nummer;
    }
}
