package Leetcode.Matrix;
/*
* Only include the sum of all the elements on the primary diagonal and all the elements on the
* secondary diagonal that are not part of the primary diagonal.*/
public class DiagonalSum1572 {

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},
                {4,8,6},
                {7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
    public static  int diagonalSum(int[][] mat) {
        int n = mat.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += mat[i][i] + mat[i][n - i - 1];
        }
        if (n % 2 == 1) {
            result -= mat[n / 2][n / 2];
        }
        return result;
    }

}
