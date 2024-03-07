package book_02_programming_basics.chapter03workingwithnumbersandexpressions.part07usingthemathclass;

public class RoundingApp {
    public static void main(String[] args) {
        double x = 29.4;
        double y = 93.5;        
        double z = -19.3;

        System.out.println("Math.round(x) = " + Math.round(x)); // 29
        System.out.println("Math.round(y) = " + Math.round(y)); // 94
        System.out.println("Math.round(z) = " + Math.round(z)); // -19

        System.out.println("Math.ceil(x) = " + Math.ceil(x)); // 30.0
        System.out.println("Math.ceil(y) = " + Math.ceil(y)); // 94.0
        System.out.println("Math.ceil(z) = " + Math.ceil(z)); // -19.0

        System.out.println("Math.floor(x) = " + Math.floor(x)); // 29.0
        System.out.println("Math.floor(y) = " + Math.floor(y)); // 93.0
        System.out.println("Math.floor(z) = " + Math.floor(z)); // -20.0

        System.out.println("Math.rint(x) = " + Math.rint(x)); // 29.0
        System.out.println("Math.rint(y) = " + Math.rint(y)); // 94.0
        System.out.println("Math.rint(z) = " + Math.rint(z)); // -19.0  
    }
}
