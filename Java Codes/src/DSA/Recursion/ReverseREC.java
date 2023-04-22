package DSA.Recursion;

public class ReverseREC {
    public static void main(String[] args) {
        rev1(2314);
        System.out.println(sum);

        //Method 2
        System.out.println(rev2(5467));
    }

    //Method 1 using static sum variable
    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    //Method 2
    //Without static variable using private helper function

    static int rev2(int n) {
        int digits = (int) (Math.log10(n)) + 1;//Find total number of digits
        return helper(n, digits);//helper function created to use additional arguments
    }

    private static int helper(int n, int digits) {
        if ((n % 10) == n) {
            return n;
        }

        int rem = n % 10;

        //2341
        // 1 * 10^3 + 234
        // 14 *10^2 + 23
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);

    }
}
