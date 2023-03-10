package Java_Problem_Set.Strings;

import java.util.HashSet;
import java.util.Set;

public class duplicates {
    public static void main(String[] args) {
        String str ="programming";

        //Approach 1 Lambda function
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(sb);

        //Approach indexOf()

        StringBuilder sb2= new StringBuilder();
        for(int i =0 ;i<str.length();i++){
            char ch = str.charAt(i);
            int idx = str.indexOf(ch,i+1);

            if(idx==-1){
                sb2.append(ch);
            }

        }
        System.out.println(sb2);

        // Approach Hashset

        StringBuilder sb3 = new StringBuilder();
        Set<Character> set =  new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for (char ch : set){
             sb3.append(ch);
        }
        System.out.println(sb3);
    }
}
