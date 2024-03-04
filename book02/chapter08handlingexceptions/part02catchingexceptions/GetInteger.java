package book02.chapter08handlingexceptions.part02catchingexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInteger {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered: " + i);
    }
    
    public static int GetAnInteger() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // clear the buffer
                System.out.print("Invalid input. Please enter an integer: ");
            }
        }
    }
}

/*
NOTE:
The nextLine method (or the next method) must be called in the catch block 
to dispose of the user’s invalid input because the nextInt method leaves the 
input value in the Scanner’s input stream if an InputMismatchException is thrown. 
If you omit the statement that calls nextLine, the while loop keeps reading it, 
throws an exception, and displays an error message in an infinite loop.
*/