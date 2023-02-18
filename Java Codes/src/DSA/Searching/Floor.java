package DSA.Searching;

// Floor Binary search
// Compare with ceiling binary Search 
// it will return the end value

public class Floor {
    public static void main(String[] args) {
        int[] arr = { 5,7, 8, 12, 14, 16, 44, 56 };
        int target = 15;
        System.out.println(floorBS(arr, target));
    }

    static int floorBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Optimize Solution to find mid 
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return end;
    }   
}
