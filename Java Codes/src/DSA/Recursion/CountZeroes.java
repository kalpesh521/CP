package DSA.Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(1000204));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1); //(10402 , 0) ,(1040,0),(104,1),(10,1),(1,2) return 2 count
        }
        return helper(n / 10, c);
    }
}
