// using record (from Java 14)
// Java 14 introduces a new type of class called a record. A record is designed to simplify
// the task of creating classes that consist of nothing more than a collection of
// data fields that — and here’s the important part — cannot be changed after the
// record is created. (The Java term for an object that can’t be changed after it has
// been created is immutable.)

package book_03_object_oriented_programming.chapter_02_making_your_own_classes;

// public record Person2(String lastName, String firstName) {}

// Provide additional methods if you wish
public record Person2(String lastName, String firstName) {
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

/*
NOTE:
Here are the notable details you need to remember about creating records:

    1. You specify the data components of the record in parentheses following the
    record name. In this example, there are two data components, firstName
    and lastName.

    2. You specify the data components of the record in parentheses following the
    record name. In this example, there are two data components, firstName
    and lastName.

    3. Java automatically creates public getter methods for each of the data components,
    using the names you provide. (You can, if you wish, provide additional
    methods.)

    4. Java automatically creates a constructor that accepts the data component
    values as arguments, in the order in which you list them when you define the
    record. (You can, if you wish, create additional constructors or override the
    default constructor to provide features such as data validation.)
*/
