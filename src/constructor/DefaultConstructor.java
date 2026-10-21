package constructor;

public class DefaultConstructor {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);
    }
}

class Studentt {
    // Fixed: changed lowercase 'string' to uppercase 'String'
    String name;
    int age;
    int rollNo;
    String college;

    // No-argument constructor
    Studentt() {
        name = "prince";
        age = 28;
        rollNo = 101;
        college = "abes";
    }
}