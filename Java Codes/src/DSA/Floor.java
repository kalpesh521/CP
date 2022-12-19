// Floor Binary search 
public class Floor {

    public static void main(String[] args) {
        int[] arr = {   7, 8, 12, 14, 16, 44, 56 };
        int target =14;
        System.out.println( floorBS(arr, target));
    }
    static int  floorBS(int[] arr, int target) {
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
        return  end;
    }
}
 