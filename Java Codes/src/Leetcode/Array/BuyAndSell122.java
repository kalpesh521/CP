package Leetcode.Array;

//122. Best Time to Buy and Sell Stock II
/*
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.

Logic :
consider only arr[i]>arr[i-1] then add all profits

Time Complexity : O(n)
*/
public class BuyAndSell122 {
    public static int maxProfit(int[] prices) {

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[]arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
