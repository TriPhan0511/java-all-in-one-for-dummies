// Using Initializers
package book03objectorientedprogramming.chapter02makingyourownclasses;

import java.util.Scanner;

public class PrimeNumber {
    static Scanner sc = new Scanner(System.in);
    private int x;
    // Initializer block
    {
        System.out.print("Enter a number: ");
        x = sc.nextInt();
    }

    public int getX() {
        return x;
    }
}

// public class PrimeNumber {
//     static Scanner sc = new Scanner(System.in);
//     private int x = getInteger();

//     private int getInteger() {
//         System.out.print("Enter a number: ");
//         return sc.nextInt();
//     }

//     public int getX() {
//         return x;
//     }
// }