public class TicketRepository {
    public Ticket[] tickets = new Ticket[0];

    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public void removeId(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int copyId = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[copyId] = ticket;
                copyId++;
            }
        }
        tickets = tmp;
    }

    public Ticket[] findAll() {
        return tickets;
    }
}
