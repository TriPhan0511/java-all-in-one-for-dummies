package theories.clone.shallow_clone;

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

    // Notice that this method doesn’t have to be aware of any of the fields declared in
    // the Employee class. This clone method, however, works only for classes whose
    // fields are all either primitive types or immutable objects such as strings.
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
