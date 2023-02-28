import java.util.ArrayList;

public class Main {
    public static boolean isDisarium(int num) {
        String numString = Integer.toString(num);
        //ArrayList<Integer> sum = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            double product = Math.pow(digit, i + 1);
            sum += product;
            if (sum == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDisariumRecursive(int num, int counter) {
        String numString = Integer.toString(num);
        int sum = 0;
        int recursiveCounter = counter;

        if (recursiveCounter > 0) {
            return false;
        }

        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            double product = Math.pow(digit, i + 1);
            sum += product;
        }

        if (num == sum) {
            return true;
        }

        recursiveCounter++;
        return isDisariumRecursive(sum, recursiveCounter);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isDisariumRecursive(75, 0)); //➞false
        // 7^1 + 5^2 = 7 + 25 = 32

        System.out.println(isDisariumRecursive(135, 0));  //➞true
        // 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135

        System.out.println(isDisariumRecursive(544, 0)); //false
        System.out.println(isDisariumRecursive(518, 0)); //true
        System.out.println(isDisariumRecursive(8, 0)); //true
        System.out.println(isDisariumRecursive(466, 0)); //false
    }
}