package Leetcode.Array;
// Kth Missing Positing  Number
public class kthMissingPositiveNumber1539 {
    public static int findKthPositive(int[] arr, int k) {
        for (int i : arr) {
            if (i <= k) k++;
            else break;
        }
        return k;
    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,5,7,8,10};
        System.out.println(findKthPositive(arr,3));
    }
}
