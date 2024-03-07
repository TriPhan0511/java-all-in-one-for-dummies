package book_03_object_oriented_programming.chapter_02_making_your_own_classes;

public class ActorTest {
    public static void main(String[] args) {
        Actor actor = new Actor("Smith", "Will", true);
        System.out.println(actor);
        // System.out.println(actor.getFullName());
        // actor.display();
    }
}
