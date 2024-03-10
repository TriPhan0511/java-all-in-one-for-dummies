package theories.clone.deep_clone;

public class Employee implements Cloneable {
    private String firstName;
    private String lastName;
    private double salary;
    private Address address;

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
            emp.setAddress((Address) address.clone());
        } catch (CloneNotSupportedException e) {
            return null; // will never happen because this class is Cloneable
        }        
        return emp;
    }

    @Override 
    public String toString() { 
        return "Employee [" 
            + firstName + " "
            + lastName + ", "
            + "salary: " + salary + ", "
            + "address: " + address
            + "]"; 
    }
}
