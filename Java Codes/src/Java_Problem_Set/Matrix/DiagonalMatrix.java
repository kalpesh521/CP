package Java_Problem_Set.Matrix;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows of first matrix");
        int n = sc.nextInt();
        System.out.println("Enter number of columns of first matrix");
        int m = sc.nextInt();
        System.out.println("Enter Row and Column of first Matrix");
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int g= 0;g<arr.length;g++){
            for(int i=0,j=g;j<arr.length;i++,j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
