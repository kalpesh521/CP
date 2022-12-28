package OOPs.OOPs.Abstraction;


public class Daughter extends Parent{
    int age;

    public Daughter(int age, int Value) {
        super(age, Value);
    }

    @Override
    void career() {
        System.out.println("I want to be a Coder");
    }

    @Override
    void partner() {
        System.out.println("My partner is my buddy ");
    }
}
