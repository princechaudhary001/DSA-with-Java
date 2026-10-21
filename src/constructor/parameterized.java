package constructor;

public class parameterized {
    public static void main(String[] args) {
        // Fixed: Removed named labels (n:, a:, etc.) and passed values positionally
        Student s1 = new Student("prince", 22, 102, "abes");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    // Fixed: Moved inside the class and changed 'string' to 'String'
    Student(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rollNumber = rn;
        college = c;
    }
}