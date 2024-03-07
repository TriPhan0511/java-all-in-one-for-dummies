package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_10_poly_what;

public class Player {
    public int move() {
        System.out.println("\nThe basic player says:");
        System.out.println("I'll take the first open square!");
        return firstOpenSquare();
    }

    private int firstOpenSquare() {
        int square = 0;
        // code to find the first open square goes here
        return square;
    }
}
