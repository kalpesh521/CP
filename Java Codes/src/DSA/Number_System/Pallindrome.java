package DSA.Number_System;

public class Pallindrome {

    static int reverse(int x) {
        int y = 0;
        while (x > 0) {
            int digit = x % 10;
            y = y * 10 + digit;
            x /= 10;
        }
        return y;
    }

    static boolean isPallindrome(int x) {
        int y = 0;
        int temp = x;
        while ( temp > 0) {
            y = y * 10 + temp % 10;
            temp /= 10;
        }

        if (x == y) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        int x = 121;
//        int dummy = reverse(x);
//
//        if (dummy == x) {
//            System.out.println("Number is Pallindrome");
//        } else {
//            System.out.println("Not Pallindrome");
//        }


        int min = 30;
        int max = 150;

        for (int i = min; i <= max; i++) {
            if (isPallindrome(i)) {

                System.out.println(i);
            }
        }
    }
}
