package book_02_programming_basics.chapter03workingwithnumbersandexpressions.part07usingthemathclass;

public class Sample {
    public static void main(String[] args) {
        int a = 100;
        int b = -50;
        int c = 3;
        double x = 25.0;        
        double y = 3.0;
        double z = 4.0;

        System.out.println("abs(b) = " + Math.abs(b)); // 50
        System.out.println("cbrt(x) = " + Math.cbrt(x)); // 2.924017738212866
        System.out.println("exp(y) = " + Math.exp(y)); // 20.085536923187668
        System.out.println("hypot(y, z) = " + Math.hypot(y, z)); // 5.0
        System.out.println("log(y) = " + Math.log(y)); // 1.0986122886681098
        System.out.println("log10(y) = " + Math.log10(y)); // 0.47712125471966244
        System.out.println("max(a, b) = " + Math.max(a, b)); // 100
        System.out.println("min(a, b) = " + Math.min(a, b)); // -50
        System.out.println("pow(a, c) = " + Math.pow(a, c)); // 1000000.0
        System.out.println("random() = " + Math.random()); // 0.0 <= x < 1.0
        System.out.println("signum(b) = " + Math.signum(b)); // -1.0
        System.out.println("sqrt(x) = " + Math.sqrt(x)); // 5.0
    }
}
