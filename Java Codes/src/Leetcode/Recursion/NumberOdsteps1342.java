package Leetcode.Recursion;

public class NumberOdsteps1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }


    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) { // Even Number divide by 2
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1); //Odd number subtract by 1
    }
}

