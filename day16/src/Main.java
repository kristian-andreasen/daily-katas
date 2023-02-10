public class Main {
    public static boolean canComplete(String input, String target){
        //input needs to be smaller than target since no letters need to be taken away
        if(input.length() > target.length()){
            return false;
        }
        //check if input string contains a letter that don't exist in target
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(target.indexOf(currentChar) == -1){
                return false;
            }
        }
        int counter = 0;

        for (int j = 0; j < target.length(); j++) {
            System.out.println("input char: " + input.charAt(counter) + " target char: " + target.charAt(j));
            /*if(input.charAt(counter) != target.charAt(j)) {
                return false;
            }*/
            counter++;
        }
        return true;
    }
    public static void main(String[] args) {

        // We can add "ea" between "b" and "u", and "ifu" between "t" and "l".
        System.out.println(canComplete("butl", "beautiful")); //true

        // "z" does not exist in the word beautiful.
        System.out.println(canComplete("butlz", "beautiful")); //false

        // Although "t", "u", "l" and "b" all exist in "beautiful", they are incorrectly ordered.
        System.out.println(canComplete("tulb", "beautiful")); //false

        // Too many "b"s, beautiful has only 1.
        System.out.println(canComplete("bbutl", "beautiful")); //false


    }
}