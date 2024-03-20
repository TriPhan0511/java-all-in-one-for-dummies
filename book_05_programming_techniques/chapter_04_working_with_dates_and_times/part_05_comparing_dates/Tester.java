/*
Comparing Dates

You can’t compare Date-Time objects using Java’s standard comparison operators.
Consider the following example:

    if (LocalDate.now() == LocalDate.now()) {
        System.out.println("Equal");
    } else {
        System.out.println("Not equal");
    }
    // Not Equal    

If you run this code, There must be a disturbance in the space-time continuum!
will be printed. That’s because when used on objects, the equality operator
tests whether two expressions refer to the same object, not to objects with
the same value.

To test the equality of two dates, you must use the isEqual method, as in this
example:

    if (LocalDate.now().isEqual(LocalDate.now())) {
        System.out.println("Equal");
    } else {
        System.out.println("Not equal");
    }
    // Equal

Similarly, you must use either the isBefore or the isAfter method to determine
whether one date falls before or after another date.

    LocalDate birthDate = LocalDate.parse("1984-11-05");
    if (LocalDate.now().isAfter(birthDate)) {
        System.out.println("Current date is after birth date.");
    } else {
        System.out.println("Current date is before birth date.");
    }
    // Current date is after birth date.

    if (LocalDate.now().isBefore(birthDate)) {
        System.out.println("Current date is before birth date.");
    } else {
        System.out.println("Current date is after birth date.");
    }
    // Current date is after birth date.

Note that you can use built-in operators with methods that return integer results.
Thus, the following code will work just as you would expect:

    if (LocalDate.now().getDayOfMonth() < 25) {
        System.out.println("It is not yet the 25th.");
    }
    // It is not yet the 25th.

Because the getDayOfMonth method returns an integer, you can use the < operator
to determine if the 15th of the month has yet arrived.    
*/

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_05_comparing_dates;

import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        // if (LocalDate.now() == LocalDate.now()) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not equal");
        // }
        // // Not Equal

        if (LocalDate.now().isEqual(LocalDate.now())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        // Equal

        LocalDate birthDate = LocalDate.parse("1984-11-05");
        if (LocalDate.now().isAfter(birthDate)) {
            System.out.println("Current date is after birth date.");
        } else {
            System.out.println("Current date is before birth date.");
        }
        // Current date is after birth date.

        if (LocalDate.now().isBefore(birthDate)) {
            System.out.println("Current date is before birth date.");
        } else {
            System.out.println("Current date is after birth date.");
        }
        // Current date is after birth date.

        if (LocalDate.now().getDayOfMonth() < 25) {
            System.out.println("It is not yet the 25th.");
        }
        // It is not yet the 25th.
    }
}
