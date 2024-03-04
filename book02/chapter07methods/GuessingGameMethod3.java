package book02.chapter07methods;

import java.util.Scanner;

public class GuessingGameMethod3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do {
            playAround(1, getRandomNumber(7, 12));
        } while (askForAnotherRound("Try again?"));
        System.out.println("\nThanks for playing!");
    }

    public static void playAround(int min, int max) {
        // Pick a random number
        int number = getRandomNumber(min, max);
        // System.out.println("TEST: " + number);

        // Get the guess
        System.out.println("I'm thinking of a number "
            + "between " + min + " and " + max + ".");  
        System.out.print("What do you think it is? ");
        int guess = getGuess(min, max);

        // Check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong! " 
            + "The number was " + number + ".");
        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
    
    public static int getGuess(int min, int max) {
        while (true) {
            int guess = scanner.nextInt();
            if ((guess < min) || (guess > max)) {
                System.out.print("I said, between " 
                    + min + " and " + max + ". Try again: ");
            } else {
                return guess;
            }
        }
    }
    
    public static boolean askForAnotherRound(String message) {
        while (true) {
            String answer;
            System.out.print("\n" + message + " (Y or N): ");
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
}
