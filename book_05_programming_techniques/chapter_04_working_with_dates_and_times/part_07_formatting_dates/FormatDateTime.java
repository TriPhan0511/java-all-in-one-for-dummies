package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_07_formatting_dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        printDate(now, "YYYY-MM-dd"); // 2024-03-20
        printDate(now, "MM-dd-YYYY"); // 03-20-2024
        printDate(now, "dd MMM YYYY"); // 20 Mar 2024
        printDate(now, "MMMM d, YYYY"); // March 20, 2024
        printDate(now, "HH:mm"); // 17:25
        printDate(now, "h:mm a"); // 5:25 PM

        // Output:
        // YYYY-MM-dd     2024-03-20
        // MM-dd-YYYY     03-20-2024
        // dd MMM YYYY    20 Mar 2024
        // MMMM d, YYYY   March 20, 2024
        // HH:mm          17:33
        // h:mm a         5:33 PM
    }

    private static void printDate(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = 
            DateTimeFormatter.ofPattern(pattern);
        pattern = (pattern + "          ").substring(0, 14);
        System.out.println(pattern + " " + dateTime.format(formatter));
    }
    
}
