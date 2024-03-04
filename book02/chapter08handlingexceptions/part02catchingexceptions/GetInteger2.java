package book02.chapter08handlingexceptions.part02catchingexceptions;

import java.util.Scanner;

public class GetInteger2 {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered: " + i);
    }
    
    public static int GetAnInteger() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine(); // clear the buffer
            System.out.print("Invalid input. Please enter an integer: ");
        }
        return scanner.nextInt();
    }

    // public static int GetAnInteger() {
    //     while (true) {
    //         if (scanner.hasNextInt()) {
    //             return scanner.nextInt();
    //         } else {
    //             // scanner.nextLine(); // clear the buffer
    //             System.out.print("Invalid input. Please enter an integer: ");
    //         }
    //     }
    // }
}
