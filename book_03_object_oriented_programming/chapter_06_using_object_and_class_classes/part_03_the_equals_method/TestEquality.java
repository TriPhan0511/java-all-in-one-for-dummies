package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_03_the_equals_method;

public class TestEquality {
    public static void main(String[] args) {
        Employee emp1 = 
            new Employee("Smith", "John");
        Employee emp2 = 
            new Employee("Smith", "John");
        if (emp1.equals(emp2)) {
            System.out.println("The employees are the same.");
        } else {
            System.out.println("These are different employees.");
        }
        // Output: 
        // The employees are the same.
    }
}