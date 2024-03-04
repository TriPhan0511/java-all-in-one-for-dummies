package book02.chapter06usingswitchstatement;

import java.util.Scanner;

public class VoterApp2 {
    static Scanner scanner = new Scanner(System.in);

    static void printMessage(int errorCode){
        String msg;
        switch (errorCode) {
            case 1:
                msg = "Voter marked more than one "
                    + "candidate.\nBallot rejected.";
                break;
            case 2:
                msg = "Box checked and write-in candidate "
                    + "entered.\nBallot rejected.";
                break;
            case 3:
                msg = "Entire ballot was blank.\n"
                    + "Ballot filled in according to "
                    + "secret plan.";
                break;
            case 4:
                msg = "Nothing unusual about the ballot.\n"
                    + "Voter randomly selected for tax audit.";
                break;
            case 5:
                msg = "Voter filled in every box.\n"
                    + "Ballot counted twice.";
                break;
            case 6:
                msg = "Voter drooled in voting machine.\n"
                    + "Beginning spin cycle.";
                break;
            case 7:
                msg = "Voter lied to pollster after voting.\n"
                    + "Voter's ballot changed "
                    + "to match polling data.";
                break;
        
            default:
                msg = "Voter filled out ballot correctly.\n"
                    + "Ballot discarded anyway.";
                break;
        }
        System.out.println(msg);
    }

    enum ErrorCode {
        ONE, TWO, THREE
    }

    public static void main(String[] args) {
        ErrorCode errorCode = ErrorCode.TWO;
        switch (errorCode) {
            case ONE:
                System.out.println("1");
                break;
            case TWO:
                System.out.println("2");
                break;
            case THREE:
                System.out.println("3");
                break;
        
            default:
                System.out.println("DEFAULT");
                break;
        }
    }
    // public static void main(String[] args) {
    //     char s = 'c';
    //     switch (s) {
    //         case 'a':
    //             System.out.println("character a");
    //             break;
    //         case 'b':
    //             System.out.println("character b");
    //             break;
    //         case 'c':
    //             System.out.println("character c");
    //             break;
        
    //         default:
    //             System.out.println("Default");
    //             break;
    //     }
    // }
    // public static void main(String[] args) {
    //     String s = "d";
    //     switch (s) {
    //         case "a":
    //             System.out.println("letter a");
    //             break;
    //         case "b":
    //             System.out.println("letter b");
    //             break;
    //         case "c":
    //             System.out.println("letter c");
    //             break;
        
    //         default:
    //             System.out.println("Default");
    //             break;
    //     }
    // }

    // public static void main(String[] args) {
    //     System.out.println("Welcome to the voting machine "
    //         + "error code decoder.\n\n"
    //         + "If your voting machine generates an error code, \n"
    //         + "you can use this program to dtermine "
    //         + "the exact\ncause of the error.\n");
    //     System.out.print("Enter the error code: ");
    //     int errorCode = scanner.nextInt();
    //     printMessage(errorCode);

    //     // for (int i = 1; i <= 8; i++) {
    //     //     printMessage(i);
    //     //     System.out.println();
    //     // }
    // }
}
