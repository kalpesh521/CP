package OOPs.OOPs.ExceptionHndling;
// Nested Catch & Nested Try Catch
public class NestedCatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0};

        try {
            int c = arr[0] / arr[3];
            System.out.println(c);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);
        }
    }
}
