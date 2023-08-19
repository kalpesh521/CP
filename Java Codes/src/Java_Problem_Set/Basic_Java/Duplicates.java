package Java_Problem_Set.Basic_Java;

import java.util.HashSet;

public class Duplicates {

    static void removeduplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length-1; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 4, 3};
        removeduplicates(arr);
    }
}
