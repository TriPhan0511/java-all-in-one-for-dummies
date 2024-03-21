/*
Now that you’ve seen the techniques for working with Date-Time objects, it’s
time to look at a complete programming example. Listing 4-1 presents a program
that prompts the user to enter his or her birthday and then prints a variety of
interesting information deduced from the date, including:

    »»The day of the week on which the user was born
    »»The user’s age in years
    »»The date of the user’s next birthday
    »»The number of days until the user’s next birthday
    »»The user’s half-birthday (six months from his or her birthday)

Here’s an example of the BirthdayFun application in action:

    Today is October 9, 2013.

    Please enter your birthdate (yyyy-mm-dd): 1959-12-15

    December 15, 1959 was a very good day!
    You were born on a TUESDAY.
    You are 53 years young.
    Your next birthday is December 15, 2013.
    That's just 67 days from now!
    Your half-birthday is June 15.

    Another? (Y or N) N
*/

package book_05_programming_techniques.chapter_04_working_with_dates_and_times.part_08_birthday_calculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayFun {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean again = true;
        while (again) {
            System.out.println(getInfo());
            again = keepGoing("Another?");
        }
    }

    private static String getInfo() {
        StringBuilder builder = new StringBuilder();
        DateTimeFormatter fullFormat = 
            DateTimeFormatter.ofPattern("MMMM d, YYYY");
        DateTimeFormatter monthDayFormat = 
            DateTimeFormatter.ofPattern("MMMM d");
        LocalDate today = LocalDate.now();
       System.out.println("Today is " 
            + today.format(fullFormat) + ".\n");
        System.out.print("Please enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();
        // String input = "1984-11-05"; // For testing
        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(input);
            LocalDate nextBirthday = LocalDate.of(
                today.getYear(), birthDate.getMonthValue(), birthDate.getDayOfMonth());
            int num = birthDate.getMonthValue() - today.getMonthValue();
            if ((num < 0) 
            || ((num == 0) && (birthDate.getDayOfMonth() <= today.getDayOfMonth()))) {
                nextBirthday = nextBirthday.plusYears(1);
            }
            builder.append(birthDate.format(fullFormat) 
                + " was a very good day!\n");
            builder.append("You were born on a " 
                + birthDate.getDayOfWeek() + ".\n");
            builder.append("You are " 
                + birthDate.until(today, ChronoUnit.YEARS) 
                + " years young.\n");
            builder.append("Your next birthday is " 
                + nextBirthday.format(fullFormat) + ".\n");
            builder.append("That's just " 
                + today.until(nextBirthday, ChronoUnit.DAYS) 
                + " days from now!\n");
            builder.append("Your half-birthday is " 
                + birthDate.plusMonths(6)
                .format(monthDayFormat) + ".\n");
        } catch (DateTimeParseException e) {
            System.out.println("Sorry, that is not a valid date");
        }
        return builder.toString();
    }

    private static boolean keepGoing(String prompt) {
        while (true) {
            System.out.print(prompt + " (Y or N) ");
            String answer = scanner.next();
            scanner.nextLine(); // Consume left-over newline
            if (answer.equalsIgnoreCase("y")) {
                return true;
            }
            if (answer.equalsIgnoreCase("n")) {
                return false;
            }
        }
    }
}
