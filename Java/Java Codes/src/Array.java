import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // arr[0] = 4;
        // arr[1] = 5;
        // arr[2] = 6;
        // arr[3] = 61;
        // arr[4] = 16;
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("elemnents ata index " + i + " is " + arr[i]);
        // }

        // fun(1, 2, 3, 4);
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.println("Enter input : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");

        }
        // Printing an array
        for (int num : arr1) {
            System.out.println(num + " ");
        }

        System.out.println(Arrays.toString(arr1));

        // 2D Array

        int[][] arr2d = new int[3][3];
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.println(arr2d[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Variable Argument
    // static void fun(int... v) {
    // System.out.println(Arrays.toString(v));
    // }
}
