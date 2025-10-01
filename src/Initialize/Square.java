public class Square {
    private double side;
    public Square() {
        this.side = 0.0;
    }
    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setSide(5);
        Square s2 = new Square(10);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
