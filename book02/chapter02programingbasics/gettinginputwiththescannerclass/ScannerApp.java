package book02.chapter02programingbasics.gettinginputwiththescannerclass;

import java.util.Scanner;

/**
 * ScannerApp
 */
public class ScannerApp {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int myInt = scanner.nextInt();
        System.out.println("You entered integer: " + myInt);

        System.out.print("Enter a double: ");
        double myDouble = scanner.nextDouble();
        System.out.println("You entered double: " + myDouble);

        System.out.print("Enter a float: ");
        float myFloat = scanner.nextFloat();
        System.out.println("You entered float: " + myFloat);

        System.out.print("Enter a string: ");
        // Nothe that we call nextLine() to consume the 
        // left-over newline from the previous input

        scanner.nextLine(); // Consume left-over newline
        String myString = scanner.nextLine();
        System.out.println("You entered string: " + myString);

        System.out.print("Enter another string: ");
        myString = scanner.nextLine();
        System.out.println("You entered string: " + myString);
    }
}

// public class ScannerApp {
//     static Scanner sc = new Scanner(System.in);
//     public static void main(String[] args) {
//         System.out.print("Enter an integer: ");
//         int i = sc.nextInt();
//         System.out.println("You entered: " + i);
//     }
// }
