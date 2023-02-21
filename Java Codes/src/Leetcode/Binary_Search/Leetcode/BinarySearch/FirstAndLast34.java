package Leetcode.Binary_Search.Leetcode.BinarySearch;

///* This Problem uses two Binary search approaches ,first it will find mid and then second binary search ,will
// search start and last occurence of target  */
public class FirstAndLast34 {

    public static  int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static  int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] nums ={1,2,3,7,7,7,7,8,9};
        int[] res = searchRange(nums,7);
        for (int num : res){
            System.out.println(num + " ");
        }

    }
}
