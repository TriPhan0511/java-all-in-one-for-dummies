package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_03_the_equals_method;

public class Employee {
    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object obj) {
        // An object must be equal itself
        if (this == obj) {
            return true;
        }
        // No object equals null
        if (obj == null) {
            return false;
        }
        // Objects of different types are never equal
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        // Cast to an Employee, then compare the fields
        return this.lastName.equals(((Employee) obj).lastName) && 
            this.firstName.equals(((Employee) obj).firstName);
    }
}
