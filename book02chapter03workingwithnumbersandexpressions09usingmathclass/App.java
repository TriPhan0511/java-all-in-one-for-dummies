package book02chapter03workingwithnumbersandexpressions09usingmathclass;

public class App {
    public static void main(String[] args) {
        // Constants of the Math class
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.E); // 2.718281828459045
        System.out.println(Math.abs(-2.12)); // 2.12
        System.out.println(Math.max(2, 1)); // 2
        System.out.println(Math.max(2.12, 2.15)); // 2.15
        System.out.println(Math.min(2, 1)); // 1
        System.out.println(Math.min(2.12, 2.15)); // 2.12
        System.out.println(Math.pow(4, 2)); // 16.0
        System.out.println(Math.random()); // 0.0 <= x < 1.0
        System.out.println(Math.signum(0)); //  0.0
        System.out.println(Math.signum(2.12)); //  1.0
        System.out.println(Math.signum(-2.12)); // -1.0
        System.out.println(Math.sqrt(4)); // 2.0
    }
}
