package Java_Problem_Set.Array;


public class SecondLargestNumber {
    public static int getSecondLargets(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;
        if (arr.length < 2) {
            System.out.println("Second Largest not exist");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                Secondlargest = largest;
                largest = arr[i];
            }
            if (arr[i] > Secondlargest && largest != arr[i]) {
                Secondlargest = arr[i];
            }
        }
        return Secondlargest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 7, 8, 9, 4};
        System.out.println(getSecondLargets(arr));
    }
}
