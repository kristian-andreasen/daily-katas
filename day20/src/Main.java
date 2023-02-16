import java.util.Arrays;

public class Main {

    public static String translateWord(String str) {
        String result = "";

        if (str.matches("(?i)[^aeiou].*")) {
            String initialConsonants = str.replaceAll("([^aeiouAEIOU]*).*", "$1");
            result = str.replaceFirst(initialConsonants, "");
            return result + initialConsonants + "ay";
        }
        return str + "yay";
    }

    public static StringBuilder translateSentence(String sentence) {
        StringBuilder result = new StringBuilder();

        String[] substrings = sentence.split(" ");

        for (String word : substrings) {
            result.append(translateWord(word) + " ");
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(translateWord("amazon")); //amazon ➞ amazonay
        System.out.println(translateWord("cat")); //cat ➞ atcay
        System.out.println(translateWord("shrimp")); //shrimp ➞ impshray

        System.out.println(translateSentence("I like to eat honey waffles.")); //"Iyay ikelay otay eatyay oneyhay afflesway."
    }
}