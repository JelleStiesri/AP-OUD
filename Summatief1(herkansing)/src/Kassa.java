import java.util.*;

public class Kassa implements Winkel{
    HashMap<Ticket, Integer> tickets = new HashMap<>();
    Bioscoop bioscoop;
    Double saldo;

    public Kassa(Bioscoop bioscoop, Double saldo) {
        this.bioscoop = bioscoop;
        this.saldo = saldo;
    }

    public void addTicket(Ticket ticket, Integer aantal) {
        tickets.put(ticket,aantal);
    }

    public void koopTicket(Bezoeker klant, Ticket ticket){
        Double prijs = ticket.getPrijs();
        if (tickets.get(ticket) == null || tickets.get(ticket) == 0) { // Voorraad check
            System.out.println("\nDrankje niet op voorraad");
        }else{
            if (klant.getSaldo() < prijs) {
                System.out.println("\nSaldo klant te laag");
            }else{
                klant.removeSaldo(prijs); // Bedrag word afgeschreven bij klant
                addSaldo(prijs); // Bedrag word bijgeschreven bij bar
                System.out.println("\nBetaling afgerond");
                tickets.replace(ticket,tickets.get(ticket)-1); // Vooraadcorrectie
                klant.setTicket(ticket);
                Stoel stoel = ticket.getStoel();
                stoel.setPersoon(klant);
            }
        }
    }

    @Override
    public void addSaldo(Double bedrag){
        this.saldo += bedrag;
    }

    @Override
    public void removeSaldo(Double bedrag){
        this.saldo -= bedrag;
    }

    @Override
    public Double getSaldo(){
        return saldo;
    }
}
