import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    TicketRepository repository = new TicketRepository();
    TicketManager manager = new TicketManager(repository);

    Ticket ticket1 = new Ticket(1, 12599, "SVO", "AER", 150);
    Ticket ticket2 = new Ticket(5, 10599, "SVO", "AER", 150);
    Ticket ticket3 = new Ticket(45, 10059, "AER", "SVO", 140);
    Ticket ticket4 = new Ticket(6, 17599, "SVO", "AER", 150);
    Ticket ticket5 = new Ticket(8, 12899, "AER", "SVO", 140);
    Ticket ticket6 = new Ticket(12, 10289, "DME", "TSE", 140);
    Ticket ticket7 = new Ticket(82, 12599, "SVO", "AER", 155);

    @Test
    public void souldFindTicket() {
        repository.add(ticket1);
        repository.add(ticket2);
        repository.add(ticket3);
        repository.add(ticket4);
        repository.add(ticket5);
        repository.add(ticket7);

        Ticket[] expected = {ticket2, ticket1, ticket7, ticket4};
        Ticket[] actual = manager.findAll("SVO", "AER");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void souldOnFindTicket() {
        repository.add(ticket1);
        repository.add(ticket2);
        repository.add(ticket3);
        repository.add(ticket4);
        repository.add(ticket5);
        repository.add(ticket6);

        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.findAll("DME", "TSE");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void souldNothingFindTicket() {
        repository.add(ticket1);
        repository.add(ticket2);
        repository.add(ticket3);
        repository.add(ticket4);
        repository.add(ticket5);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("DME", "AER");

        Assertions.assertArrayEquals(expected, actual);
    }
}
