package book_03_object_oriented_programming.chapter_05_using_abstract_classes_and_interfaces.part_02_using_interfaces.section_01;
public class Hearts implements Playable, CardGame{
    @Override
    public void play() {
        // Implementation of the play() method
        System.out.println("Playing the game from the Hearts class.");
    }
    
    @Override
    public void shuffle() {
        // Implementation of the shuffle() method
    }
}
