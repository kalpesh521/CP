package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionframeworkCode {

    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        lst.add(23);
        lst.add(13);
        lst.add(231);
        lst.add(3);
        lst.add(3);
        System.out.print(lst+" ");
        System.out.println();

        System.out.println(Collections.min(lst));
        System.out.println(Collections.max(lst));
        System.out.println(Collections.frequency(lst,3));

        Collections.sort(lst, Comparator.reverseOrder());
        System.out.println(lst);

    }
}
