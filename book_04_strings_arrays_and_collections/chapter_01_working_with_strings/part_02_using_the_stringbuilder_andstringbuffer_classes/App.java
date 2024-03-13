package book_04_strings_arrays_and_collections.chapter_01_working_with_strings.part_02_using_the_stringbuilder_andstringbuffer_classes;

public class App {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Today is the day!");
        System.out.println(sb.length()); // 17
        System.out.println(sb.capacity()); // 33

        // System.out.println(sb.reverse()); // !yad eht si yadoT

        // sb.setCharAt(0, 'H');
        // System.out.println(sb); // Hoday is the day!
    }
}
