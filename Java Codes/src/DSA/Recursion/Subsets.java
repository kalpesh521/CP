package DSA.Recursion;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {

        // Print all subsets
        subseq("", "abc");

        // Print subsets with ASCII Values
        System.out.println("================ Ascii Values =================");
        subseqAscii("", "abc");
        // Print subsets with Arraylist
        ArrayList<String >res = subset("","abcd");
        System.out.println(res);
    }

    /*
     * p / up
     * " "  / abc
     * a / bc
     * ab /c
     * abc / " "
     * */
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));//Call all subsets
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));//Call all subsets
        subseqAscii(p+ (ch +0), up.substring(1));//Call all subsets
    }

    //Add subsets in Arraylist

    static ArrayList<String> subset(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subset(p + ch, up.substring(1));
        ArrayList<String> right = subset(p, up.substring(1));
        left.addAll(right);
        return left;
    }

}
