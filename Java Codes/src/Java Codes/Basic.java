import java.util.Scanner;

import static java.lang.System.*;
public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //User Input
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }

        //Ternary Operator
        int n1=10;
        int n2=20;
        System.out.println((n1>n2)? n1:n2);
        out.println("Africa");
        out.println("India");


    }
}
