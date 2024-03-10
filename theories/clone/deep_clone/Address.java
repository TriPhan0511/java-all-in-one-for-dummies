package theories.clone.deep_clone;

public class Address implements Cloneable {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = "";
    }

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen because this class is Cloneable
        }        
    }

    @Override 
    public String toString() { 
        return "Address [" 
            + street + ", "
            + city + ", "
            + state + ", "
            + zip + "]"; 
    }
}
