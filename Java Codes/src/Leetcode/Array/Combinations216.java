package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;
//Leetcode 216
// Num from 1 to 9 -> sum of subset having size k should be equal to target
//k=2 , target =3 Ans : (1,2)
public class Combinations216
{
    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {

            List<List<Integer>> subsets = new ArrayList<>();
            generatesubsets(1,9,new ArrayList<>(),subsets,k,n);//iterate upto 9
            return subsets;

        }

        void generatesubsets(int start,int end,List<Integer>current,List<List<Integer>>subsets,int k,int target){
            if(target==0 && current.size()==k){
                subsets.add(new ArrayList<>(current));
                return;
            }

            for (int i=start;i<=end;i++){
                current.add(i);
                generatesubsets(i+1,9,current,subsets,k,target-i);
                current.remove(current.size()-1);
            }
        }
    }
}
