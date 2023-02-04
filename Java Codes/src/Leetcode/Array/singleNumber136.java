package Leetcode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class singleNumber136 {

    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 2, 1, 3};
        int len = arr.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len - 1; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i] + 1));//(2,2)
            } else {
                map.put(arr[i], 1);//(3,1)
            }
        }
        System.out.println(map);
        //System.out.println(getKey(map,1));
        //To print key
        //map.forEach((k, v) -> System.out.print(k + " "));
    }
}

