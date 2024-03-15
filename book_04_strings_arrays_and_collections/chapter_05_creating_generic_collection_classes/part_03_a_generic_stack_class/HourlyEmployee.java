package book_04_strings_arrays_and_collections.chapter_05_creating_generic_collection_classes.part_03_a_generic_stack_class;

public class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
