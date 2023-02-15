public class Main {

    public static StringBuilder pascalConverter(String str){
        StringBuilder result = new StringBuilder();

        // Split str around matches of empty string ""
        String[] substrings = str.split(" ");

        for (String word : substrings) {
            result.append(word.toUpperCase().charAt(0) + word.substring(1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String test = "The quick brown fox jumped over the lazy dog";
        System.out.println(pascalConverter(test));
    }
}