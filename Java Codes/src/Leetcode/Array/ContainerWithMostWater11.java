package Leetcode.Array;

public class ContainerWithMostWater11 {
    static int getwater(int arr[]) {
        int water = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            water = Math.max(water, Math.min((arr[left]), arr[right]) * (right - left));
            if (arr[left] > arr[right]) {
                right--;
            } else {
                left++;
            }
        }
        return water;

    }

    public static void main(String[] args) {
        int arr[] ={4,3,2,1,4};
        System.out.println(getwater(arr));
    }
}
