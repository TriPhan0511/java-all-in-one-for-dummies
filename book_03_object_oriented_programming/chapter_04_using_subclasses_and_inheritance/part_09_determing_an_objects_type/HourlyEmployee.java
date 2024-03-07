package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_09_determing_an_objects_type;

import java.text.NumberFormat;

public class HourlyEmployee extends Employee {
    private double rate;

    public HourlyEmployee(double rate) {
        this.rate = rate;
    }

    public String getFormattedRate() {
        return NumberFormat.getPercentInstance().format(rate);
    }
}
