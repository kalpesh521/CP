package Leetcode.Array;

public class Fibonacci {
//0 ,1 ,1 ,2 , 3 ,5 ,8 ,13 , 21 34 ,55 ........
    // Using Recursion
    public static  int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}

