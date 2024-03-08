package book_03_object_oriented_programming.chapter_05_using_abstract_classes_and_interfaces.part_03_more_things_you_can_do_with_interfaces.extending_interfaces;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.throwBall();
        game.catchBall();
        game.kickBall();
        game.dropBall();
    }
    // Output:
    // Throwing the ball
    // Catching the ball
    // Kicking the ball
    // Dropping the ball
}
