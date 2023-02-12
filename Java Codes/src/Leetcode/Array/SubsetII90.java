package Leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Leetcode subsetII 90
//Duplicates digits in subsets are allowed
public class SubsetII90 {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>>subsets =new ArrayList<>();
            generatesubset(0,nums,new ArrayList<>(),subsets);
            return subsets;
        }

        void generatesubset(int start,int [] nums,List<Integer>current,List<List<Integer>>subsets){
            subsets.add(new ArrayList<>(current));

            for (int i=start;i<nums.length;i++){
                if(i>start && nums[i-1]==nums[i]) continue;
                current.add(nums[i]);
                generatesubset(i+1,nums,current,subsets);
                current.remove(current.size()-1);
            }
        }
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0){return new ArrayList<>();}
        List<List<Integer>>result =new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> row =new ArrayList<>();
            for (int j=0;j<i;j++){
                if(j==0 && j==i-1){
                    row.add(1);
                }else{
                    row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
                }
            }
            result.add(row);

        }
        return result;
    }
}