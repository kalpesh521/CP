package Java_Problem_Set.Matrix;
//Search in Sorted matrix
import java.util.Scanner;

public class SearchInMatrix {
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

        System.out.println("Enter Elemnt do you want to search");
        int x = sc.nextInt();

        int i = 0;
        int j= arr[0].length-1;
        while(i <arr.length && j >=0){
            if(x==arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else  if(x<arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not found");
    }
}
