package Java_Problem_Set.Matrix;

import java.util.Scanner;

public class Exitpoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        int dir =0;
        int i= 0;
        int j=0;

        while(true){
            dir=(dir+arr[i][j])%4;
            if(dir==0){  //east
                j++;
            }else  if(dir==1){ //south
                i++;
            } else if (dir == 2) {//west
                j--;

            } else if (dir == 3) {//North
                i--;
            }

            //Break condition exit point for all four walls
            if (i < 0) {
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            } else if (i == arr.length) {
                i--;
            } else if (j == arr[0].length) {
                j--;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
