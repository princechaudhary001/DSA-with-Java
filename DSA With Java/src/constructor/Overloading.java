package constructor;

    class Overloading {

        Overloading() {
            System.out.println("No argument constructor");
        }

        Overloading(int age) {
            System.out.println("Age: " + age);
        }

        Overloading(int age, String name) {
            System.out.println("Age: " + age + ", Name: " + name);
        }

        public static void main(String[] args) {

            Overloading s1 = new Overloading();
            Overloading s2 = new Overloading(20);
            Overloading s3 = new Overloading(20, "Prince");
//     Using this keyword
//            class Student {
//                int age;
//                String name;
//
//                Student(int age, String name) {
//                    this.age = age;
//                    this.name = name;
//                }
//
//                void display() {
//                    System.out.println(age);
//                    System.out.println(name);
//                }
//
//                public static void main(String[] args) {
//                    Student s = new Student(20, "Prince");
//                    s.display();
//                }
//            }
        }
    }

