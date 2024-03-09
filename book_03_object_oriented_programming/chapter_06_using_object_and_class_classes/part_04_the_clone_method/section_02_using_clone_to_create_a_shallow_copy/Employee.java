/*
USING CLONE TO CREATE A SHALLOW COPY

In the preceding example, the clone method manually creates a copy of the original
object and returns it. In many cases, this is the easiest way to create a clone.
But what if your class has a hundred or more fields that need to be duplicated? The
chance of forgetting to copy one of the fields is high, and if you add a field to the
class later on, you may forget to modify the clone method to include the new field.

Fortunately, you can solve this problem by using the clone method of the Object
class directly in your own clone method. The clone method of the Object class
can automatically create a copy of your object that contains duplicates of all the
fields that are primitive types (such as int and double), as well as copies of
immutable reference types — most notably, strings. So if all the fields in your
class are either primitives or strings, you can use the clone method provided by
the Object class to clone your class.

To call the clone method from your own clone method, just specify super.
clone(). Before you can do that, however, you must do two things:

    1. Declare that the class supports the Cloneable interface. The Cloneable
        interface is a marker interface that doesn’t provide any methods. It simply
        marks a class as being appropriate for cloning.

    2. Enclose the call to super.clone() in a try/catch statement that catches the
        exception CloneNotSupportedException. This exception is thrown if you try
        to call clone on a class that doesn’t implement the Cloneable interface.
        Provided that you implement Cloneable, this exception won’t ever happen,
        but because CloneNotSupportedException is a checked exception, you
        must catch it.
*/

package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_02_using_clone_to_create_a_shallow_copy;

public class Employee implements Cloneable {
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

    // Notice that this method doesn’t have to be aware of any of the fields declared in
    // the Employee class. This clone method, however, works only for classes whose
    // fields are all either primitive types or immutable objects such as strings.
    @Override
    protected Object clone() {
        Employee emp;
        try {
            emp = (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen because Employee is Cloneable
        }
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
