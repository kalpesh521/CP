package CollectionFramework;

import java.util.Arrays;

public class ArrayClassCode {
    public static void main(String[] args) {
        int [] numbers ={1,2,3,4,5,6,7};
        int index = Arrays.binarySearch(numbers,4);
        System.out.println(index);

        System.out.println("Sorted Array : ");
        Integer [] num2 ={3,1,5,6,5,4,2};
        Arrays.sort(num2);

        Arrays.fill(num2,5);

        for(int i : num2){
            System.out.println(i);
        }



    }
}
