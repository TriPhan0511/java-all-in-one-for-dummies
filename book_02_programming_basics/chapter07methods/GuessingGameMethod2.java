package book_02_programming_basics.chapter07methods;

import java.util.Scanner;

public class GuessingGameMethod2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do {
            playAround();
        } while (askForAnotherRound());
        System.out.println("\nThanks for playing!");
    }

    public static void playAround() {
        // Pick a random number between 1 and 10
        int number = getRandomNumber(1, 10);
        // System.out.println("TEST: " + number);

        // Get the guess
        System.out.println("\nI'm thinking of a number " 
            + "between 1 and 10."); 
        System.out.print("What do you think it is? ");
        int guess = getGuess();

        // Check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong! " 
            + "The number was " + number + ".");
        }
    }
    
    public static boolean askForAnotherRound() {
        while (true) {
            String answer;
            System.out.print("\nPlay again? (Y or N): ");
            answer = scanner.next().toUpperCase();
            if (answer.equals("Y")) {
                return true;
            } else if (answer.equals("N")) {
                return false;
            } else {
                System.out.print("Please enter Y or N.");
            }
            
        }        
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int getGuess() {
        while (true) {
            int guess = scanner.nextInt();
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 and 10." 
                + "Try again: ");
            } else {
                return guess;
            }
        }
    }
}
