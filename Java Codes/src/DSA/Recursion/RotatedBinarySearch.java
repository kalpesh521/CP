package DSA.Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 1, 2, 3};
        System.out.println(binarySearch(arr, 5 , 0, arr.length-1));
    }

    static int binarySearch(int arr[], int target, int s, int e) {
        int m = s + (e - s) / 2;

        if (s > e) {
            return -1;
        }

        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (arr[s] <= target && target <= arr[m]) {
                return binarySearch(arr, target, s, m - 1);
            } else {
                return binarySearch(arr, target, m + 1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return binarySearch(arr, target, m + 1, e);

        }
        return binarySearch(arr, target, s, m - 1);

    }
}
