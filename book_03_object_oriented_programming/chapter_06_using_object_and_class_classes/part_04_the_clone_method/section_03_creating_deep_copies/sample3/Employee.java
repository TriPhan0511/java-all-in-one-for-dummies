package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_03_creating_deep_copies.sample3;

public class Employee implements Cloneable {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }        
    }

    @Override 
    public String toString() { 
        return "Employee [" 
            + firstName + " "
            + lastName + ", "
            + "salary: " + salary + "]"; 
    }
}
