package book_04_strings_arrays_and_collections.chapter_03_using_the_arraylist_class;

import java.util.ArrayList;

public class UpdatingElementsDemo {
    public static void main(String[] args) {
        // Because array lists contain references to objects, not the objects themselves, any
        // changes you make to an object in an array list are automatically reflected in the
        // list. As a result, you don’t often have to use the set method.
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Doe"));
        employees.add(new Employee("Jane", "Doe"));
        employees.add(new Employee("Tom", "Smith"));
        System.out.println(employees);
        employees.get(0).changeName("Paris", "Hiton");
        System.out.println(employees);
        // Output:
        // [John Doe, Jane Doe, Tom Smith]
        // [Paris Hiton, Jane Doe, Tom Smith]
    }    
    
    // public static void main(String[] args) {
    //     ArrayList<String> nums = new ArrayList<>();
    //     nums.add("one");
    //     nums.add("two");
    //     nums.add("three");
    //     System.out.println(nums); // [one, two, three]
    //     nums.set(0, "uno");
    //     nums.set(1, "dos");
    //     nums.set(2, "tres");
    //     System.out.println(nums); // [uno, dos, tres]
    // }
}
