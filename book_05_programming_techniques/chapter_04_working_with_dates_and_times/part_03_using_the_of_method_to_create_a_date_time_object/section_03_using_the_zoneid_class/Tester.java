/*
Using the ZoneId class

To create a ZonedDateTime, you must first create a time zone object by using the
ZoneId class. To create a time zone, you must know the standard name of the time
zone you want to create. Unfortunately, there are more than 500 distinct zone IDs,
and they periodically change. So listing them here would be impractical, but you
can easily list them all by using this handy bit of code:

    for (String id : ZoneId.getAvailableZoneIds())
        System.out.println(id);

This for loop will write the names of each ZoneId to the console.

Once you know the name of the ZoneId you want to use, you can create it using
ZoneId.of, then use it to create a ZonedDateTime as in this example:

    ZonedDateTime zonedDateTime = 
        ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0, 
        ZoneId.of(("Asia/Saigon")));
 */

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_03_using_the_of_method_to_create_a_date_time_object.section_03_using_the_zoneid_class;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Tester {
    public static void main(String[] args) {
        // ZoneId zone = ZoneId.of(("Asia/Saigon"));
        ZonedDateTime zonedDateTime = 
            ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0, 
            ZoneId.of(("Asia/Saigon")));
        System.out.println(zonedDateTime); // 2014-12-15T00:00+07:00[Asia/Saigon]
    }

    private static void listAsiaZoneIds() {
        // for (String id : ZoneId.getAvailableZoneIds()) {
        //     // System.out.println(id);
        //     if (id.startsWith("Asia")) {
        //         System.out.println(id);
        //     }
        // }

        ZoneId.getAvailableZoneIds().stream()
            .filter(e -> e.toLowerCase().startsWith("asia"))
            .forEach(e -> System.out.println(e));
    }
}
