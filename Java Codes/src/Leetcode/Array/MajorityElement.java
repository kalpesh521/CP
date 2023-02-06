package Leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int getMajority(int arr[]) {
        Map<Integer, Integer> countmap = new HashMap<>();
        Integer result = null;
        for (int i = 0; i < arr.length; i++) {
            countmap.put(arr[i], countmap.getOrDefault(arr[i], 0) + 1);
        }
        int mid = arr.length / 2;
        for (Map.Entry<Integer, Integer> entry : countmap.entrySet()) {
            if (entry.getValue() > mid) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
