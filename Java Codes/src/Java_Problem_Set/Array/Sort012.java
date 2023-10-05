package Java_Problem_Set.Array;

public class Sort012 {
    static void sort(int[] a ,int n) {


        int low = 0;         // Pointer for 0s
        int high = n - 1;    // Pointer for 2s
        int current = 0;     // Pointer for iterating through the array

        while (current <= high) {
            if (a[current] == 0) {
                // Swap a[current] and a[low] to move 0s to the beginning
                int temp = a[current];
                a[current] = a[low];
                a[low] = temp;
                low++;
                current++;
            } else if (a[current] == 2) {
                // Swap a[current] and a[high] to move 2s to the end
                int temp = a[current];
                a[current] = a[high];
                a[high] = temp;
                high--;
            } else {
                // If a[current] is 1, just move to the next element
                current++;
            }
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,0,2,0,1};
        sort(arr,6);

        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}

