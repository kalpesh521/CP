package CollectionFramework;

import java.util.*;

public class LinkedHashMapCode {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap(5, 0.75f, true) {
            protected boolean removeeldest(Map.Entry e) {
                return size() > 5;
            }
        };
        lhm.put(1, "one");
        lhm.put(2, "two");
        lhm.put(3, "three");
        lhm.put(4, "four");
        lhm.put(5, "five");
        String s = lhm.get(2);
        s = lhm.get(4);
        s = lhm.get(1); // Access order
        lhm.forEach((k, v) -> System.out.println(" K " + k + " v " + v + " "));

    }
}
