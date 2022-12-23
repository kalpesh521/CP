
public class classes {

    public static void main(String[] args) {
        Student kp = new Student();
        Student pp = new Student(21, "virat", 90);
        Student random = new Student(kp);
        Student random2 = new Student();

        System.out.println(kp.rollno);// Call to default constructor
        System.out.println(pp.rollno);// call to parameterized cnstructor
        System.out.println(random.rollno);
        System.out.println(random2.name);// calling one constructor to another constructor

        pp.greetings();// CAlling method
        kp.changeName("Rohit");
        System.out.println(kp.name);

        // Memory Allocation with new keyword
        Student one = new Student();
        Student two = one;

        System.out.println(one.name);
        System.out.println(two.name);

        final A kpp = new A("KAlpesh");
        kpp.name = "other name ";
        System.out.println(kpp.name);

         


    }
}

class Student {
    int rollno;
    String name;
    float marks;

    // Method
    void greetings() {
        System.out.println("My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;

    }

    // default Constructor
    /*
     * Student() {
     * this.rollno = 8;
     * this.name = "KAlpesh";
     * this.marks = 40;
     * }
     */
    // Parameterised Constructor
    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    Student() {
        // internally : replace with --> new Student(21,"virat",90)
        this(22, "shreyash", 68);
    }

}


/*
 final Keyword : can't modify value in promitive data type
                : Can change value in object 
                can't modify in redeclaration
 */
class A {
    String name;
    final int a = 10;

    A(String name) {
        this.name = name;
    }
}