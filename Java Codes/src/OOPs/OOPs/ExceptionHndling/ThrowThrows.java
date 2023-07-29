package OOPs.OOPs.ExceptionHndling;

public class ThrowThrows {

    static int area(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("Dimensions Can't be negative");
        }
        int c = a * b;
        return c;
    }

    public static void meth1() {
        try {
            int r = area(-10, 9);
            System.out.println("Area is : " + r);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        meth1();
    }
}
