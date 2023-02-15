public class Calculator {
    public double basicCalculator(double a, String o, double b) {
        double nothing = 0;

        return switch (o) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> nothing;
        };
    }

    public String extendedCalculator(String expression){

    }
}
