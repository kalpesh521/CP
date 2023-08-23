package DSA.Number_System;

public class divisors {

    static void divisor(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        divisor(28);
    }
}
