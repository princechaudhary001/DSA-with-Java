package Interface;

public class Demo {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Prince";
        s1.age = 22;
        s1.rollNumber = 101;
        s1.college = "ABES";

        s2.name = "Raj";
        s2.age = 22;
        s2.rollNumber = 103;
        s2.college = "ABES";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();

    }
}
class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println("Attendance marked by " + name);
    }
    void print(){
        System.out.println(name + " , " + age + " , " + rollNumber+" , ");
    }
}
