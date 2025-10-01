public class Player {
    private String name;
    private int age;
    private int positionX;
    private int positionY;
    public Player() {
        this.name = "";
        this.age = 0;
        this.positionX = 0;
        this.positionY = 0;
    }
    public Player(String name, int age, int positionX, int positionY) {
        this.name = name;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPositionX() {
        return positionX;
    }
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    public int getPositionY() {
        return positionY;
    }
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("Messi");
        p1.setAge(37);
        p1.setPositionX(10);
        p1.setPositionY(20);
        Player p2 = new Player("Ronaldo", 40, 15, 25);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
