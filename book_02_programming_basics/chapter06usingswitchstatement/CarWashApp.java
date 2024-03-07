package book_02_programming_basics.chapter06usingswitchstatement;

import java.util.Scanner;

/**
 * CarWashApp
 */
public class CarWashApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("The car wash application!\n\n");
        System.out.print("Enter package code: ");
        String packageCode = scanner.next();
        char code = packageCode.charAt(0);
        String details = switch (code) {
            case 'A', 'a' -> packageA();
            case 'B', 'b' -> packageB() + packageA();
            case 'C', 'c' -> packageC() + packageB() + packageA();
            case 'D', 'd' -> packageD() + packageC() + packageB() + packageA();
            case 'E', 'e' -> packageE() + packageD() + packageC() + packageB() + packageA();
            default -> "That's not one of the codes.";
        };
        System.out.println("\nThe package inculdes:\n");
        System.out.println(details);
    }

    public static String packageA()
    {
        return "\tWash, vacuum, and hand dry.\n";
    }
    public static String packageB()
    {
        return "\tWax, plush ...\n";
    }
    public static String packageC()
    {
        return "\tLeather/Vinyl Treatment, plus ...\n";
    }
    public static String packageD()
    {
        return "\tTire Treatment, plus ...\n";
    }
    public static String packageE()
    {
        return "\tNew Car Scent, plus ...\n";
    }

    
}