package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_05_the_class_class;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(
            "Martinez", "Anthony");
        System.out.println(emp.getClass().getName()); // Employee
        
        Employee emp2 = new HourlyEmployee(
            "Hillary", "Hilton", 20);
        System.out.println(emp2.getClass().getName()); // HourlyEmployee

        System.out.println(emp2.getClass().getSuperclass().getName()); // Employee

        Object o1 = new Employee("John", "Doe");
        Object o2 = new Employee("Mary", "Johnson");
        if (o1.getClass() == o2.getClass()) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
        // They are the same

        if (emp.getClass().getName().equals("book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_05_the_class_class.Employee")) {
            System.out.println("This is an employee object.");
        }
        // This is an employee object.
    }
}

