package Leetcode.Recursion;

import java.util.ArrayList;

public class Letter_combinations_Phone_Number17 {
    public static void main(String[] args) {
        System.out.println(padret("", "12")); // Print List
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0';//This will convert '2' to 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padret(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';//This will convert '2' to 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padret(p + ch, up.substring(1)));

        }
        return  list;
    }

}
