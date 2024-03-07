package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_03_overriding_methods;

public class GameTester {
    public static void main(String[] args) {
        Game game = new Chess();
        game.play();
    }
}
