public class Main {
    private final static int 

    public static String humanReadableTime(int inputSeconds){
        int hours = inputSeconds/3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;
        return hours + ":" + minutes + ":" + seconds;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*Tests:
        Input: 0   Output: ”00:00:00″
        Input: 5   Output: ”00:00:05″
        Input: 60 Output: ”00:01:00″
        Input: 86399   Output: ”23:59:59″
        Input: 359999 Output: ”99:59:59″*/
        //Input: 60 Output:

        System.out.println(humanReadableTime(60)); //output "00:01:00″
        System.out.println(humanReadableTime( 86399)); //output "23:59:59"
        System.out.println(humanReadableTime(359999 )); //output: "99:59:59"

    }
}