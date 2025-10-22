class Ticket {
    protected String flightCode;
    protected String passengerName;
    protected double price;

    public Ticket(String flightCode, String passengerName, double price) {
        this.flightCode = flightCode;
        this.passengerName = passengerName;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println(flightCode + " " + passengerName + " " + price);
    }
}
class EconomyTicket extends Ticket {
    private String checkedBag;

    public EconomyTicket(String flightCode, String passengerName, double price, String checkedBag) {
        super(flightCode, passengerName, price);
        this.checkedBag = checkedBag;
    }

    @Override
    public void displayInfo() {
        System.out.println("Economy: " + flightCode + " " + passengerName + " " + price + " " + checkedBag);
    }
}

class BusinessTicket extends Ticket {
    private String loungeAccess;

    public BusinessTicket(String flightCode, String passengerName, double price, String loungeAccess) {
        super(flightCode, passengerName, price);
        this.loungeAccess = loungeAccess;
    }

    @Override
    public void displayInfo() {
        System.out.println("Business: " + flightCode + " " + passengerName + " " + price + " " + loungeAccess);
    }
}

class FirstClassTicket extends Ticket {
    private String privateSuite;

    public FirstClassTicket(String flightCode, String passengerName, double price, String privateSuite) {
        super(flightCode, passengerName, price);
        this.privateSuite = privateSuite;
    }

    @Override
    public void displayInfo() {
        System.out.println("FirstClass: " + flightCode + " " + passengerName + " " + price + " " + privateSuite);
    }

    public static void main(String[] args) {
        Ticket t1 = new EconomyTicket("VN123", "John", 100, "CheckedBag");
        Ticket t2 = new BusinessTicket("VN124", "Alice", 300, "LoungeAccess");
        Ticket t3 = new FirstClassTicket("VN125", "Bob", 1000, "PrivateSuite");

        t1.displayInfo();
        t2.displayInfo();
        t3.displayInfo();
    }
}
