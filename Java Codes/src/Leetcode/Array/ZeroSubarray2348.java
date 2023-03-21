package Leetcode.Array;
// Two Pointer approach
//i and j at same starting position , increament j =i+1 when non-zero number else count it .
public class ZeroSubarray2348 {
    public static  long zeroFilledSubarray(int[] nums) {
        long res = 0;
        for (int i = 0, j = 0; i < nums.length; ++i) {
            if (nums[i] != 0)
                j = i + 1;
            res += i - j + 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr ={1,2,0,0,3,4,0,0,1};
        System.out.println(zeroFilledSubarray(arr));
    }
}
