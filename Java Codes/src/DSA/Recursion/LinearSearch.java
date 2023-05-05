package DSA.Recursion;

import java.util.ArrayList;

public class LinearSearch {

    static boolean search(int arr[], int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return target == arr[i] || search(arr, target, i + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void searchDIn(int arr[], int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);//In all rec function calls , all reference variables  are pointing  to same object in
            // arraylist
        }
        searchDIn(arr, target, i + 1);
    }

    static ArrayList<Integer> searchAll(int arr[], int target, int i, ArrayList<Integer> list2) {
        if (i == arr.length) {
            return list2;
        }
        if (arr[i] == target) {
            list2.add(i);
            //In all rec function calls , all reference variables  are pointing  to same object in
            // arraylist
        }
        return searchAll(arr, target, i + 1, list2);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 4, 5, 1};
        int arr2[] = { 13, 14, 14, 5, 1};
        System.out.println(search(arr, 7, 0));

        searchDIn(arr, 4, 0);
        System.out.println(list);

         ArrayList<Integer> ans =searchAll(arr2, 14, 0,new ArrayList<>());
        System.out.println(ans);

    }
}
