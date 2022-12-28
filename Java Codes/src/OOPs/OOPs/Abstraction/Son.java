package OOPs.OOPs.Abstraction;

public class Son extends Parent{
    int age;

    public Son(int age, int Value) {
        super(age, Value);
    }

    @Override
    void career() {
        System.out.println("I want to be a cricketer");
    }

    @Override
    void partner() {
        System.out.println("My partner is my friend ");
    }
}
