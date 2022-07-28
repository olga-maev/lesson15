public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String fromAirport;
    private String toAirport;
    private int timeFly;

    public Ticket(int id, int price, String fromAirport, String toAirport, int timeFly) {
        this.id = id;
        this.price = price;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.timeFly = timeFly;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public int getTimeFly() {
        return timeFly;
    }

    public void setTimeFly(int timeFly) {
        this.timeFly = timeFly;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
