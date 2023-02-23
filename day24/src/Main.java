import java.util.HashMap;
import java.util.Map;

public class Main {

    public static boolean isPositiveDominant(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int sumOfUniquePostive = 0;
        int sumOfUniqueNegative = 0;

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getKey() > 0) {
                sumOfUniquePostive++;
            }
            if (set.getKey() < 0) {
                sumOfUniqueNegative++;
            }
        }
        return sumOfUniquePostive > sumOfUniqueNegative;
    }

    //n = number of holes
    //k = number of tubes
    public static boolean cFuge(int n, int k) {
        return true;

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //test input for positive dominant
        int[] arr = {5, 99, 832, -3, -4};
        System.out.println(isPositiveDominant(arr)); //true

        int[] arr2 = {1, 1, 1, 1, -3, -4};
        System.out.println(isPositiveDominant(arr2)); //false


        //test input for the centrifuge problem:
        System.out.println(cFuge(6, 4)); //true
        System.out.println(cFuge(2, 1)); //false
        System.out.println(cFuge(3, 3)); //true

    }
}