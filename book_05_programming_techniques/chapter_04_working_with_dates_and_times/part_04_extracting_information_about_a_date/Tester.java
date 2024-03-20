/*
Extracting Information About a Date

Several methods of the LocalDate class let you extract useful information about
a given date. For instance, the following example shows how you can extract the
current year, month, and day:

    LocalDate date = LocalDate.now();
    int year = date.getYear();
    int month = date.getMonthValue();
    int day = date.getDayOfMonth();
    System.out.println(year + "-" + month + "-" + day); // 2024-3-19

If you need to know how many days into the year a particular date is, you can use
this code:

    LocalDate date2 = LocalDate.parse("2016-04-09");
    System.out.println(date2.getDayOfYear()); // 100 as April 9 is the 100th day of 2016.

This example will print the number 100, as April 9 is the 100th day of 2016.

The getDayOfWeek method returns a value of type DayOfWeek, which is an enumeration
with the following values:

    SUNDAY THURSDAY
    MONDAY FRIDAY
    TUESDAY SATURDAY
    WEDNESDAY

Here’s an example of how you might use this method:

    LocalDate date2 = LocalDate.parse("2016-04-09");
    System.out.println(date2.getDayOfWeek()); // SATURDAY because in 2016, April 9 falls on a Saturday.

In this example, the string SATURDAY will be printed because in 2016, April 9 falls
on a Saturday.

The lengthOfMonth and lengthOfYear are useful if you want to know the number
of days in the month or year represented by a LocalDate. Both methods take into
account leap years.

    LocalDate date2 = LocalDate.parse("2016-04-09");
    System.out.println(date2.lengthOfMonth()); // 30
    System.out.println(date2.lengthOfYear()); // 366
*/

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_04_extracting_information_about_a_date;

import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println(year + "-" + month + "-" + day); // 2024-3-19


        LocalDate date2 = LocalDate.parse("2016-04-09");
        System.out.println(date2.getDayOfYear()); // 100 as April 9 is the 100th day of 2016.
        System.out.println(date2.getDayOfWeek()); // SATURDAY because in 2016, April 9 falls on a Saturday.
        System.out.println(date2.lengthOfMonth()); // 30
        System.out.println(date2.lengthOfYear()); // 366
        

        
    }
}
