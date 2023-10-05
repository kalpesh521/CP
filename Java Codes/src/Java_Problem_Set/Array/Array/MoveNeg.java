package Java_Problem_Set.Array.Array;

import java.util.ArrayList;

public class MoveNeg {


    public static ArrayList<Integer> segregateElements(int arr[], int n) {
        int left = 0;
        int right = 0;
        ArrayList<Integer> lst = new ArrayList<>();
        while (left <= n && right <= n) {
            // Find the first negative element from the left
            while (arr[left] >= 0) {
                left++;
            }

            lst.add(arr[left++]);
            // Find the first positive element from the right
            while (arr[right] < 0) {
                right++;
            }
            lst.add(arr[right++]);
            // Swap the negative and positive elements
//            if (left <= right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
        }

        return lst;
    }


    public static void main(String[] args) {

        int N = 8;
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        System.out.println(segregateElements(arr, N));

        System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



