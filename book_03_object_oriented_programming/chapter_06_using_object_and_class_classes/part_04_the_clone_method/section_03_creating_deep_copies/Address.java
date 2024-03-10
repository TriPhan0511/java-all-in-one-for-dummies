package book_03_object_oriented_programming.chapter_06_using_object_and_class_classes.part_04_the_clone_method.section_03_creating_deep_copies;

public class Address implements Cloneable {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    public Address(String street, String city, 
        String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    protected Object clone() {
        try {
            // Calls super.clone() to create a shallow copy of
            // the Address object.
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        } 
    }

    public String getAddress() {
        return street + "\n" 
        + city + ", " 
        + state + " " 
        + zipCode;
    }
}
