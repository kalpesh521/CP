package Leetcode.Array;

public class MissingNumber268 {
    static int getmissingnum(int[] arr) {
        int n = arr.length;
        int expectedTotal = (n * (n + 1)) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return expectedTotal - sum;

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 6, 7};
        int[] arr1 = {3, 0, 1};
        System.out.println(getmissingnum(arr));
    }
}
