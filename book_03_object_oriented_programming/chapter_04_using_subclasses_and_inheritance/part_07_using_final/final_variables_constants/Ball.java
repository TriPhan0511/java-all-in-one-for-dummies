/*
NOTE:
A final variable is a variable whose value you can’t change after it’s been initialized.
To declare a final variable, you add the final keyword to the variable declaration,
like this:

    private final double BALL_RADIUS = 4.5;

A variable that is both final and static is called a constant. Constants are often used
for values that are universally the same, such as the number of days in June or
the atomic weight of iridium. To create a constant, add static final (not final
static) to the declaration, as follows:

    private static final double BALL_RADIUS = 4.5;

Although it isn’t required, using all capital letters for static final variable
names is common. When you do so, you can easily spot the use of constants in
your programs.
 */
package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_07_using_final.final_variables_constants;

public class Ball {
    private static final double BALL_RADIUS = 4.5;
    // private final double BALL_RADIUS = 4.5;
}
