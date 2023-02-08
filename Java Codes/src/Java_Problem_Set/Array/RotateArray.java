package Java_Problem_Set.Array;

public class RotateArray {
    static void reverse(int start, int end, int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void rotate(int[] arr, int k) {
        int len = arr.length;
        k = k % len;
        reverse(0, len - k - 1, arr);
        reverse(len - k, len - 1, arr);
        reverse(0, len - 1, arr);


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 9, 10};
        int k = 3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
