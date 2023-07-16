package CollectionFramework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
// Sort array using comparator in reverse order
class My implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        if(i1<i2)
        {
            return 1;
        }
        if(i1 >i2)
        {
            return -1;
        }
        return 0;
    }
}

public class ComparatorCode {
    public static void main(String[] args) {
        Integer a[] = {4, 7, 5, 8, 3, 9, 2, 1, 6};
        Arrays.sort(a,new My());
        for (Integer x : a) {
            System.out.println(x);
        }
    }
}
