package DSA.Array;

public class MaxIncome {

    public static int solution(int[] A) {
        if (A == null || A.length < 2) {
            return 0;
        }

        int maxIncome = 0;
        int minPrice = A[0];

        for (int price : A) {
            maxIncome = Math.max(maxIncome, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }

        return maxIncome;
    }

    public static void main(String[] args) {
        int[] A1 = {4, 1, 2, 3};
        System.out.println(solution(A1)); // Output: 6

        int[] A2 = {1, 2, 3, 3, 2, 1, 5};
        System.out.println(solution(A2)); // Output: 7
    }


}
