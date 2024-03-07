package book_03_object_oriented_programming.chapter_02_making_your_own_classes;

public class PersonTester {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Doe", "John");
        System.out.println(person1.getFirstName() + " " + person1.getLastName());

        Person2 person2 = new Person2("Doe", "John");
        System.out.println(person2.firstName() + " " + person2.lastName());
        System.out.println(person2.getFullName());
        System.out.println(person2);

        // Output:
        // John Doe
        // John Doe
        // John Doe
        // Person2[lastName=Doe, firstName=John]
    }
}
