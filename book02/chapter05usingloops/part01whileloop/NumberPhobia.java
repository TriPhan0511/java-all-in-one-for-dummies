package book02.chapter05usingloops.part01whileloop;

import java.util.Scanner;

public class NumberPhobia {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int counter = 2;
        String input;
        while (true) {
            System.out.println(counter);
            System.out.print("Do you want to keep counting? (Y/N)");
            input = scanner.next();
            if (input.equalsIgnoreCase("N")) {
                break;
            }
            counter += 2;
        }
        System.out.println("Whew! That was close");
    }
}
