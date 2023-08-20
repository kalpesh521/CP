package Java_Problem_Set.Basic_Java;

import java.util.*;

public class Equilibrium {

    public static int findEquilibriumIdx(int nums[], int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        int leftSum = 0, rightSum = totalSum;
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        int nums[] = {2, 3, -1, 8, 4};
        int equilibriumidx = findEquilibriumIdx(nums, n);
        System.out.println(equilibriumidx);

    }
}

