package Leetcode.Array;

public class MaxSubarray53 {

    // Brute Force Approach
    static int maxSubarray(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];

                    maxsum = Math.max(maxsum, sum);
                }
            }
        }
        return maxsum;
    }

    // Optimal Approach using Kadane's Algorithm

    public static int maxSubArrayKadanes(int[] nums) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cursum += nums[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        return maxsum;
    }

    public static int printmaxSubArray(int[] nums) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        int start = 0;
        int ansstart = -1;
        int ansend = -1;
        for (int i = 0; i < nums.length; i++) {
            if (cursum == 0) start = i;
            cursum += nums[i];
            if (cursum > maxsum) {
                maxsum = cursum;
                ansstart = start;
                ansend = i;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        System.out.print("The MaxSum subarray is: [");
        for (int i = ansstart; i <= ansend; i++) {
            System.out.print( nums[i] + " ");
        }
        System.out.print("] ");
        System.out.println();
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, -4, 5, 1, -6};
        System.out.println(maxSubarray(arr));
        System.out.println();
        System.out.println(maxSubArrayKadanes(arr));

        System.out.println(printmaxSubArray(arr));
    }
}
