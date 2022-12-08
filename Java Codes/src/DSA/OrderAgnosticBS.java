public class OrderAgnosticBS {

    // Order Agnostic BS used for both asc/desc order array
    public static void main(String[] args) {
        int[] arr = { 23, 12, 9, 8, 7, 2, -1, -3 };//Descending Order
        // int[] arr = { -1, 3, 4, 5, 7, 8, 12, 14, 16, 44, 56 };//Ascending Order 
        int target = 7;
        System.out.println(OrderBS(arr, target));
    }

    static int OrderBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
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
