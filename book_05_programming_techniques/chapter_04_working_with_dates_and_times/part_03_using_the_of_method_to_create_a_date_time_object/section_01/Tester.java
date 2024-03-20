/*
A third way to create Date-Time objects is to use the static of method to create
a Date-Time object from its constituent parts. For example, you can create a
LocalDate object by supplying integers that represent the year, month, and day
like this:

    LocalDate date = LocalDate.of(2014, 12, 15);
    
Each of the Date-Time classes has one or more variations of the of method, as
spelled out in Table 4-2.

Class Method
LocalTime of(int hour, int minute)
of(int hour, int minute, int second)
of(int hour, int minute, int second, int nanoOfSecond)
LocalDate of(int year, int month, int dayOfMonth)
of(int year, Month month, int dayOfMonth)
LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
of(int year, int month, int dayOfMonth, int hour, int minute,
int second)
of(int year, int month, int dayOfMonth, int hour, int minute, int
second, int nanoOfSecond)
of(int year, Month month, int dayOfMonth, int hour, int minute)
of(int year, Month month, int dayOfMonth, int hour, int minute,
int second)
of(int year, Month month, int dayOfMonth, int hour, int minute,
int second, int nanoOfSecond)
of(LocalDate date, LocalTime time)
OffsetTime of(int hour, int minute, int second, int nanoOfSecond,
ZoneOffset offset)
of(LocalTime time, ZoneOffset offset)
OffsetDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int
second, int nanoOfSecond, ZoneOffset offset)
of(LocalDate date, LocalTime time, ZoneOffset offset)
of(LocalDateTime dateTime, ZoneOffset offset)
MonthDay of(int month, int dayOfMonth)
of(Month month, int dayOfMonth)
YearMonth of(int year, int month)
of(int year, Month month)
Year of(int year)

Note that several of the methods in Table 4-2 use the additional types Month,
ZoneOffset, and ZoneId. These types are described in the following sections.
*/

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_03_using_the_of_method_to_create_a_date_time_object.section_01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class Tester {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, 12, 15); // 2014-12-15
        System.out.println(date.toString());

        LocalTime time = LocalTime.of(15, 45);
        System.out.println(time.toString()); // 15:45

        LocalDateTime dateTime = LocalDateTime.of(2014, 12, 15, 15, 45);
        System.out.println(dateTime.toString()); // 2014-12-15T15:45

        MonthDay monthDay = MonthDay.of(12, 15);
        System.out.println(monthDay.toString()); // --12-15

        YearMonth yearMonth = YearMonth.of(2014, 12);
        System.out.println(yearMonth); // 2014-12

        Year year = Year.of(2014);
        System.out.println(year.toString()); // 2014    
    }
}
