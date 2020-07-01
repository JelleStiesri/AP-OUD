public class Bezoeker {
    private String naam;
    private Ticket ticket;
    private Double saldo;
    private Drankje drankje;
    private Stoel stoel;

    public Bezoeker(String naam, Double saldo) {
        this.naam = naam;
        this.saldo = saldo;
    }

    public void setDrankje(Drankje drankje){
        this.drankje = drankje;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
        this.stoel = ticket.getStoel();
    }

    public void removeSaldo(Double bedrag) {
        this.saldo -= bedrag;
    }

    public Double getSaldo(){
        return saldo;
    }

    public Drankje getDrankje(){
        return drankje;
    }

    public Ticket getTicket(){
        return ticket;
    }

    public String toString(){
        return naam;
    }
}