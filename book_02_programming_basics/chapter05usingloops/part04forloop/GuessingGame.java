package book_02_programming_basics.chapter05usingloops.part04forloop;

import java.util.Scanner;

public class GuessingGame {
    static Scanner scanner = new Scanner(System.in);
    
    /**
     * Generates a random number within the specified range.
     *
     * @param low  the lower bound of the range (inclusive)
     * @param high the upper bound of the range (inclusive)
     * @return a random number within the specified range
     */
    static int getRandomNumber(int low, int high) {
        return (int) (Math.random() * (high - low + 1)) + low;
    }    

    /**
     * Gets the user's input.
     *
     * @param low  the lower bound of the range (inclusive)
     * @param high the upper bound of the range (inclusive)
     * @return the user's input
     */
    static int getInput(int low, int high) {
        System.out.println("\nI'm thinking of a number between " + low + " and " + high + ".");
        System.out.print("What do you think it is? ");
        int input;
        while (true) {
            input = scanner.nextInt();
            if (input > high || input < low) {
                System.out.print("I said, between " + low + " and " + high + ". Try again: ");
            } else {
                return input;
            }
        }
    }

    /**
     * Prints the result of the game.
     *
     * @param input  the user's input
     * @param number the random number
     */
    static void printResult(int input, int number) {
        if (input != number) {
            System.out.println("You're wrong! The number was " + number);
        }
        else {
            System.out.println("You're right!");
        }
    }

    /**
     * Asks the user if they want to play again.
     *
     * @param message the message to display
     * @return true if the user wants to play again, false otherwise
     */
    static boolean playAgain() {
        String input;
        while (true) {
            System.out.print("\nPlay again? (Y or N): ");
            input = scanner.next();
            input = input.toUpperCase();
            if (input.equals("Y") || input.equals("N")) {
                break;
            }
        }
        if (input.equals("N")) {
            return false;
        }
        return true;
    }

    /**
     * Plays the guessing game.
     *
     * @param low  the lower bound of the range (inclusive)
     * @param high the upper bound of the range (inclusive)
     */
    static void guessNumber(int low, int high) {
        while (true) {
            // Pick a random number
            int randomNumber = getRandomNumber(low, high);
            System.out.println("TESTING: " + randomNumber);
            // Get the guess
            int input = getInput(low, high);
            // Print the result
            printResult(input, randomNumber);
            // Play again?
            if (!playAgain()) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!\n");
        guessNumber(1, 10);
        System.out.println("\nThank you for playing!");
    }
}


// Solution 1
// public class GuessingGame {
//     static Scanner scanner = new Scanner(System.in);
//     public static int getRandomNumber(int low, int high) {
//         return (int) (Math.random() * (high - low + 1)) + low;
//     }
//     public static void main(String[] args) {
//         boolean keepPlaying = true;
//         System.out.println("Let's play a guessing game!");
//         while (keepPlaying) {
//             boolean validInput;
//             int number;
//             int guess;
//             String answer;

//             // Pick a random number
//             int low = 1;
//             int high = 10;
//             number = getRandomNumber(low, high);
//             System.out.println("TESTING: " + number);

//             // Get the guess
//             System.out.println("\nI'm thinking of a number between"
//             + low + " and " + high + ".");
//             System.out.print("What do you think it is? ");
//             do {
//                 guess = scanner.nextInt();
//                 validInput = true;
//                 if (guess < low || guess > high) {
//                     System.out.print("I said, between " + low 
//                         + " and " + high + ". Try again: ");
//                     validInput = false;
//                 }
//             } while (!validInput);

//             // Check the guess
//             if (guess == number) {
//                 System.out.println("You're right!");
//             } else {
//                 System.out.println("You're wrong! The number was " + number);
//             }

//             // Play again?
//             do {
//                 System.out.print("\nPlay again? (Y/N) ");
//                 validInput = true;
//                 // scanner.nextLine(); // Consume the newline character
//                 answer = scanner.next();
//                 answer = answer.toUpperCase();
//                 if (answer.equals("Y")) {
//                     keepPlaying = true;
//                 } else if (answer.equals("N")) {
//                     keepPlaying = false;
//                 } else {
//                     validInput = false;
                    
//                 }
//             } while (!validInput);
//         }
//         System.out.println("\nThank you for playing!");
//     }
// }