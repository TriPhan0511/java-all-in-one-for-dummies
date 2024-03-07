package book_02_programming_basics.chapter_02programingbasics.part09shadowingvariables;

public class ShadowApp {
    static int x;
    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x); // 5
        int x;
        x = 10;
        System.out.println("x = " + x); // 10
        System.out.println("ShadowApp.x = " + ShadowApp.x); // 5
        // Output:
        // x = 5
        // x = 10
        // ShadowApp.x = 5
    }
}
