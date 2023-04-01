package Java_Problem_Set.Pattern_Questions;

public class star_Pattern {
    public static void main(String[] args) {
        star(4);
    }

    static void star(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
