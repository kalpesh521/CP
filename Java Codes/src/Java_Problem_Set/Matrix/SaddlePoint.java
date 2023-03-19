package Java_Problem_Set.Matrix;

import java.util.Scanner
//Saddle Point -> least in row and max in column
public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of matrix");
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

        //Traversing row to find min column
        int svj= 0;
        for(int i=0;i<arr.length;i++) {

            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }
      //traversing above svj column to find max value in that column
        boolean flag=true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][svj] > arr[i][svj]){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Not found");
    }
}
