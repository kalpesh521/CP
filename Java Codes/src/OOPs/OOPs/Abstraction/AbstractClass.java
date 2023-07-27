package OOPs.OOPs.Abstraction;

abstract class Super {
    public Super() {
        System.out.println("SuperClass Constructor");
    }

    public void meth1() {
        System.out.println("Method 1 of Superclass");
    }

    abstract void meth2();

}

class Sub extends Super {
    public void meth2() { //override
        System.out.println("Method o subclass");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Super sp = new Sub(); //override meth2
        sp.meth1();
        sp.meth1();
    }
}
