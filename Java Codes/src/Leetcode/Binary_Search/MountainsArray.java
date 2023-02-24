package Leetcode.Binary_Search;

//Approach
//1. Find Peak element
//2. Search in first half left to the peak element (ASC)
//3. Search in Second half right to the peak element using order Agnostic Search (DESC)
public class MountainsArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 3, 2,};
        int target = 5;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return OrderBS(arr, target, peak + 1, arr.length - 1);
    }
    //Find Peak Element
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid; //{2,3,4,5,7}
                // s       e
            } else {
                start = mid + 1;//{3,2,1}
                // s   e
            }
        }
        return start;//return peak element index
    }

    //order Agnostic binary search for asc/desc search
    static int OrderBS(int[] arr, int target, int start, int end) {


        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
