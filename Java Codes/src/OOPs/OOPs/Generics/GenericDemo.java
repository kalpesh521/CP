package OOPs.OOPs.Generics;

public class GenericDemo {
    static <E> void show(E[] list) {
        for (E x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(new String[]{"ho", "Kp", "Sp"});
        show(new Integer[]{1, 3, 42, 1});
    }
}
