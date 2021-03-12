package OOP;

import java.util.function.DoubleUnaryOperator;

public class Integtate {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        int n = 100000;
        double h = (b - a) / n;
        double result = 0;

        for(int i = 0; i < n; i++) {
            result += f.applyAsDouble(a + h * (i + 0.5));
        }

        return result *= h;
    }
}
