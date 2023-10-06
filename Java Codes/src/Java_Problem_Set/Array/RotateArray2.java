package Java_Problem_Set.Array;

public class RotateArray2 {

    public static void rotateByOne(int[] arr, int n) {
        int lastElement = arr[n - 1]; // Store the last element in a temporary variable

        // Shift elements one position to the right in reverse order
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement; // Place the last element at the beginning
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = {1, 2, 3, 4, 5};

        rotateByOne(A, N);

        System.out.print("Output: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}

