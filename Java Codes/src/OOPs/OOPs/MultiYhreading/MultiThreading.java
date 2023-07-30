package OOPs.OOPs.MultiYhreading;

class My extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        My t = new My();
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + "Kalpesh");
            i++;
        }
    }
}

