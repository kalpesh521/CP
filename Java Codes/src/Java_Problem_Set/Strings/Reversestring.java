package Java_Problem_Set.Strings;

public class Reversestring {
    public static void main(String[] args) {
        String str = "hello";

        //Approch 1
        char[] charr = str.toCharArray();
        for (int i = charr.length - 1; i >= 0; i--) {
            System.out.print(charr[i]);
        }

        //Approach 2
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        //Approach 3

        StringBuilder sbd= new StringBuilder(str);
        System.out.print(sbd.reverse());
        //Approach 4
        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());
    }
}
