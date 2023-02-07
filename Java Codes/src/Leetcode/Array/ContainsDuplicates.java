package Leetcode.Array;

import java.util.HashSet;
import java.util.Set;

//Problem 217 :
public class ContainsDuplicates {
    static boolean getstatus(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4,};
        System.out.println(getstatus(arr));
    }
}
