/*
Using the Month enumeration

Month is an enumeration that represents the twelve months of the year, as
follows:

    Month.JANUARY Month.MAY Month.SEPTEMBER
    Month.FEBRUARY Month.JUNE Month.OCTOBER
    Month.MARCH Month.JULY Month.NOVEMBER
    Month.APRIL Month.AUGUST Month.DECEMBER

Thus you can create a date like this:

    LocalDate date = LocalDate.of(2014, Month.DECEMBER, 15);
    
Interestingly, the Month enumeration has some interesting methods which you
might find occasionally useful. For example, you can print the number of days in
December like this:

    System.out.println("December has "
        + Month.DECEMBER.length(false) + " days"); // December has 31 days
        
The boolean argument in the length method indicates whether the calculation
should be for a leap year. Consult the online documentation for other useful
methods of the Month enumeration.    
 */

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_03_using_the_of_method_to_create_a_date_time_object.section_02_using_the_month_enumeration;

import java.time.LocalDate;
import java.time.Month;

public class Tester {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.DECEMBER, 15);
        System.out.println(date); // 2014-12-15

        System.out.println("December has "
            + Month.DECEMBER.length(false) + " days"); // December has 31 days
        System.out.println("February in leaf year has "
            + Month.FEBRUARY.length(true) + " days"); // December has 31 days
        System.out.println("February not in leaf year has "
            + Month.FEBRUARY.length(false) + " days"); // February not in leaf year has 28 days
    }
}
