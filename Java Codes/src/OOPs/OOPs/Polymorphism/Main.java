package OOPs.OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Polymorphism
        //Method Overiding
        Shapes obj1 =new Shapes() ;
        obj1.area();
        Shapes obj2 =new Square() ;
        obj2.area();
        Shapes obj3 =new Circle() ;
        obj3.area();

    }
}
