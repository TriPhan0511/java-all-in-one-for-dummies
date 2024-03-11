package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_05_the_class_class;

public class HourlyEmployee extends Employee {
    private double rate;

    public HourlyEmployee(String firstName, String lastName, double rate) {
        super(firstName, lastName);
        this.rate = rate;
    }
}
