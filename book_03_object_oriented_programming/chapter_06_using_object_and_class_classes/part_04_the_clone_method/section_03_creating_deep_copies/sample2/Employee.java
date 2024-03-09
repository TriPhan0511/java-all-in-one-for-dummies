package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_03_creating_deep_copies.sample2;

public class Employee implements Cloneable {
    private String firstName;
    private String lastName;
    private double salary;
    public Address address;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address();
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
        Employee emp;
        try {
            emp = (Employee) super.clone();
            emp.address = (Address) address.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
        return emp;
    }
     @Override
     public String toString() {
        return this.getClass().getName() + " ["
            + firstName + " "
            + lastName + " "
            + salary + " "
            + address + "]";
     }

}

