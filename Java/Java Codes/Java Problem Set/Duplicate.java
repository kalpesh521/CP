
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 3, 4, 5, 2 };

        Set<Integer> uniqueNo = new HashSet<>();
        boolean isDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            if (uniqueNo.contains(arr[i])) {
                isDuplicate = true;
                System.out.println("Duplicate Element is : " + arr[i]);
            } else {
                uniqueNo.add(arr[i]);

            }
        }
        if (!isDuplicate) {
            System.out.println(-1);
        }
    }
}
