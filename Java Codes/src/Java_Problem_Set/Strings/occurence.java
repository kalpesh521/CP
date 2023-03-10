package Java_Problem_Set.Strings;

import java.util.Arrays;

public class occurence {
    public static void main(String[] args) {
        String str = "opentext";
        char charToReplace = 't';
        if (str.indexOf(charToReplace) == -1) {
            System.out.println("given character not present ");
        }

        char[] arr = str.toCharArray();
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == charToReplace) {
                arr[i] = String.valueOf(cnt).charAt(0);//Convert int or any datatype into String
                cnt++;
            }
        }
        System.out.println(Arrays.toString(arr));//returns string representation of array
    }
}
