package Java_Problem_Set.Array;

import java.util.HashSet;

public class Union {


    public static HashSet<Integer> doUnion(int[] a, int n, int[] b, int m) {
        HashSet<Integer> unionset = new HashSet<>();

        for (int i = 0; i < n; i++) {
            unionset.add(a[i]);
        }

        for (int j = 0; j < m; j++) {
            unionset.add(b[j]);
        }

        return unionset;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};
        HashSet<Integer> hset= doUnion(arr1, 5, arr2, 3);
        System.out.println(hset);
//        System.out.println(doUnion(arr1,5,arr2,3));

    }
}
