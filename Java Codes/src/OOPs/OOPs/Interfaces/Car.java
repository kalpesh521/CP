package OOPs.OOPs.Interfaces;

public class Car implements  Engine ,brakes {
    @Override
    public void start() {
        System.out.println("start the engine ");
    }

    @Override
    public void stop() {
        System.out.println("Stop the engine ");
    }

    @Override
    public void cc() {
        System.out.println( "CC of engine ");
    }

    @Override
    public void brakes() {
        System.out.println("use brake");
    }
}
