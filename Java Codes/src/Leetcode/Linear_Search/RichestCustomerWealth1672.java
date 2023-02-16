package Leetcode.Linear_Search;

public class RichestCustomerWealth1672 {

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int column : ints) {
                sum += column;
            }
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;
    }
}

