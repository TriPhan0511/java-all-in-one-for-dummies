package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_03_creating_deep_copies.sample1;

public class Employee implements Cloneable {
    private String lastName;
    private String firstName;
    private Address address;

    public Employee(String lastName, String firstName, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() {
        Employee emp;
        try {
            emp = (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }        
        return emp;
    }

    @Override 
    public String toString() { 
        return "Employee [" 
            + lastName + " "
            + firstName + " "
            + ", address=" + address + "]"; }
}
