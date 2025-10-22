
class Book {
    protected String type;
    protected String name;
    protected String id;
    protected int quantity;

    public Book(String type, String name, String id, int quantity) {
        this.type = type;
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public String getType() { return type; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return "Type: " + type + ", Name: " + name + ", ID: " + id + ", Quantity: " + quantity;
    }
}
class FictionBook extends Book {
    private String genre;

    public FictionBook(String name, String id, int quantity, String genre) {
        super("FictionBook", name, id, quantity);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Genre: " + genre;
    }
}

class ScienceBook extends Book {
    private String field;

    public ScienceBook(String name, String id, int quantity, String field) {
        super("ScienceBook", name, id, quantity);
        this.field = field;
    }

    @Override
    public String toString() {
        return super.toString() + ", Field: " + field;
    }
}

class HistoryBook extends Book {
    private String period;

    public HistoryBook(String name, String id, int quantity, String period) {
        super("HistoryBook", name, id, quantity);
        this.period = period;
    }

    @Override
    public String toString() {
        return super.toString() + ", Period: " + period;
    }

    public static void main(String[] args) {
        // Tạo sẵn danh sách sách
        Book b1 = new FictionBook("HarryPotter", "F001", 10, "Fantasy");
        Book b2 = new ScienceBook("QuantumPhysics", "S001", 5, "Physics");
        Book b3 = new HistoryBook("WorldWar", "H001", 8, "20thCentury");

        // Hiển thị thông tin
        System.out.println("Books in library:");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
