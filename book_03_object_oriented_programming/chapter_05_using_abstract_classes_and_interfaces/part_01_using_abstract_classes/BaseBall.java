package book_03_object_oriented_programming.chapter_05_using_abstract_classes_and_interfaces.part_01_using_abstract_classes;

public class BaseBall extends Ball {
    @Override
    public int hit(int batSpeed) {
        return batSpeed * 2;
    }
}
