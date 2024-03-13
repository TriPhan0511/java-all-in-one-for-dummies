package book_04_strings_arrays_and_collections.chapter_02_using_arrays.part_02_using_array_with_methods;

public class App {
    public static void main(String[] args) {
        printDays(getDaysOfWeek());
    }

    private static void printDays(String[] days) {
        for (String day : days) {
            System.out.println(day);
        }
    }

    private static String[] getDaysOfWeek() {
        return new String[] {
            "Monday", "Tuesday", "Wednesday", 
            "Thursday", "Friday", "Saturday", "Sunday"
        };  
    }
}
