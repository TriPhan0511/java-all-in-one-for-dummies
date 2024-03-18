/*
The first order of business when developing an application that must work with
dates or times (or both) is picking the Date-Time class to represent your date and
time values. The java.time package defines ten distinct classes used to represent
different types of times and dates, as described in Table 4-1.

Each of these classes has many different methods that let you create date and time
objects, perform calculations on them, compare them, and convert them to strings
that can be displayed and read by humans. You can find complete documentation
of the methods for each of these classes online at https://docs.oracle.com/en/
java/javase/14/docs/api/index.html.

TABLE 4-1 Ten Date-Time Classes in java.time
Class What It Represents
LocalTime A time (hours, minutes, and seconds to nanosecond precision) without an associated
time zone.
LocalDate A date (year, month, and day) without an associated time zone.
LocalDateTime A date and time without an associated time zone.
OffsetTime A time and an offset from UTC (Coordinated Universal Time, also known as Greenwich
Mean Time), such as 12:30:00-8.00, which means the time is 12:30 with an offset of
-8 hours from UTC.
OffsetDateTime A date and time with an offset value from UTC.
ZonedDateTime A date and time with an associated time zone, such as America/Los_Angeles.
MonthDay A month and day without an associated year. You can use a MonthDay object to
represent a date such as a birthday, anniversary, or holiday.
YearMonth A year and month, such as December, 2015. No day, time, or time zone values are
associated with the year and month.
Year A year, such as 2038. No month, day, time, or time zone values are associated
with the year.
Instant A single point of time, represented internally as the number of nanoseconds that have
elapsed since midnight, January 1, 1970. The value assumes a UTC/GMT time offset of 0.
*/

/*
All Date-Time classes have a static now method, which creates an object representing
the current date and/or time. For example, to get the current date, you
would use code similar to this:

    LocalDate date = LocalDate.now();

To get the current date and time with time zone, use this code:

    ZonedDateTime datetime = ZonedDateTime.now();

The following program displays the current time using all ten classes, creating an
object of each class using now() and printing it with toString():
*/

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_01_using_the_now_method_to_create_a_date_time_object;

import java.time.*;

public class TimeTester {
    public static void main(String[] args) {
        System.out.println("\nLocalTime: "
            + LocalTime.now().toString()); // LocalTime: 15:04:39.275158500
        System.out.println("\nLocalDate: "
            + LocalDate.now().toString());  // LocalDate: 2024-03-18
        System.out.println("\nLocalDateTime: "
            + LocalDateTime.now().toString()); // LocalDateTime: 2024-03-18T15:04:39.279172500
        System.out.println("\nZonedDateTime: "
            + ZonedDateTime.now().toString()); // ZonedDateTime: 2024-03-18T15:04:39.282183100+07:00[Asia/Saigon]
        System.out.println("\nOffsetTime: "
            + OffsetTime.now().toString()); // OffsetTime: 15:04:39.285193100+07:00
        System.out.println("\nOffsetDateTime: "
            + OffsetDateTime.now().toString()); // OffsetDateTime: 2024-03-18T15:04:39.286196400+07:00
        System.out.println("\nMonthDay: "
            + MonthDay.now().toString()); // MonthDay: --03-18
        System.out.println("\nYearMonth: "
            + YearMonth.now().toString()); // YearMonth: 2024-03
        System.out.println("\nYear: "
            + Year.now().toString()); // Year: 2024
        System.out.println("\nInstant: "
            + Instant.now().toString()); // Instant: 2024-03-18T08:04:39.299239200Z

        // Output:
        // LocalTime: 15:04:39.275158500

        // LocalDate: 2024-03-18

        // LocalDateTime: 2024-03-18T15:04:39.279172500

        // ZonedDateTime: 2024-03-18T15:04:39.282183100+07:00[Asia/Saigon]

        // OffsetTime: 15:04:39.285193100+07:00

        // OffsetDateTime: 2024-03-18T15:04:39.286196400+07:00

        // MonthDay: --03-18

        // YearMonth: 2024-03

        // Year: 2024

        // Instant: 2024-03-18T08:04:39.299239200Z
    }
}
