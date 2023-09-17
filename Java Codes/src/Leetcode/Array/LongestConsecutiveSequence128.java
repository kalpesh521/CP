package Leetcode.Array;

import java.util.*;

/*Time Complexity: O(N) + O(2*N) ~ O(3*N), where N = size of the array.
Reason: O(N) for putting all the elements into the set data structure.
After that for every starting element, we are finding the consecutive elements.
 Though we are using nested loops, the set will be traversed at most twice in the worst case.
 So, the time complexity is O(2*N) instead of O(N2).*/
public class LongestConsecutiveSequence128 {
    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}


