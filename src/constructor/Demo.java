package constructor;

public class Demo {
    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}

class Students { // information/data/characteristics --> instance variables
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){ // behaviour -- > functions ---> instance methods
        System.out.println("Attendance marked for student "+ name);
    }

}