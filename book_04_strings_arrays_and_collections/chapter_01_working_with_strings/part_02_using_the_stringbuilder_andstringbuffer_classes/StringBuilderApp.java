// To illustrate how the StringBuilder class works, here’s a StringBuilder version
// of the MarkVowels program from earlier in this chapter:
// The following program replaces all the vowels 
// in a string entered by the user with asterisks

package book_04_strings_arrays_and_collections.chapter_01_working_with_strings.part_02_using_the_stringbuilder_andstringbuffer_classes;

import java.util.Scanner;

public class StringBuilderApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilderApp app = new StringBuilderApp();
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        // String originalString = "Where have all the vowels gone?";
        System.out.println(originalString);
        System.out.println(app.replaceByAsterisk(originalString));
    }

    private String replaceByAsterisk(String originalString) {
        StringBuilder modifiedString = new StringBuilder(originalString);
        for (int i = 0; i < originalString.length(); i++) {
            char ch = originalString.charAt(i);
            if (isVowel(ch)) {
                modifiedString.setCharAt(i, '*');
            }
        }
        return modifiedString.toString();
    }
    
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' 
            || ch == 'o' || ch == 'u';
    }
}
