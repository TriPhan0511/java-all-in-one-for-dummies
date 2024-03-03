package book02.chapter03workingwithnumbersandexpressions.part09recognizingweirdthingsaboutjavamath;

import javax.print.attribute.standard.MediaSize.NA;

public class Samplee03DivisionByZero {
    public static void main(String[] args) {
        // System.out.println(1 / 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero

        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("Cannot divided by zero.");
        }
        System.out.println("Program continues.");

        // double result = 1.0 / 0; // Infinity
        // double result = -34.0 / -0; // -Infinity
        // double result = -34.0 / 0; // -Infinity
        // double result = 34.0 / -0; // Infinity
        double result = 0.0 / 0; // NaN
        System.out.println("result = " + result);

        // NaN is not equal to anything, including itself
        double x = Math.sqrt(-1); // NaN
        double y = x;
        if (x == y) {
            System.out.println("x and y are equal.");
        } else {
            System.out.println("x and y are not equal.");
        }
        // Output:
        // x and y are not equal.

        // You can't assume that a number minus itself is always zero
        double k = 1.0;
        double z = k - k; // 0.0
        System.out.println("z = " + z); // 0.0

        k = Math.sqrt(-1.0); // NaN
        z = k - k; // NaN
        System.out.println("z = " + z); // NaN
    }
}
