package Leetcode.Array;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] output = new int[N];
        output[0] = 1;
        for (int i = 1; i < N; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }
        int product = 1;
        for (int i = N - 1; i >= 0; i--) {
            output[i] *= product;
            product = product * nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7};
        int[] res = productExceptSelf(arr);
        for (int nums : res) {
            System.out.println(nums);

        }
    }
}
