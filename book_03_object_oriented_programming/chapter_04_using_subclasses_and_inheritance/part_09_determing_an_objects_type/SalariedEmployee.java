package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_09_determing_an_objects_type;

import java.text.NumberFormat;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public String getFormattedSalary() {
        return NumberFormat.getCurrencyInstance().format(salary);
    }
}
