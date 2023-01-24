package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetCode {
    public static void main(String[] args) {
        Set<Integer>set =new HashSet<>();
        //print in random order
        set.add(21);
        set.add(23);
        set.add(51);
        set.add(11);

        System.out.println(set);

        set.remove(23);
        System.out.println(set );
        System.out.println(set.contains(51));

        System.out.println(set.size());
        set.clear();
    }
}
