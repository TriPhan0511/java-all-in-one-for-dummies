package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_02_the_tostring_method;

public class Employee {
    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return this.getClass().getName() 
            + "[" + lastName + " " 
            + firstName + "]";
    }
}
