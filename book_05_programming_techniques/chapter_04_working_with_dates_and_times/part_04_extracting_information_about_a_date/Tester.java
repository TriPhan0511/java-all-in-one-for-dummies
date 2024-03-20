package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_04_extracting_information_about_a_date;

import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println(year + "-" + month + "-" + day); // 2024-3-19

        Mon date.getMonth()

    }
}
