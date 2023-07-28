package OOPs.OOPs.TypesOfClass;

// Anonymous class -> We can define concrete class in abstract class
abstract class My {
    abstract void display();
}

interface test {
    public void method1();
}

class OuterAn {
    void show() {
        My m = new My() {  // Created Anonymous class with abstract class reference
            @Override
            void display() {
                System.out.println("Hello");
            }
        };
        m.display();

        new test() {// Created Anonymous class with  interface
            public void method1() {
                System.out.println("Hello from interface");
            }
        }.method1();
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        OuterAn oa = new OuterAn();
        oa.show();
    }
}
