import java.io.Serializable;
import java.security.InvalidParameterException;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;


public class Main {
    public static long addStrNums(String strNum1, String strNum2) throws InvalidParameterException {
        long num1;
        long num2;

        if (strNum1.isEmpty()) {
            strNum1 = "0";
        }

        if (strNum2.isEmpty()) {
            strNum2 = "0";
        }

        num1 = parseLong(strNum1);
        num2 = parseLong(strNum2);
        return num1 + num2;
    }

    // Function for finding sum of larger numbers
    static String addStrNums2(String str1, String str2) {
        // Before proceeding further, make sure length
        // of str2 is larger.
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = str1.length(), n2 = str2.length();

        // Reverse both of Strings
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++) {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((int) (str1.charAt(i) - '0') +
                    (int) (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');

            // Calculate carry for next step
            carry = sum / 10;
        }

        // Add remaining digits of larger number
        for (int i = n1; i < n2; i++) {
            int sum = ((int) (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            str += (char) (carry + '0');

        // reverse resultant String
        str = new StringBuilder(str).reverse().toString();

        return str;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(addStrNums("4", "5")); //9
        //System.out.println(addStrNums("abcdefg", "3")); //-1
        //System.out.println(addStrNums("1", "")); //1
        System.out.println(addStrNums("1874682736267235927359283579235789257", "32652983572985729"));

           ; //1874682736267235927391936562808774986



    }
}