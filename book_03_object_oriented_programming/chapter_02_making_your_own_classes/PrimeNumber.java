// Using Initializers
package book_03_object_oriented_programming.chapter_02_making_your_own_classes;

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