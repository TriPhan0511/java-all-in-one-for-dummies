/*
Another way to create a Date-Time object is to use the static parse method,
which creates a Date-Time object from a string that represents a specific date or
time. For example, the following code creates a LocalDate object representing
December 15, 2014:

    LocalDate date = LocalDate.parse("2014-12-15");

To create a LocalDateTime object that represents a specific time on a specific
date, use the parse method. Here’s an example that sets the time to 3:45 p.m. on
December 15, 2014:

    LocalDateTime dateTime = LocalDateTime.parse("2014-12-15T15:45");

Note that the letter T separates the date from the time, and the time is expressed
in 24-hour clock format. If you need to be more precise, you can also specify
seconds, as in this example:

    LocalDateTime dateTime2 = LocalDateTime.parse("2014-12-15T15:45:13.5");

Here the time is set to 13.5 seconds after 2:45 p.m.

If the string is not in the correct format, the parse method throws a DateTime
ParseException. Whenever you use the parse method, you should enclose it in a
try block and catch this exception, as in this example:

    try {
        dateTime3 = LocalDateTime.parse("2014-12-15T03:45"); // OK
        // dateTime3 = LocalDateTime.parse("2014-12-15"); // Error since the string has not time
        // dateTime3 = LocalDateTime.parse("2014-15-15"); // Error
    } catch (DateTimeException e) {
        System.out.println(e.toString());
    }

The parse method is especially useful for converting user input to a Date-Time
object. For example, you might use it along with the Scanner class to read a date
from the console, or you can use parse in a Swing application to read a date from
a text box. When you do, you should prompt the user with the expected date format
and catch DateTimeParseException in case the user enters the date in the
wrong format.
*/

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_02_using_the_parse_method_to_create_a_date_time_object;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tester {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2014-12-15");
        // System.out.println(date.toString()); // 2014-12-15

        LocalDateTime dateTime = LocalDateTime.parse("2014-12-15T15:45");
        // System.out.println(dateTime); // 2014-12-15T15:45

        LocalDateTime dateTime2 = LocalDateTime.parse("2014-12-15T15:45:13.5");
        // System.out.println(dateTime2); // 2014-12-15T15:45:13.500
        
        LocalDateTime dateTime3;
        try {
            dateTime3 = LocalDateTime.parse("2014-12-15T03:45"); // OK
            // dateTime3 = LocalDateTime.parse("2014-12-15"); // Error since the string has not time
            // dateTime3 = LocalDateTime.parse("2014-15-15"); // Error
            System.out.println(dateTime3.toString());
        } catch (DateTimeException e) {
            System.out.println(e.toString());
        }
    }
}
