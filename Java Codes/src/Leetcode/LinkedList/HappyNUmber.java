package Leetcode.LinkedList;

/*
Input: n = 19
Output: true
Explanation:
(square)
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
public record HappyNUmber() {
    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {
            slow = issquare(slow);
            fast = issquare(issquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private  static int issquare(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}

