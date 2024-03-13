package book_04_strings_arrays_and_collections.chapter_02_using_arrays.part_03_using_varargs;

public class App {
    public static void main(String[] args) {
        printSomeWords();
        printSomeWords("I");
        printSomeWords("Am", "Not");
        printSomeWords("Throwing", "My", "Shot");
    }

    private static void printSomeWords(String... words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
