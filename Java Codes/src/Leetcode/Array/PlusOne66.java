package Leetcode.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne66 {
    public static int[] getarray(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] newnumber = new int[n + 1];
        newnumber[0] = 1;
        return newnumber;

    }


    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 4, 5};
        System.out.println(Arrays.toString(getarray(arr)));
/*    int[] arr = {3, 2, 1, 4, 5};
    int result = 0;
    for (int temp = 0; temp < arr.length; temp++) {
        result *= 10;
        result += arr[temp] ;
    }
     int res=result+1;
    System.out.println(res);

    int i;
    for (i = 0; i < arr.length-1; i++) {
        arr[i] = result % 10;
        result = result / 10;
    }

    System.out.println(arr[i]);
    List<int> digits = new List<int>();

    for (; res != 0; res /= 10)
        digits.Add(res % 10);

    int[] array = digits.toArray();
    System.Array.Reverse(array);

    return array;
    */
    }
}
