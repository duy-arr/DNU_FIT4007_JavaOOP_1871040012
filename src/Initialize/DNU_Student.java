public class DNU_Student {
    private String masv;
    private String name;
    private int age;
    public DNU_Student() {
        this.masv = "";
        this.name = "";
        this.age = 0;
    }
    public DNU_Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }
    public String getMasv() {
        return masv;
    }
    public void setMasv(String masv) {
        this.masv = masv;
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
    @Override
    public String toString() {
        return "Student{" +
                "masv='" + masv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void main(String[] args) {
        DNU_Student s1 = new DNU_Student();
        s1.setMasv("SV001");
        s1.setName("Nguyen Van A");
        s1.setAge(20);
        DNU_Student s2 = new DNU_Student("1871040012", "Lê Quốc Duy", 20);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
