package DSA.Number_System;

public class ArmStrong {
    static boolean isArmstrong(int n) {
        int count = 0;
        int originalN = n;
        int temp = n;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, count);
            n /= 10;
        }
        return   (sum ==originalN);
    }

    public static void main(String[] args) {

        int armn = 153;
        if (isArmstrong(armn)) {
            System.out.println("Number is armstrong ");
        } else {
            System.out.println("Number is not armstrong ");
        }
    }
}
