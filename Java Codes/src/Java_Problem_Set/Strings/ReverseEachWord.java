package Java_Problem_Set.Strings;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Java python CPP";
        String[] words = str.split(" ");
        String output = "";
        for (String word : words) {
            String revWords = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                revWords = revWords+ word.charAt(i);
            }
            output = output+revWords + " ";
        }
        System.out.println(output);
    }
}
