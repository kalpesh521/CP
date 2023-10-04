package Leetcode.Array;

import java.util.HashMap;

public class GoodPairs {

    public static  int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            result += count.get(num) - 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));

    }
}

