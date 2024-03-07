package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_03_overriding_methods;

public class Chess extends Game {
    @Override
    public void play() {
    // protected void play() {
        System.out.println("Playing chess");
    }
}
