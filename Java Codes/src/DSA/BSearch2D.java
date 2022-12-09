import java.util.Arrays;
//Binary Search 2D matrix
public class BSearch2D {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 5, 6, 8 },
                { 10, 13, 16, 19 },
                { 20, 23, 25, 28 } };
        int target = 5;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target) {

        int row = 0;
        int col = matrix.length - 1;

        while (row< matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
}
