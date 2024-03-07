package book_02_programming_basics.chapter05usingloops.part01whileloop;

import java.util.Scanner;

public class NumberPhobia2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input = "Y";
        int counter = 2;
        while (!input.equalsIgnoreCase("N")) {
            System.out.println(counter);
            System.out.print("Do you want to keep counting? (Y/N)");
            input = scanner.next();
            counter += 2;
        }
        System.out.println("Whew! That was close");
    }
}
