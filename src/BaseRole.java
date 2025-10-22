class BaseRole {
    String name;
    BaseRole(String name) { this.name = name; }
    void displayInfo() {}
}

class Teacher extends BaseRole {
    String subject; int hours;
    Teacher(String n, String s, int h) { super(n); subject = s; hours = h; }
    void displayInfo() { System.out.println(name + " " + subject + " " + hours); }
}

class Researcher extends BaseRole {
    String field; int papers;
    Researcher(String n, String f, int p) { super(n); field = f; papers = p; }
    void displayInfo() { System.out.println(name + " " + field + " " + papers); }
}

class TeacherResearcher extends BaseRole {
    String subject, field; int hours, papers;
    TeacherResearcher(String n, String s, int h, String f, int p) {
        super(n); subject = s; hours = h; field = f; papers = p;
    }
    void displayInfo() {
        System.out.println(name + " " + subject + " " + hours + "," + field + " " + papers);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", "Math", 20);
        Researcher r = new Researcher("Bob", "AI", 15);
        TeacherResearcher tr = new TeacherResearcher("Charlie", "Physics", 10, "Quantum", 5);

        System.out.println("Roles:");
        System.out.println("Teacher:"); t.displayInfo();
        System.out.println("Researcher:"); r.displayInfo();
        System.out.println("TeacherResearcher:"); tr.displayInfo();
    }
}
