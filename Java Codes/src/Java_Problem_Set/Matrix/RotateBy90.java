package Java_Problem_Set.Matrix;

import java.util.Scanner;

public class RotateBy90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of   matrix");
        int n = sc.nextInt();
        System.out.println("Enter number of columns of matrix");
        int m = sc.nextInt();
        System.out.println("Enter Row and Column of  Matrix");
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            int li =0;
            int ri =arr[i].length -1;
            while(li <ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }

        System.out.println("Rotated Array : ");
        display(arr);
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
