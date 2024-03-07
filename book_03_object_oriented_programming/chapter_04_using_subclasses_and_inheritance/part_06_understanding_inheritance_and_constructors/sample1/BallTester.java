/*
NOTE:
When you create an instance of a subclass, Java automatically calls the default
constructor of the base class before it executes the subclass constructor. Consider
the following classes:

    public class Ball {
        public Ball() {
            System.out.println("Hello from the Ball class constructor");
        }
    }

    public class BaseBall extends Ball {
        public BaseBall() {
            System.out.println("Hello from the BaseBall class constructor");
        }
    }

If you create an instance of the BaseBall class, the following two lines are displayed
on the console:

    Hello from the Ball class constructor   
    Hello from the BaseBall class constructor
*/

package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_06_understanding_inheritance_and_constructors.sample1;

public class BallTester {
    public static void main(String[] args) {
        BaseBall baseBall = new BaseBall();
        // Output:
        // Hello from the Ball class constructor
        // Hello from the BaseBall class constructor
    }
}
