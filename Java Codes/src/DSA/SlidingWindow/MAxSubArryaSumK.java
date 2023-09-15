package DSA.SlidingWindow;
import java.util.Scanner;

public class  MAxSubArryaSumK {
    public static int maxSubArray(int[] arr, int size, int k) {
        int i = 0, j = 0, sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (j < size) {
            sum = sum + arr[j];
            if (j - i + 1 < k) { // Window Size = j-i+1
                j++;
            } else if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum = sum - arr[i];//Decreament i (sum), add j to right
                i++;
                j++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxSubArray(arr, n, k));

    }
}