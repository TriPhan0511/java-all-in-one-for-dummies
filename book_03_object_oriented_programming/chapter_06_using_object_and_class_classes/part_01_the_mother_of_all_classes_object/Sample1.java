package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_01_the_mother_of_all_classes_object;

public class Sample1 {
    // public static void main(String[] args) {
    //     Object emp = new Employee();
    //     // emp.setLastName("Smith");
    //     ((Employee)emp).setLastName("Smith");
    //     System.out.println(((Employee)emp).getLastName());
    // }

    public static void main(String[] args) {
        int x = 5;
        // String s = x.toString(); // Error: int does not have a toString() method
        String s = Integer.toString(x); // "5"
        // String s = "" + x; // "5"
    }
}
