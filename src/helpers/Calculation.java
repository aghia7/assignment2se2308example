package helpers;

public class Calculation {
    private Calculation() {}

    public static double calculateHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
