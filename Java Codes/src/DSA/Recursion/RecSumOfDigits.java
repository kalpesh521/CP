package DSA.Recursion;

public class RecSumOfDigits {
    public static void main(String[] args) {
        int res = sumOfdigits(1234);
        System.out.println(res);
    }

    static int sumOfdigits(int n) {
        if (n == 0) {
            return 0;
        }                  //123            4
                           //12           34
        return sumOfdigits(n / 10) + (n % 10);
    }
}
