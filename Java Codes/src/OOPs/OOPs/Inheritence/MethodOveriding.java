package OOPs.OOPs.Inheritence;

class SuperClass {
    void display() {
        System.out.println("Hello");
    }
}

class SubClass extends SuperClass {
    void display() {
        System.out.println("Welcome");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {

        SubClass sb = new SubClass();
        sb.display();

        SuperClass su = new SubClass();
        su.display();

    }
}
