package OOPs.OOPs.Abstraction;
//Abstraction
public abstract class Parent {
    int age;
    final int Value;

    public Parent(int age, int Value) {
        this.age = age;
        this.Value = Value;


    }
    //can't create  abstract static method but can create static method
    static  void hello(){
        System.out.println("hello");
    }
    abstract void career();

    abstract void partner();
}