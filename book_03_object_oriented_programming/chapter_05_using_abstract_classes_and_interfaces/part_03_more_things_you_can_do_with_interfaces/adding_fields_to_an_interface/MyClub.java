package book_03_object_oriented_programming.chapter_05_using_abstract_classes_and_interfaces.part_03_more_things_you_can_do_with_interfaces.adding_fields_to_an_interface;

public class MyClub implements GolfClub {
    public void print() {
        System.out.println("The driver is " + DRIVER + " and the mashie is " + MASHIE);
    }
}
