public class Main {
    static int primeNumbers (int ceil) {
        int count = 0;
        for (int i = 2; i < ceil; i++) {
            if(isPrime(i)) count++;
        }
        return count;
    }

    static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(primeNumbers(10)); //4
        System.out.println( primeNumbers(20)); //8
        System.out.println(primeNumbers(30)); //10
    }
}