package DSA.Recursion;

public class RecSumOfDigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits is :");
        int res = sumOfdigits(1234);
        System.out.println(res);
        System.out.println("Product of digits is :");
        int res2=ProductOfdigits(1234);
        System.out.println(res2);
     }

    static int sumOfdigits(int n) {
        if (n == 0) {
            return 0;
        }                  //123            4
        //12           34
        return sumOfdigits(n / 10) + (n % 10);
    }

    static int ProductOfdigits(int n) {
        if (n == 0) {
            return 0;
        }                  //123            4
        //12           34
        return sumOfdigits(n / 10) * (n % 10);
    }
}
