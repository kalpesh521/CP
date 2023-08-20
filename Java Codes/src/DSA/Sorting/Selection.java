package DSA.Sorting;

public class Selection {

    static void selectionsort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

    }

    static void printArray(int arr[]){
        int n =arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={3,2,3,7,5,1};
        selectionsort(arr);
        printArray(arr);
    }
}
