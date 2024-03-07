package book_03_object_oriented_programming.chapter_02_making_your_own_classes;

// You could create a class that implements this behavior using a traditional Java
// class as follows.
// Here, the Person1 class has two private fields named firstName and lastName, a
// constructor that accepts String arguments to initialize the private fields, and getter
// methods that retrieve the first and last name values. When a Person object has
// been created from this class, the class provides no mechanism for changing the
// first or last name values.
public final class Person1 {
    private final String lastName;
    private final String firstName;
    
    public Person1(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
