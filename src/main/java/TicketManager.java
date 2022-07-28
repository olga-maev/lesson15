import java.util.Arrays;

public class TicketManager {
    public TicketRepository repository;

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public Ticket[] findAll(String fromAirport, String toAirport) {
        Ticket[] rezult = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (matches(ticket, fromAirport, toAirport)) {
                Ticket[] tmp = new Ticket[rezult.length + 1];
                for (int i = 0; i < rezult.length; i++) {
                    tmp[i] = rezult[i];
                }
                tmp[tmp.length - 1] = ticket;
                Arrays.sort(tmp);
                rezult = tmp;
            }
        }
        return rezult;
    }

    public boolean matches(Ticket ticket, String searchFrom, String searchTo) {
        if ((ticket.getFromAirport().contains(searchFrom)) && (ticket.getToAirport().contains(searchTo))) {
            return true;
        } else {
            return false;
        }
    }
}
