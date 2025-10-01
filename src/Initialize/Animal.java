package Initialize;
public class Animal {
    private String name;
    private String color;
    private int age;
    public Animal() {
        this.name = "";
        this.color = "";
        this.age = 0;
    }
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("Dog");
        a1.setColor("Brown");
        a1.setAge(3);
        Animal a2 = new Animal("Cat", "White", 2);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
