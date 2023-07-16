package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/*HashMap (O(n)) <Hash table> is commonly used for fast key-based lookups and allows duplicate values,
  TreeSet (log(n) <	Balanced binary search tree (Red-Black Tree) > is suitable for maintaining a sorted set of unique
  elements.*/
public class HashMapCode {
    public static void main(String[] args) {

        //In hashmap , It will update value if one more key present
        Map<String, Integer> m1 = new HashMap<>(Map.of("five",5));
        m1.put("one", 1);
        m1.put("two", 2);
        m1.put("two", 23);
        m1.put("Three", 3);
        m1.put("Four", 4);

        if (m1.containsKey(2))
            m1.put("two", 23);

        m1.putIfAbsent("two", 25);

        System.out.println(m1);

        //print key and value
        for (Map.Entry<String, Integer> e : m1.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());//access key
            System.out.println(e.getValue());//access value
            System.out.println();
        }
        // print keys
        for (String key : m1.keySet()) {
            System.out.println(key);
        }
        //Print values
        for (Integer value : m1.values()) {
            System.out.println(value);
        }

        // treemap => in sorted order key
        Map<String, Integer> m2 = new TreeMap<>();
        m2.put("one", 1);
        m2.put("two", 2);
        m2.put("two", 23);
        m2.put("three", 3);
        m2.put("four", 4);

        System.out.println(m2);
    }
}
