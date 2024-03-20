/**
Calculating with Dates

Just as you cannot use Java’s built-in comparison operators with dates, you also
may not use built-in mathematical operators. Instead, you can perform addition
and subtraction on dates using the various plus and minus methods, and you can
determine the difference between two dates by using the until method.

An important fact to consider when doing date and time calculations is that Date-
Time objects are immutable. That means that once you create a Date-Time object,
you cannot change its value. When you perform a calculation on a Date-Time
object, the result is a new Date-Time object with a new value.

The plus and minus methods let you add various date and time units to a Date-
Time object. Table 4-3 lists four variants of each for the LocalDate class, allowing
you to add or subtract years, months, weeks, and days to a LocalDate object. The
following code prints the current date, tomorrow’s date, and the date one week,
one month, and one year from now:

    System.out.println(LocalDate.now());
    System.out.println(LocalDate.now().plusDays(1));
    System.out.println(LocalDate.now().plusWeeks(1));
    System.out.println(LocalDate.now().plusYears(1));

To determine the difference between two dates, use the until method. It calculates
the difference between a date and the date passed as the first parameter, measured
in the units indicated by the second parameter. For example, the following
code determines the number of days between May 16, 2014 and December 15, 2014:

    LocalDate date1 = LocalDate.parse("2014-05-16");
    LocalDate date2 = LocalDate.parse("2014-12-15");
    System.out.println(date1.until(date2, ChronoUnit.DAYS)); // 213

Some date calculations can be a bit more complex. For example, consider a business
that prepares invoices on the 15th of each month. The following snippet of
code displays the number of days from the current date until the next invoicing
date:

    LocalDate today = LocalDate.now();
    LocalDate invDate = LocalDate.of(
        today.getYear(), today.getMonthValue(), 15);
    if (today.getDayOfMonth() > 15) {
        invDate = invDate.plusMonths(1);
    long daysToInvoice = today.until(invDate, ChronoUnit.DAYS);
    System.out.println(daysToInvoice + " until next invoice date.");

This example works by first getting the current date, then creating a new Local-
Date object that represents the 15th of the current month. Then, if the current day
of the month is greater than 15, it adds one month to the invoicing date. In other
words, if it is the 16th or later, invoicing occurs on the 15th of the following month,
not of this month. Then it uses the until method to determine the number of days
between the current date and the next invoicing date.

ChronoUnit is an enumeration that defines the various units of time that can be
used in date and time calculations. The possible values are:CENTURIES
    DAYS
    DECADES
    ERAS
    FOREVER
    HALF-DAYS
    HOURS
    MICROS
    MILLENNIA
    MILLIS
    MINUTES
    MONTHS
    NANOS
    SECONDS
    WEEKS
    YEARS

Most of these are self-explanatory, but two of them are a bit peculiar:

        ERA indicates whether the date refers to the Common Era (CE, also known as
        AD) or Before Era (BCE, also known as BC).

        FOREVER represents the largest value that can be represented as a duration.
        Sadly, Java won’t let you live forever. The following code throws an exception:

            LocalDate birthday = LocalDate.parse("1959-05-16");
            birthday = birthday.plus(1,ChronoUnit.FOREVER);

Note that ChronoUnit is in the java.time.temporal package, so be sure to include
the following statement at the top of any program that uses ChronoUnit:

        import java.time.temporal.*;
*/

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_06_calculating_with_dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tester {
    public static void main(String[] args) {
        // The plus and minus methods let you add various date and time units to a Date-
        // Time object. Table 4-3 lists four variants of each for the LocalDate class, allowing
        // you to add or subtract years, months, weeks, and days to a LocalDate object. The
        // following code prints the current date, tomorrow’s date, and the date one week,
        // one month, and one year from now:
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().plusDays(1));
        System.out.println(LocalDate.now().plusWeeks(1));
        System.out.println(LocalDate.now().plusYears(1));

        // To determine the difference between two dates, use the until method. It calculates
        // the difference between a date and the date passed as the first parameter, measured
        // in the units indicated by the second parameter. For example, the following
        // code determines the number of days between May 16, 2014 and December 15, 2014:
        LocalDate date1 = LocalDate.parse("2014-05-16");
        LocalDate date2 = LocalDate.parse("2014-12-15");
        System.out.println(date1.until(date2, ChronoUnit.DAYS)); // 213

        // Some date calculations can be a bit more complex. For example, consider a business
        // that prepares invoices on the 15th of each month. The following snippet of
        // code displays the number of days from the current date until the next invoicing
        // date:
        LocalDate today = LocalDate.now();
        LocalDate invDate = LocalDate.of(
            today.getYear(), today.getMonthValue(), 15);
        if (today.getDayOfMonth() > 15) {
            invDate = invDate.plusMonths(1);
        long daysToInvoice = today.until(invDate, ChronoUnit.DAYS);
        System.out.println(daysToInvoice + " until next invoice date.");

        // This example works by first getting the current date, then creating a new Local-
        // Date object that represents the 15th of the current month. Then, if the current day
        // of the month is greater than 15, it adds one month to the invoicing date. In other
        // words, if it is the 16th or later, invoicing occurs on the 15th of the following month,
        // not of this month. Then it uses the until method to determine the number of days
        // between the current date and the next invoicing date.
        }
    }
}
