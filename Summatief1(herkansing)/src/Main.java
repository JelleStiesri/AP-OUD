public class Main {
    public static void main(String[] args) {
        Bioscoop bios1 = new Bioscoop("Biosopo", "Cavialaan 10");
        Zaal zaal1 = new Zaal("Blauwe zaal", bios1);

        Bezoeker b1 = new Bezoeker("Klaas", 250.20);
        Bezoeker b2 = new Bezoeker("Piet", 14.20);

        System.out.println("Saldo Bezoeker 1: " + b1.getSaldo());
        System.out.println("Saldo Bezoeker 2: " + b2.getSaldo());

        System.out.println("\n===================\nTest Drankjes:");
        Drankje Cola = new Drankje("Cola", 2.30);
        Drankje Fanta = new Drankje("Fanta", 2.30);
        Drankje Thee = new Drankje("Thee", 2.00);

        Bar bar = new Bar(bios1,4323.54);
        bar.addDrankje(Cola, 20);
        bar.addDrankje(Thee, 10);

        bar.koopDrankje(b1, Cola);
        bar.koopDrankje(b1, Thee);
        System.out.println("Drankjes Bezoeker 1: "+b1.getDrankje());
        bar.koopDrankje(b2, Fanta);
        System.out.println("Drankjes Bezoeker 2: "+b2.getDrankje()); // Error want Fanta niet op voorraad
        bar.koopDrankje(b2, Thee);
        System.out.println("Drankjes Bezoeker 2: "+b2.getDrankje());


        System.out.println("\n===================\nTest Tickets:\n");
        System.out.println("Saldo Bezoeker 1: " + b1.getSaldo());
        System.out.println("Saldo Bezoeker 2: " + b2.getSaldo());
        //MAAK FILMS, STOELEN EN TICKETS AAN
        Film film1 = new Film("Jantje's gekke avonturen", 120, 11.00);
        zaal1.setFilm(film1);
        System.out.println("\n"+ film1.getLengte() + " minuten - " + film1.getNaam() + " " + film1.getPrijs() + " - Euro");

        Stoel stoel1 = new Stoel("1");
        stoel1.setZaal(zaal1);
        zaal1.addStoel(stoel1); // Voegt stoel toe aan zaal
        Stoel stoel2 = new Stoel("2");
        stoel2.setZaal(zaal1);
        zaal1.addStoel(stoel2);

        Ticket ticket1= new Ticket("Ticket 'Jantje's gekke avonturen' - Normaal", film1, stoel1, false);
        stoel1.setTicket(ticket1);
        System.out.println(ticket1.getNaam() + " " + ticket1.getFilm() + " " + ticket1.getPrijs());

        Ticket ticket2= new Ticket("Ticket 'Jantje's gekke avonturen' - Luxe", film1, stoel2, true);
        stoel2.setTicket(ticket2);
        System.out.println(ticket2.getNaam() + " " + ticket2.getFilm() + " " + ticket2.getPrijs());

        //Vul kassa aan met tickets
        Kassa kassa = new Kassa(bios1, 1239.10);
        kassa.addTicket(ticket1, 1); // Tickets zijn uniek, daarom maar 1 beschikbaar
        kassa.addTicket(ticket2, 1);

        //Laat bezoeker ticket kopen
        System.out.println("\nTickets kopen:");
        kassa.koopTicket(b2, ticket2); // Saldo bezoeker < prijs ticket --> foutmelding
        System.out.println("Ticket: " + b2.getTicket());
        kassa.koopTicket(b2, ticket1); // Saldo bezoeker > prijs ticket --> geslaagde koop
        System.out.println("Ticket: " + b2.getTicket());
        kassa.koopTicket(b1, ticket2); // Saldo bezoeker > prijs ticket --> geslaagde koop
        System.out.println("Ticket: " + b1.getTicket());

        System.out.println("\nBezoeker van stoel 1: " + stoel1.getPersoon());
        System.out.println("Bezoeker van stoel 2: " + stoel2.getPersoon());
    }
}