public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product() {
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Laptop");
        p1.setPrice(1500);
        p1.setQuantity(10);
        Product p2 = new Product("Smartphone", 800, 20);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
