package Leetcode.String;

import java.util.HashSet;
import java.util.Set;

public class longestSubstring3 {

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> seen = new HashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (seen.add(c)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while (s.charAt(left) != c) {
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
            }
        }
        return max;
    }

    // Another Method
    public int lengthOfLongestSubstring2(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }
}

