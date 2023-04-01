package Java_Problem_Set.Pattern_Questions;

public class star_Pattern {
    public static void main(String[] args) {
        star1(4);
        System.out.println();
        star2(4);
        System.out.println();
        star3(4);
        System.out.println();
        num4(4);
        System.out.println();
        star5(5);
    }

    static void star1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void star2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void star3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void num4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void star5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcount = row > n ? 2 * n - row  : row;
            for (int col = 0; col < totalcount; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
