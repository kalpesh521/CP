package DSA.SlidingWindow;

import java.util.HashMap;

public class LargestSumSubarray {


    static  int maxLen(int A[], int n) {
        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += A[i];

            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {

                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int [] arr= { 6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println(maxLen(arr,8));
    }

}
