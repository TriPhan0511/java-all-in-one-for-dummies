package book_03_object_oriented_programming.chapter_05_using_abstract_classes_and_interfaces.part_01_using_abstract_classes;

public class App {
    public static void main(String[] args) {
        Ball ball = new BaseBall();
        System.out.println(ball.hit(10));
    }
}
