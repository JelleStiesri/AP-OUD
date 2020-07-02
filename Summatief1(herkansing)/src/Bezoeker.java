import java.util.*;

public class Bezoeker {
    private String naam;
    private Ticket ticket;
    private Double saldo;
    private ArrayList<Drankje> drankjes = new ArrayList<>();
    private Stoel stoel;

    public Bezoeker(String naam, Double saldo) {
        this.naam = naam;
        this.saldo = saldo;
    }

    public void addDrankje(Drankje drankje){
        drankjes.add(drankje);
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

    public ArrayList<Drankje> getDrankje(){
        return drankjes;
    }

    public Ticket getTicket(){
        return ticket;
    }

    public String toString(){
        return naam;
    }
}