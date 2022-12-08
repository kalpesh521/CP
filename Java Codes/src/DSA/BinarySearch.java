

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -1,3, 4, 5, 7, 8, 12, 14, 16, 44, 56 };
        int target = 44;
        System.out.println(BinarySearchel(arr, target));
    }

    static int BinarySearchel(int[] arr, int target) {
        int start = 0;
            int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return -1;
    }
}
