package book_03_object_oriented_programming.chapter_05_using_abstract_classes_and_interfaces.part_03_more_things_you_can_do_with_interfaces.extending_interfaces;

public class Game implements Playable {
    @Override
    public void throwBall() {
        System.out.println("Throwing the ball");
    }
    
    @Override
    public void catchBall() {
        System.out.println("Catching the ball");        
    }

    @Override
    public void kickBall() {
        System.out.println("Kicking the ball");
    }

    @Override
    public void dropBall() {
        System.out.println("Dropping the ball");
    }
}
