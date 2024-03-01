package book02chapter03workingwithnumbersandexpressions05usingtheunaryplusandminusoperators;

public class App {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = +x;
        System.out.println("x = " + x); // x = 5
        System.out.println("y = -x = " + y); // y = -x = -5
        System.out.println("z = +x = " + z); // z = +x = 5
        // Output:
        // x = 5
        // y = -x = -5
        // z = +x = 5

        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println(a * -(b + c)); // -27
    }
    
}
