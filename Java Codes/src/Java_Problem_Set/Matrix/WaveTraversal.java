package Java_Problem_Set.Matrix;

import java.util.Scanner;

public class WaveTraversal {
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

        for(int j=0;j<one[0].length;j++){
            if(j%2==0){
                for(int i=0;i<one.length    ;i++){
                    System.out.println(one[i][j]);
                }
            }else{
                for(int i = one.length-1;i>=0;i--){
                    System.out.println(one[i][j]);
                }
            }
        }
    }
}
