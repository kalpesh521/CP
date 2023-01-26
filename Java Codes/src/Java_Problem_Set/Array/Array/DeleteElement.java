package Java_Problem_Set.Array.Array;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n,pos ,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number input : ");
        n=sc.nextInt();

        System.out.println("Enter elemnts in array :");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The elements in an array are :");

        for (i=0;i<n;i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter position of elements you want to delete");
        pos=sc.nextInt();
        if(pos<0 || pos>n){
            System.out.println("invalid Position");
        }else{
            for(i=pos-1;i<n;i++){
                arr[i]=arr[i+1];
            }
            n--;
        }
        System.out.println("The  array after deleting elements ");

        for (i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}
