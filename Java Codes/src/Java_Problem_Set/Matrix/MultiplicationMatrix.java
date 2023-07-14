package Java_Problem_Set.Matrix;

import java.util.Scanner;
public class MultiplicationMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of first matrix");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns of first matrix");
        int c1 = sc.nextInt();
        System.out.println("Enter Row and Column of first Matrix");
        int[][] one = new int[r1][c1];
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[0].length; j++) {
                one[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows of second matrix");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns  of second  matrix");
        int c2 = sc.nextInt();

        System.out.println("Enter Row and Column of Second Matrix");

        int[][] two = new int[r2][c2];
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[0].length; j++) {
                two[i][j] = sc.nextInt();
            }
        }

        if (r1 != c2) {
            System.out.println("Invalid Input");
        }
        int[][] prod = new int[r1][c2];

        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                for (int k = 0; k < r2; k++) {
                    prod[i][j] += one[i][k] * two[k][j];    // C[0][0]=A(0,0)*B(0,0)+A(0,1)*B(1,0)+A(0,2)*B(2,0)
                                                            // C[0][0]=A(0,1)*B(1,1)+A(0,2)*B(2,1)+A(0,3)*B(3,1)
                }
            }
        }

        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }


    }
}
