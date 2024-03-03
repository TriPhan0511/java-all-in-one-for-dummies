package book02.chapter03workingwithnumbersandexpressions.part02dividingintegers;

import java.util.Scanner;

public class MarblesApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        int marbles = scanner.nextInt();
        System.out.print("Number of children: ");
        int children = scanner.nextInt();
        System.out.println("Give each child " + marbles / children + " marbles.");
        System.out.println("You will have " + marbles % children + " marbles left over.");
    }
    // Output:
    // Welcome to the marble divvy-upper.
    // Number of marbles: 93
    // Number of children: 5
    // Give each child 18 marbles.
    // You will have 3 marbles left over.
}