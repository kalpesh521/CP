package Java_Problem_Set.Strings;

import java.util.SimpleTimeZone;
import java.util.random.RandomGenerator;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = "#Ja^va";
        String str1 = "   Ja  v a";

        String plainstr= str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plainstr);

        String trimstr= str1.trim();//Delete only trailing and leading spaces
        String trimstr1= str1.replaceAll("\\s","");
        System.out.println(trimstr1);
    }
}
