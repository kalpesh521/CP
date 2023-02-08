package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;
/*
 * Time C : O(n*2^n)
 * Space C : O(n*2^n)
 * */

//Iterative Approach

public class Subsets78 {
    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : arr) {
            int n = res.size();
            for (int i = 0; i < n; i++) {
                List<Integer> temp = new ArrayList<>(res.get(i));
                temp.add(num);
                res.add(temp);
            }
        }
        return res;
    }

    // Recursive (Backtracking Approach
    //TC : O(n*2^n)
    //SC : O(n*2^n)    Output when ignored
    //SC : O(n)    When used
    //SC : O(n)    Recursion
    static List<List<Integer>> subset_rec(int[] num) {
        List<List<Integer>> res = new ArrayList();
        generate_subset(0, num, new ArrayList(), res);
        return res;
    }

    static void generate_subset(int index, int[] num, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList(curr));
        for (int i = index; i < num.length; i++) {
            curr.add(num[i]);//[]   [1]
            generate_subset(i + 1, num, curr, res);//[1]   [1,2]
            curr.remove(curr.size() - 1);//  [1] Backtrack (undo) one element

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //System.out.println(subsets(arr));
        System.out.println(subset_rec(arr));
    }


}
