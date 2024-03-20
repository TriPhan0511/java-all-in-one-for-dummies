/*
Using the ZoneOffset class

The of method OffsetTime and OffsetDateTime classes use an additional class
named ZoneOffset to indicate the offset from UTC. You can create a ZoneOffset
by using any of the following methods of the ZoneOffset class:

    of(String offsetId)
    ofHours(int hours)
    ofHoursMinutes(int hours, int minutes)
    ofHoursMinutesSeconds(int hours, int minutes, int seconds)
    ofTotalSeconds(int totalSeconds)

For example, you can create a ZoneOffset of -8 hours like this:

    ZoneOffset z = ZoneOffset.ofHours(-8);

Alternatively, you could specify the offset as a string, as in this example:

    ZoneOffset z = ZoneOffset.of("-08:00");

Note that when you use a string offset, you must provide two digits for the hours,
minutes, and (optionally) seconds.

Note that when you use a string offset, you must provide two digits for the hours,
minutes, and (optionally) seconds.

    OffsetTime time = OffsetTime.of(15, 45, 0, 0, z);

Or if you prefer, you can create the ZoneOffset directly in the call to the Offset-
Time’s of method:

    OffsetTime time = OffsetTime.of(15, 45, 0, 0, 
        ZoneOffset.of("-08:00"));
*/

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_03_using_the_of_method_to_create_a_date_time_object.section_04_using_the_zoneoffset_class;

import java.time.OffsetTime;
import java.time.ZoneOffset;

public class Tester {
    public static void main(String[] args) {
        // ZoneOffset z = ZoneOffset.ofHours(-8);
        ZoneOffset z = ZoneOffset.of("-08:00");
        OffsetTime time = OffsetTime.of(15, 45, 0, 0, 
            ZoneOffset.of("-08:00"));
        // OffsetTime time = OffsetTime.of(15, 45, 0, 0, z);
        System.out.println(time); // 15:45-08:00
    }
}
