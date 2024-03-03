package book02.chapter03workingwithnumbersandexpressions.part03combiningoperators;

public class App {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = 7;
        int result = x + y * z;
        System.out.println("x + y * z = " + result); // 5 + 3 * 7 = 26
        result = (x + y) * z;
        System.out.println("(x + y) * z = " + result); // (5 + 3) * 7 = 56
    }
    // Output:
    // x + y * z = 26
    // (x + y) * z = 56
}
