package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_02_using_clone_to_create_a_shallow_copy;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe");
        emp1.setSalary(5000);
        Employee emp2 = (Employee) emp1.clone();
        emp2.setLastName("Smith");
        System.out.println(emp1);
        System.out.println(emp2);
        // Output:
        // Employee[John Doe, 5000.0]
        // Employee[John Smith, 5000.0]
        System.out.println("Using clone to create a shallow copy".toUpperCase());
    }
}
