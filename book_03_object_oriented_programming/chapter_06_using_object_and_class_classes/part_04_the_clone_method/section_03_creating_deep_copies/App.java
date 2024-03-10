/*
CREATING DEEP COPIES
A deep copy is a clone in which any subobjects within the main object are also cloned or copied.
To accomplish this feat, the clone method override first calls super.clone() to
create a shallow copy of the object. Then it calls the clone method of each of the
subobjects contained by the main object to create clones of those objects. (For a
deep copy to work, of course, those objects must also support the clone methods
or contain code to copy their values.)
 */

package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_03_creating_deep_copies;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee(
            "Martinez", "Anthony");
        emp1.setSalary(40000);
        emp1.address = new Address(
            "1200 N. First Street",
            "Fresno", "CA", "93702");
        Employee emp2 = (Employee) emp1.clone();

        System.out.println("***** After cloning *****\n");
        printEmployee(emp1);
        printEmployee(emp2);

        emp2.setLastName("Smith");
        emp2.address = new Address(
            "2503 N. 6th Street",
            "Fresno", "CA", "93722");

        System.out.println("***** After changing *****\n");
        printEmployee(emp1);
        printEmployee(emp2);
    }

    public static void printEmployee(Employee emp) {
        System.out.println(emp.getFirstName() 
            + " " + emp.getLastName());
        System.out.println(emp.address.getAddress());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println();
    }
}
// Output:
// ***** After cloning *****

// Martinez Anthony
// 1200 N. First Street
// Fresno, CA 93702
// Salary: 40000.0

// Martinez Anthony
// 1200 N. First Street
// Fresno, CA 93702
// Salary: 40000.0

// ***** After changing *****

// Martinez Anthony
// 1200 N. First Street
// Fresno, CA 93702
// Salary: 40000.0

// Martinez Smith
// 2503 N. 6th Street
// Fresno, CA 93722
// Salary: 40000.0