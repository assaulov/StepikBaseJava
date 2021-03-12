package BaseSintax.ManageConstructions;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int value) {
       BigInteger factorial= BigInteger.ONE;
        for (int i = 1; i <= value ; i++) {
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }


        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
