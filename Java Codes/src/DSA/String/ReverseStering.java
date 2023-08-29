package DSA.String;

public class ReverseStering {
    public static void main(String[] args) {
        String str = "HELLO";

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();

        str=str1.toString();

        // print reversed String
        System.out.println("The reversed string is- "+str);
     }
}
