public class Main {
    public static int bugger(int num, int multiplicativePersistence) {
        //convert num to a string so it can be looped through like an array
        String numString = Integer.toString(num);
        int product = 1;

        //base case: stop recursion if num is a single digit
        if (numString.length() == 1) {
            return multiplicativePersistence;
        }

        //loop through each character/digit in numString
        for (int i = 0; i < numString.length(); i++) {
            //convert element to int
            int digit = Character.getNumericValue(numString.charAt(i));

            product *= digit;
        }
        multiplicativePersistence++;

        return bugger(product, multiplicativePersistence);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println(bugger(39, 0)); //3
    }
}