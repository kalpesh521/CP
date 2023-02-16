import java.util.Arrays;

public class Linear {
    public static void main(String[] args) {

        // Search Integer
        int[] num = { 2, 3, 4, 1, 7, 6, 11 };
        int target = 7;
        int ans = linearsearch(num, target);
        Boolean ans2 = linearsearch2(num, target);
        int ans3 = linearsearch3(num, target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);

        // Search String
        String str = "Kalpesh";
        char targetstr = 'p';
        boolean ans4 = searchString(str, targetstr);
        System.out.println(ans4);
        boolean ans5 = searchString2(str, targetstr);
        System.out.println(ans5);

        // Search in range
        int[] arr = { 3, 2, 12, 4, 56, 7, -3 };
        int targetr = 4;
        int ans6 = searchInRange(arr, targetr, 1, 5);
        System.out.println(ans6);

        // Search minimum number
        int[] arr1 = { 3, 21, 4, 31, 2, 6, 7 };
        System.out.println(min(arr1));
        // Search maximum number
        int[] arr2 = { 3, 21, 4, 31, 2, 6, 7 };
        System.out.println(max(arr2));

        // search in 2D array
        int[][] arr3 = { { 13, 4, 2 },
                { 4, 1, 7, 3 },
                { 32, 4, 12, 1, 31 } };

        int target2d = 7;
        int[] res = search2D(arr3, target2d);
        System.out.println(Arrays.toString(res));

        // search max in 2d
        System.out.println(max2d(arr3));
    }

    // return index
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    // return bool
    static Boolean linearsearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }

    // return element
    static int linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }

    // Search String
    static boolean searchString(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // Search String
    static boolean searchString2(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (c == target) {
                return true;
            }

        }
        return false;
    }

    // Search in range
    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    // Find minimum number

    static int min(int[] arr) {
        int i;
        int ans = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;

    }

    // Search minimum number
    static int max(int[] arr) {
        int i;
        int ans = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;

    }

    // Search in 2D array

    static int[] search2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // search max in 2D
    static int max2d(int[][] arr) {
        int maxm = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > maxm) {
                    maxm = element;
                }
            }
        }
        return maxm;

    }
}
