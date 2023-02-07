package Leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate219 {
    static boolean getdup(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && i - map.get(arr[i]) <= k) {
                return true;
            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3};
        int[] arr1 = {1, 0, 1, 1};
       // System.out.println(getdup(arr, 1));
        System.out.println(getdup(arr1, 1));

    }
}
