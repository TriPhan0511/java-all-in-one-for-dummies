package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_01_implementing_the_clone_method;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
    // protected Object clone() throws CloneNotSupportedException {
    protected Object clone() {
        Employee emp = new Employee(firstName, lastName);
        emp.setSalary(salary);
        return emp;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
            + firstName  + " "
            + lastName + ", "
            + salary + "]";   
    }
}
