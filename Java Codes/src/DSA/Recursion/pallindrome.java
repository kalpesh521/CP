package DSA.Recursion;

public class pallindrome {
    public static void main(String[] args) {
        System.out.println(pallin(1231));
//        System.out.println(pallin(121));
    }

    static int rev(int n) {
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

    static  boolean pallin(int n){
        return  n==rev(n);
    }
}

