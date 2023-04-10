import java.rmi.dgc.Lease;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(25);
        // list.add(15);
        // list.add(5);
        // list.add(325);
        // list.add(525);
        // System.out.println("Print : "+list);
        // list.set(2,21);
        // System.out.println("Updated : "+list);
        // list.remove(3);
        // System.out.println("Remove : "+list);

        Scanner in = new Scanner(System.in);
        // for (int i = 0; i < 5; i++) {
        // list.add(in.nextInt());
        // }
        // for (int i = 0; i < 5; i++) {
        // System.out.println(list.get(i));
        // }

        // Multi dimensional ArrayList
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            lst.add(new ArrayList<>());

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                lst.get(i).add(in.nextInt());
            }
        }
        System.out.println(lst);

        // Swap Array Index
        int[] arr = { 4, 7, 3, 1, 9 };
        System.out.println("Before swapping " + Arrays.toString(arr));
        swap(arr, 0, 1);
        System.out.println("After swaping " + Arrays.toString(arr));
        System.out.println("Max Value is " + max(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
           
        }
        return maxval;
    }
}
