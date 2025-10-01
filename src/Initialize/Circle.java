public class Circle {
    private double radius;
    public Circle() {
        this.radius = 0.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        Circle c2 = new Circle(10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
