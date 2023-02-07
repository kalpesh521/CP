package Java_Problem_Set.Array;

// Kaden's Theorem -> To find Maximum sum of array
public class MaxSubarraySum {
    public static int MaxSubarray(int[] arr) {
        int Maxsum = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }
            Maxsum = Math.max(sum, Maxsum);
        }
        return Maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -5, 4, 3, 8, 5};//{4,3,8,5} Subarray =20
        int[] arr1 = {1,8,6,2,5,4,8,3,7};
        int result = MaxSubarray(arr1);
        System.out.println(result);
    }


}

