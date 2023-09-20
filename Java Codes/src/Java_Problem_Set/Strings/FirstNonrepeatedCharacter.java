package Java_Problem_Set.Strings;

import java.util.HashMap;
import java.util.Map;

//Java Program To Find First Non Repeated Character

public class FirstNonrepeatedCharacter {
    public static void main(String[] args) {
        String str = "ABCACDBEAFB";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("Map is "+ map);

        for (Map.Entry<Character, Integer> entryset : map.entrySet()) {
            if (entryset.getValue() == 1) {
                System.out.println(entryset.getKey());
                break;
            }
        }
    }
}
