package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_09_determing_an_objects_type;

public class Tester {
    public static Employee getEmployee(boolean isHourly) {
        if (isHourly) {
            return new HourlyEmployee(0.5);
        }
        return new SalariedEmployee(9.99);
    }

    public static String getInfo(Employee emp) {
        // To tell what type of object has been assigned to the emp variable, 
        // you can use the instanceof operator, which is designed specifically 
        // for this purpose.
        String msg;
        if (emp instanceof HourlyEmployee) {
            msg = "The employee's hourly rate is ";
            msg += ((HourlyEmployee)emp).getFormattedRate();
        } else {
            msg = "The employee's salary is ";
            msg += ((SalariedEmployee)emp).getFormattedSalary();
        }
        return msg;
    }

    public static void main(String[] args) {
        Employee emp = getEmployee(false);
        // Employee emp = getEmployee(true);
        System.out.println(getInfo(emp));
    }
}
