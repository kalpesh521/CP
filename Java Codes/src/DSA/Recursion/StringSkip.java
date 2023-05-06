package DSA.Recursion;

public class StringSkip {

    public static void main(String[] args) {
        skip("", "baabcdad");
        System.out.println(skip2("baab"));

        System.out.println(skipApple("bbcapplede"));
        System.out.println(skipAppNotApple("bcnapplmn"));
    }

    /*
    Processed / Unprocessed
     *  p  / up
     *  " " / "baabc"
     *  "b" / "aabc"
     *  "b" / "abc" skip a
     *    ....
     *
     * */

    // Skip Character  by recursive call
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        if (c == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + c, up.substring(1));

        }

    }

    // Return String
    static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char c = up.charAt(0);

        if (c == 'a') {
            return skip2(up.substring(1));
        } else {
            return c + skip2(up.substring(1));

        }

    }

    //Return String ,skip String

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }


        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));

        }

    }

    // If it is not apple then it will remove app
    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }


        if (up.startsWith("app")&& !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));

        }

    }
}
