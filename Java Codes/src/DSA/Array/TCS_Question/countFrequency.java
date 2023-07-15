package DSA.Array.TCS_Question;

import java.util.HashMap;
import java.util.Map;

public class countFrequency {
    public static void main(String[] args) {
       int arr[]={2,3,1,3,4,1,2,3,1,4};
       int n =arr.length;
       getfrequency(arr,n);
   }
    static void getfrequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());

        }
    }
}
