package book02.chapter05usingloops.part03validatinginputfromtheuser;

import java.util.Scanner;

public class GetABet2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int bank = 1000; // assume the user has $1,000
        int bet; // the bet entered by the user
        System.out.println("You can bet between 1 and " + bank + " dollars");
        do {
            System.out.print("Enter your bet: ");
            bet = scanner.nextInt();
            if ((bet > bank) || (bet <= 0)) {
                System.out.println("What, are you crazy?");
            }
        } while ((bet > bank) || (bet <= 0));
        System.out.println("You bet " + bet + " dollars");
    }
}