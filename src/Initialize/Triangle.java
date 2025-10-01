public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle() {
        this.sideA = 0.0;
        this.sideB = 0.0;
        this.sideC = 0.0;
    }
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setSideA(3);
        t1.setSideB(4);
        t1.setSideC(5);
        Triangle t2 = new Triangle(6, 7, 8);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
