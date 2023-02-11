package Leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Leetcode 40 Unique number combinations
public class Combination40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  // Sort
        List<List<Integer>> subset = new ArrayList<>();
        generatesubset(0, candidates, new ArrayList<>(), subset, target);
        return subset;
    }

    void generatesubset(int start, int[] nums, List<Integer> current, List<List<Integer>> subset, int target) {
        if (target == 0) { //returns upto zero by decreament
            subset.add(new ArrayList<>(current));
        }
        if (target < 0) return;//if negative while decreamenting return it for optimize solution ,restrict recursive
        // call
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; //skip duplicates for unique elements
            current.add(nums[i]);
            generatesubset(i + 1, nums, current, subset, target - nums[i]);//revuresive call to decreament upto zeo
            current.remove(current.size() - 1);
        }
    }
}

