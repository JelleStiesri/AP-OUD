public class Bezoeker {
    private String naam;
    private Ticket ticket;
    private Double saldo;
    private Drankje drankje;
    private Stoel stoel;

    public Bezoeker(String nM, Double saldo) {
        this.naam = nM;
        this.saldo = saldo;
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

    public void removeSaldo(Double bedrag) {
        this.saldo -= bedrag;
    }

    public void setDrankje(Drankje drankje){
        this.drankje = drankje;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
        this.stoel = ticket.getStoel();
    }

    public String toString(){
        return naam;
    }
}