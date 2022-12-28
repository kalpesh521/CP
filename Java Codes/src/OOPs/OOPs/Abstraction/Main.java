package OOPs.OOPs.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son obj = new Son(23, 3);
        obj.career();

        Daughter obj2 = new Daughter(3, 21);
        obj2.career();

        // Can't create object in abstract class
        // Parent obj3=new Parent() ;

        Parent.hello();
    }
}
