package Leetcode.Binary_Search;

public class RotatingArraySearch33 {

    public static  int search(int[] nums, int target) {

        int pivot = pivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);//first half left to the pivot
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);//Second half right to the pivot
        }
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }


     static  int  pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;// mid is pivot
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;//Ignore second half right to the mid
            } else {
                start = mid + 1;//Ignore first half left to the mid
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= { 2,3,4,5,7,3,2,1};
        int target = 5;
        System.out.println(search(arr,target));
    }
}

