package book02.chapter03workingwithnumbersandexpressions.part05usingincrementanddecrementoperators;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        // int c = a * b++; // c = 15
        int c = a * ++b; // c = 20
        System.out.println("c = " + c);
    }
}
