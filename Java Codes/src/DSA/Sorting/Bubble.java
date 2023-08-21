package DSA.Sorting;

public class Bubble {

    static void bubble(int arr[]) {
        int n = arr.length;
        int count =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                count++;
            }
        }
        System.out.println(count);


    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 7, 5, 1};
        bubble(arr);
        printArray(arr);
    }
}
