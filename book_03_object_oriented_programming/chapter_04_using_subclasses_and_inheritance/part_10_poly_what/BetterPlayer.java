package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_10_poly_what;

public class BetterPlayer extends Player {
    @Override
    public int move() {
        System.out.println("\nThe better player says:");
        System.out.println("I'm looking for a good move...");
        return findBestMove();
    }

    private int findBestMove() {
        int square = 0;
        // code to find the best move goes here
        return square;
    }
}
