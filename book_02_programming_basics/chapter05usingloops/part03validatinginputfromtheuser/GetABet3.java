package book_02_programming_basics.chapter05usingloops.part03validatinginputfromtheuser;

import java.util.Scanner;

public class GetABet3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int bank = 1000; // assume the user has $1,000
        int bet; // the bet entered by the user
        boolean validBet; // indicates whether the bet is valid
        System.out.println("You can bet between 1 and " + bank + " dollars");
        do {
            System.out.print("Enter your bet: ");
            bet = scanner.nextInt();
            if ((bet > bank) || (bet <= 0)) {
                validBet = false;
                System.out.println("What, are you crazy?");
            }
            else {
                validBet = true;
            }
        } while (!validBet);
        System.out.println("You bet " + bet + " dollars");
    }
}
