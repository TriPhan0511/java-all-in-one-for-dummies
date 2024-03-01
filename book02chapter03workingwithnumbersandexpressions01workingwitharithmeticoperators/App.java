package book02chapter03workingwithnumbersandexpressions01workingwitharithmeticoperators;

public class App {
    public static void main(String[] args) {
        // int types
        // int a = 32;
        // int b = 5;
        // System.out.println("a + b = " + (a + b)); // 37
        // System.out.println("a - b = " + (a - b)); // 27
        // System.out.println("a * b = " + (a * b)); // 160 
        // System.out.println("a / b = " + (a / b)); // 6
        // System.out.println("a % b = " + (a % b));  // 2
        // a++;
        // b--;
        // System.out.println("a = " + a); // 33
        // System.out.println("b = " + b);// 4

        // double types
        // double x = 5.5;
        // double y = 2.0;
        // System.out.println("x + y = " + (x + y)); // 7.5
        // System.out.println("x - y = " + (x - y)); // 3.5
        // System.out.println("x * y = " + (x * y)); // 11.0
        // System.out.println("x / y = " + (x / y)); // 2.75
        // System.out.println("x % y = " + (x % y)); // 1.5
        // x++;
        // y--;
        // System.out.println("x = " + x); // 6.5
        // System.out.println("y = " + y); // 1.0

        // Note:
        // When we divide two integers, the result is an integer,
        // even if you assign it to a double variable.
        int a = 21;
        int b = 6;
        double c = a / b;
        System.out.println("c = " + c); // 3.0
        // If that's not what you want, you can cast one of the operands 
        // to a double before performing the division.
        double d = (double)a / b;
        // double d = a / (double)b;
        System.out.println("d = " + d); // 3.5
    }
}
