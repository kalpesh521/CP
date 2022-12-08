
// Array and multi-dimensional array
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    // Passing array as parameter
    static void min(int arr[]) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min number is :" + min);

    }

    
    // Creating method which return array
    static int[] get() {
        return new int[] { 3, 5, 6, 8, 9 };
    }

    // ========================================================================================================
     public static void main(String[] args) {
        /*
         * 
         * // array Creation
         * int arr[] = new int[5];
         * arr[0] = 4;
         * arr[1] = 5;
         * arr[2] = 6;
         * arr[3] = 61;
         * arr[4] = 16;
         * 
         * for (int i = 0; i < arr.length; i++) {
         * System.out.println("elemnents ata index " + i + " is " + arr[i]);
         * }
         * 
         * // Print array using for each loop
         * for (int i : arr) {
         * System.out.println(i);
         * }
         * //
         * =============================================================================
         * ======
         * 
         * // user input in array
         * // fun(1, 2, 3, 4);
         * Scanner in = new Scanner(System.in);
         * int[] arr1 = new int[5];
         * System.out.println("Enter input : ");
         * for (int i = 0; i < arr1.length; i++) {
         * arr1[i] = in.nextInt();
         * 
         * }
         * for (int i = 0; i < arr1.length; i++) {
         * System.out.println(arr1[i] + " ");
         * 
         * }
         * // Printing an array
         * for (int num : arr1) {
         * System.out.println(num + " ");
         * }
         * 
         * System.out.println(Arrays.toString(arr1));
         * //
         * 
         * =============================================================================
         * ==========================
         * // 2D Array
         * 
         * int[][] arr2d = new int[3][3];
         * int[][] arr2 = {
         * { 2, 4, 5, 6 },
         * { 3, 4 },
         * { 1, 3, 5 }
         * };
         * for (int row = 0; row < arr2d.length; row++) {
         * for (int col = 0; col < arr2d[row].length; col++) {
         * arr2d[row][col] = in.nextInt();
         * }
         * }
         * 
         * for (int row = 0; row < arr2d.length; row++) {
         * for (int col = 0; col < arr2d[row].length; col++) {
         * System.out.println(arr2d[row][col] + " ");
         * }
         * System.out.println();
         * }
         * for (int row = 0; row < arr2.length; row++) {
         * for (int col = 0; col < arr2[row].length; col++) {
         * System.out.println(arr2[row][col] + " ");
         * }
         * System.out.println();
         * }
         * 
         * for (int[] a : arr2d) {
         * System.out.println(Arrays.toString(a));
         * }
         */
        // ======================================================================================================
        // Calling method with array as parmeter
        int arr5[] = { 3, 1, 4, 5 };
        min(arr5);
        min(new int[] { 5, 3, 7, 8 }); // Anonymous array as parameter

        int arr[] = get();
        for (int i : arr) {
            System.out.println(i + "  ");
        }

        //Array indexOutOfbound
        int arr6[] = { 50, 60, 70, 80 };
        for (int i = 0; i <arr6.length; i++) {
            System.out.println(Arrays.toString(arr6));
            break;
        }
    }

    // Variable Argument
    // static void fun(int... v) {
    // System.out.println(Arrays.toString(v));
    // }

}
