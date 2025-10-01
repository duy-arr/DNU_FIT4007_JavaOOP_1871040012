public class Car {
    private String color;
    private String name;
    private int seatingCapacity;
    private int year;
    public Car() {
        this.color = "";
        this.name = "";
        this.seatingCapacity = 0;
        this.year = 0;
    }
    public Car(String color, String name, int seatingCapacity, int year) {
        this.color = color;
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", year=" + year +
                '}';
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setColor("Red");
        c1.setName("Toyota Vios");
        c1.setSeatingCapacity(5);
        c1.setYear(2025);
        Car c2 = new Car("Black", "Honda Civic", 5, 2025);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
