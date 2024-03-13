// The following program uses the charAt method to count the number
// of vowels in a string entered by the user

package book_04_strings_arrays_and_collections.chapter_01_working_with_strings.part_01_using_the_string_class;

import java.util.Scanner;

public class CountVowels {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // String input = "Hello, World!";
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }
        System.out.println("That string contains "
            + count + " vowels.");
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
