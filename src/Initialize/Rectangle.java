public class Rectangle {
    private double width;
    private double height;
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(5);
        r1.setHeight(10);
        Rectangle r2 = new Rectangle(2.5, 1.1);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
