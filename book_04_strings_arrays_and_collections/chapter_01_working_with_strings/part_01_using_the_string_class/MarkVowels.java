// The following program uses substrings to replace all the vowels 
// in a string entered by the user with asterisks
package book_04_strings_arrays_and_collections.chapter_01_working_with_strings.part_01_using_the_string_class;

import java.util.Scanner;

public class MarkVowels {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        // String originalString = "Where have all the vowels gone?";
        System.out.println(originalString);
        System.out.println(replaceByAsterisk(originalString));
    }
    
    private static String replaceByAsterisk(String originalString) {
        String modifiedString = originalString;
        for (int i = 0; i < originalString.length(); i++) {
            char ch = originalString.charAt(i);
            if (isVowel(ch)) {
                String s1 = modifiedString.substring(0, i);
                String s2 = modifiedString.substring(i + 1);
                modifiedString = s1 + "*" + s2;
            }
        }
        return modifiedString;
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' 
            || ch == 'o' || ch == 'u';
    }
}
