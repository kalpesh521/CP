package Leetcode.Linear_Search;

public class NumberOfEvenDigits1295 {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }

        }
        return count;
    }

    //To check number of digits are even
    boolean even(int num) {
        int numberOfdigits = digits(num);
        return numberOfdigits % 2 == 0;
    }

    //Find number of digits
    int digits(int num) {

        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

}

