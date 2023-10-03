package DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class Digit {
    public static void main(String[] args) {
        int n = 1342;
        int lastDigit = n % 10;

        while (n >= 10) {
            n /= 10;
        }
        int firstdigit = n;

//        System.out.println(firstdigit);
        System.out.println(lastDigit);

        int[] A1 = {130, 191, 200, 10};
        System.out.println(maxSum(A1)); // Output: 140

        int[] A2 = {405, 45, 300, 300};
        System.out.println(maxSum(A2)); // Output: 600

        int[] A3 = {50, 222, 49, 52, 25};
        System.out.println(maxSumWithSameFirstLastDigits(A3)); // Output: -1

        int[] A4 = {30, 909, 3190, 99, 3990, 9009};
        System.out.println(maxSumWithSameFirstLastDigits(A4)); // Output: 9918
    }


    public static int maxSumWithSameFirstLastDigits(int[] A) {
        Map<Integer, Integer> maxSumMap = new HashMap<>();
        int result = -1;

        for (int num : A) {
            int firstDigit = num % 10;
            int lastDigit = num % 10;
            int firstLastConcatenated = firstDigit * 10 + lastDigit;

            if (maxSumMap.containsKey(firstLastConcatenated)) {
                int currentMax = maxSumMap.get(firstLastConcatenated);
                maxSumMap.put(firstLastConcatenated, currentMax + num);
            } else {
                maxSumMap.put(firstLastConcatenated, num);
            }
        }

        for (int sum : maxSumMap.values()) {
            result = Math.max(result, sum);
        }

        return result;
    }

    public static int maxSum(int[] A) {
        Map<Integer, Integer> maxSumMap = new HashMap<>();
        int result = -1;

        for (int num : A) {
            int firstDigit = num;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            int lastDigit = num % 10;
            int firstLastConcatenated = firstDigit * 10 + lastDigit;

            if (maxSumMap.containsKey(firstLastConcatenated)) {
                int currentMax = maxSumMap.get(firstLastConcatenated);
                maxSumMap.put(firstLastConcatenated, currentMax + num);
            } else {
                maxSumMap.put(firstLastConcatenated, num);
            }
        }

        for (int sum : maxSumMap.values()) {
            result = Math.max(result, sum);
        }

        return result;
    }


}


