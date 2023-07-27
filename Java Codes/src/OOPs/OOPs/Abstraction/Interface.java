package OOPs.OOPs.Abstraction;

class Phone {
    public void call() {
        System.out.println("Calling");
    }

    public void sms() {
        System.out.println("SMS");
    }
}

interface Camera {
    void click();

    void record();
}

interface MusicPlayer {
    void play();

    void pause();

    void stop();

    final int  X = 10;

    static void shuffle() {
        System.out.println("Shuffle");
    }
}

interface Test extends MusicPlayer {
    private void method3() {  // Private method not accessible outside the interface
        System.out.println("Private method");
    }

    default void method1() {
        method3();
        System.out.println("Test interface");
    }
}

class My implements Test {
    @Override
    public void method1() {
        System.out.println("Method 1 on My");
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}

class Smartphone extends Phone implements Camera, MusicPlayer {
    void videocall() {
        System.out.println("Calling videocall");
    }

    @Override
    public void click() {
        System.out.println("Camera - > Click");
    }

    @Override
    public void record() {
        System.out.println("Camera - > Record");
    }

    @Override
    public void play() {
        System.out.println("MusicPlayer -> Play");
    }

    @Override
    public void pause() {
        System.out.println("MusicPlayer -> Pause");
    }

    @Override
    public void stop() {
        System.out.println("MusicPlayer - > Stop");
    }
}

public class Interface {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();  // Access all the methods
        Phone ph = new Smartphone(); // Concrete Class Calling
        ph.call();
        ph.sms();

        Camera cm = new Smartphone(); // Interface
        cm.click();
        cm.record();

        MusicPlayer mp = new Smartphone(); // Interface Reference Calling
        mp.pause();
        mp.stop();
        mp.play();

        System.out.println(MusicPlayer.X);  // Accessing identifier in interface
        MusicPlayer.shuffle();  // Calling static method in the interface

        My m = new My();
        m.method1();

        Test t=new My();
        t.method1();
    }
}
