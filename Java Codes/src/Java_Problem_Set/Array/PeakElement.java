package Java_Problem_Set.Array;

//Time Complexity : O(n)
public class PeakElement {
    public static int getpeak(int arr[]) {
        int peak = arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if (peak < arr[i + 1]) {
                peak = arr[i + 1];
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int arr[] ={ 2,1,5,3,9,21,21,3};
        System.out.println(getpeak(arr));
    }
}
