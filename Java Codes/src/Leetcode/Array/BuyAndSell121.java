package Leetcode.Array;
//
// 121. Best Time to Buy and Sell Stock
/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
public class BuyAndSell121 {
    public static int getProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int Max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] - min > Max) {
                Max = arr[i] - min;
            }
        }
        return Max;

    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(getProfit(arr));
    }
}
