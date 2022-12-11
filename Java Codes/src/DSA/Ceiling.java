public class Ceiling {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 8, 12, 14, 16, 44, 56 };
        int target = 15;
        System.out.println(ceilBS(arr, target));
    }

    static int ceilBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target >= arr[arr.length - 1]) {
            return -1;
        }
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
        return start;
    }
}
