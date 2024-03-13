package book_04_strings_arrays_and_collections.chapter_02_using_arrays.part_01;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // int[] arr1;
        // int arr2[];
        
        // String[] names = new String[3];
        // names[0] = "John";
        // names[1] = "David";
        // names[2] = "Peter";

        // String[] names = {"John", "David", "Peter"}; // Array initializer

        String[] names = new String[] {"John", "David", "Peter"}; // Array initializer

        // System.out.print("Enter the number of names: ");
        // int count = scanner.nextInt();
        // scanner.nextLine(); // Consume the next line
        // String[] names = new String[count];

        // // Populate the array
        // for (int i = 0; i < count; i++) {
        //     System.out.print("Enter a name: ");
        //     names[i] = scanner.next();
        // }

        // Loop over an array
        for (String name : names) {
            System.out.println(name);
        }
    }
}
