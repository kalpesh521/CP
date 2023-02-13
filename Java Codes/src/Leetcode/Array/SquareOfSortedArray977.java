package Leetcode.Array;

import java.util.Arrays;

public class SquareOfSortedArray977 {

    public static  int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        int[] result = new int[n];

        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[p] = nums[i] * nums[i];
                i++;
            } else {
                result[p] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []arr= {-1,-3,4,5,7};
        int[] newarr =sortedSquares(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(newarr[i]);
        }
    }
}

