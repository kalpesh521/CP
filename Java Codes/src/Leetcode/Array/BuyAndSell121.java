package Leetcode.Array;

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
        int [] arr = {7,1,5,3,6,4};
        System.out.println(getProfit(arr));
     }
}
