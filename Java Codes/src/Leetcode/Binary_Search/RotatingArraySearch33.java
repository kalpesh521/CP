package Leetcode.Binary_Search;

public class RotatingArraySearch33 {

    public static  int search(int[] nums, int target) {

        int pivot = findpivot(nums);
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

     public  static  int rotationCount(int[] arr){
        int pivot = findpivot(arr);
        return  pivot+1;
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


     static  int  findpivot(int[] nums) {
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

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            //For duplicate at start ,mid and end
            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= { 2,3,4,5,7,1};
        int[] arr1= { 2,9,2,2,2 };
        int target = 5;
        System.out.println(search(arr,target));
        System.out.println(findPivotWithDuplicates(arr1));//Print Pivot in Duplicates Rotatign Array
        System.out.println(rotationCount(arr));
    }
}

