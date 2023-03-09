package Leetcode.String;

public class ReverseString151 {

    public static String reverseWords(String s) {
        //Using StringBuilder ( recommended )
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            int j = i;
            if (i < 0) {
                break;
            }
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }


            if (sb.isEmpty()) {
                sb = sb.append(s.substring(i + 1, j + 1));
            } else {
                sb = sb.append(" " + s.substring(i + 1, j + 1));
            }
        }


        return sb.toString();
    }


    //using String
//           String sb = "";
//           while (i >= 0) {
//            while (i >= 0 && s.charAt(i) == ' ') {
//                i--;
//            }
//            int j = i;
//            if (i < 0) {
//                break;
//            }
//            while (i >= 0 && s.charAt(i) != ' ') {
//                i--;
//            }
//
//
//            if (sb.isEmpty()) {
//                sb = sb.concat(s.substring(i + 1, j + 1));
//            } else {
//                sb = sb.concat(" " + s.substring(i + 1, j + 1));
//            }
//        }
//        return sb;
//    }



    public static void main(String[] args) {
        String str = "The sky is blue";
        System.out.println(reverseWords(str));
    }
}

