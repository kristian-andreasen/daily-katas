import java.util.Arrays;

public class Main {
    public static boolean isAlphabeticallySorted(String sentence) {
        String[] substrings = sentence.replaceAll("[^a-zA-Z\\s]", "").split(" ");
        for (String word : substrings) {
            if (word.length() >= 3) {
                boolean isSorted = true;
                for (int i = 0; i < word.length() - 1; i++) {
                    if (Character.toLowerCase(word.charAt(i)) > Character.toLowerCase(word.charAt(i + 1))) {
                        isSorted = false;
                        break;
                    }
                }
                if (isSorted) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isAlphabeticallySorted("Paula has a French accent.")); //➞ true
        // "accent" is alphabetically sorted.

        System.out.println(isAlphabeticallySorted("The biopsy returned negative results."));  //true
        // "biopsy" is alphabetically sorted.

        System.out.println(isAlphabeticallySorted("She sells sea shells by the sea shore.")); //false
        // Although "by" is alphabetically sorted, it is only 2 letters long.
    }
}