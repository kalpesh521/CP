package Leetcode.String;
/*
Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:

Input: s = "aba"
Output: false
Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

*/
public class RepeatedSubstring459 {

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                int num = len / i;
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < num; j++) {
                    sb.append(substring);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}

