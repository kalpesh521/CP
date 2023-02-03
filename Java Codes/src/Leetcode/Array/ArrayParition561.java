package Leetcode.Array;

import java.util.Arrays;

public class ArrayParition561 {
    public static int getnum(int [] arr){
        int sum=0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i+=2){
            sum+=Math.min(arr[i],arr[i-1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr={6,2,6,5,1,2};
        System.out.println(getnum(arr));
    }
}
