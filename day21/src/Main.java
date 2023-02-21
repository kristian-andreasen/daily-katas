import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static String reverse(String s){
        if(s.length() <= 1){
            return s;
        }
        //hello --> h
        //ello --> eh
        //llo --> leh
        //lo --> lleh
        //o --> olleh
        return reverse(s.substring(1))+ s.charAt(0);
    }

    public static String incDec(int exponent){
        int base = 10;
        ArrayList<Integer> range = new ArrayList<>();
        for (int i = exponent; i <= (int) Math.pow(base, exponent); i++) {
            range.add(i);
        }
        return range.toString();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(reverse("hello")); //"olleh"

        System.out.println(incDec(1));



    }
}