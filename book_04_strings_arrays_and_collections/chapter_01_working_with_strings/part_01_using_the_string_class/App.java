package book_04_strings_arrays_and_collections.chapter_01_working_with_strings.part_01_using_the_string_class;

public class App {
    public static void main(String[] args) {
        // Finding the length of a string
        // System.out.println("A wonderful day for a neighbor.".length()); // 31

        // Making simple string modifications
        // String s1 = "Oompa Loompa";
        // String s2 = s1.toUpperCase();
        // System.out.println(s2); // OOMPA LOOMPA

        // String s = "   Oompa Loompa   ";
        // System.out.println(s.length()); // 18
        // s = s.trim();
        // System.out.println(s); // Oompa Loompa
        // System.out.println(s.length()); // 12

        // Splitting a string
        // String s = "1500 N. Third Street:Fresno:CA:93722";
        // String[] fields = s.split(":");
        // for (String field : fields) {
        //     System.out.println(field);
        // }
        // for (int i = 0; i < fields.length; i++) {
        //     System.out.println(fields[i]);
        // }

        // Replacing parts of a string
        String input = "I love cats";
        input = input.replaceAll("cat", "dog");
        // input = input.replace("cat", "dog");
        System.out.println(input); // I love dogs
    }
}
