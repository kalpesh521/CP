package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;
//Combination arr ={2,3,4} target = 8  Ans: {2+2+4}  [4,4] [2,3,3]
public class combination39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> comb = new ArrayList<>();
        generatecomb(0, candidates, new ArrayList(), comb, target);
        return comb;
    }


    void generatecomb(int start, int[] nums, List<Integer> current, List<List<Integer>> comb, int target) {
        if (target == 0) {
            comb.add(new ArrayList(current));
        }
        if (target < 0) {
        }
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            generatecomb(i, nums, current, comb, target - nums[i]);
            current.remove(current.size() - 1);
        }

    }
}





