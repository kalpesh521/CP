package DSA.Recursion;


public class BinarysearchRec {
    public static void main(String[] args) {//
        int[] arr = {2, 4, 6, 88, 99};
        int target = 6;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
    static int search(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (target < mid) {
            search(arr, target, s, mid - 1);
        }
        return search(arr, target, mid + 1, e);
    }
}
