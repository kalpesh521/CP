package Java_Problem_Set.Matrix;
import java.util.Scanner;
public class SpiralMatrix {

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
        int minr=0;
        int minc=0;
        int maxr= arr.length-1;
        int maxc=arr.length-1;
        int total = n*m;
        int cnt=0;
        while(cnt<total) {
            for (int i = minr, j = minc; i <= minr  && cnt<total; i++) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            System.out.println();
            minc++;
            for (int i = maxr, j = minc; j <= maxc && cnt<total; j++) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            System.out.println();
            maxr--;
            for (int i = maxr, j = maxc; i>= minr && cnt<total; i--) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            System.out.println();
            maxc--;
            for (int i = minr, j = maxc; j >=minc && cnt<total; j--) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            System.out.println();
            minr++;
        }
    }
}
