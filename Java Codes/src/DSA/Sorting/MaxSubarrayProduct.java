package DSA.Sorting;

public class MaxSubarrayProduct {
    // By Kadane's Algorithm
    static int maxProductSubArray(int arr[]) {
        int prod1 = arr[0], prod2 = arr[0], result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prod1 = Math.max(arr[i], Math.max(prod1 * arr[i], prod2 * arr[i]));
            prod2 = Math.min(arr[i], Math.min(prod1 * arr[i], prod2 * arr[i]));
//            prod1 = temp;

            result = Math.max(result, prod1);
        }

        return result;
    }

    // By Optimal Prefix and Suffix Approach
    static int prfSuff(int[] arr) {
        int pref = 1;
        int suf = 1;
        int ans = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (pref == 0) pref = 1;
            if (suf == 0) suf = 1;

            pref = pref * arr[i];
            suf = suf * arr[n - i - 1];
            ans = Math.max(ans, Math.max(pref, suf));
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(nums);
        System.out.print("The maximum product subarray is: " + answer);
        System.out.println();
        System.out.println(prfSuff(nums));
    }
}

