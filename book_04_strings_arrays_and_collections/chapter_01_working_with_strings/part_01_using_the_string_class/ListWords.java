package book_04_strings_arrays_and_collections.chapter_01_working_with_strings.part_01_using_the_string_class;

import java.util.Scanner;

public class ListWords {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
