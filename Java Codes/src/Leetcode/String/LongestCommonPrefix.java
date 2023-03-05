package Leetcode.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestprefix(String[] strs){
        if(strs == null || strs.length ==0){
            return  "";
        }

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int c =0 ;
        while(c< first.length() ){
            if(first.charAt(c) ==last.charAt(c)){
                c++;
            }else{
                break;
            }

        }
        return  c==0 ? "" : first.substring(0,c);

    }

    public static void main(String[] args) {
            String[] strs = {"flaower", "flaws","flay"};
            String res= longestprefix(strs);
        System.out.println(res);

    }
}
