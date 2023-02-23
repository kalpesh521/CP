package Leetcode.Binary_Search;
// Leetcode 852
public class PeakElement852 {
//consist of a ascending array upto peak and then descending
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

    public static void main(String[] args) {
        int [] arr ={ 2,3,4,5,7,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
}

