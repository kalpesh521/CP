package Leetcode.Array;

public class PivotIndex724 {
    static int getpivot(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            int right = total - left - arr[i];
            if (left == right) {
                return i;
            }
            left += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={1,2,4,3,4,3};
        System.out.println(getpivot(arr));
    }
}
