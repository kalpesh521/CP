package DSA.Array;

public class ReversingArray {


    public static void printarray(int B[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }

    public static void reversearray(int arr[], int n) {
        int B[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            B[n - i - 1] = arr[i];
        }
        printarray(B, n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 3, 7, 8};
        int n = 6;
        reversearray(arr, n);
    }
}
