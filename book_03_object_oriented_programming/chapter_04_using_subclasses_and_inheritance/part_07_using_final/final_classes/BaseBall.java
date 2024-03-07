/*
NOTE:
final class is a class that can’t be used as a base class. To declare a class as final,
just add the final keyword to the class declaration:

    public final class BaseBall {
        // members for the BaseBall class go here...
    }

Then no one can use the BaseBall class as the base class for another class.

When you declare a class to be final, all of its methods are considered to be final
as well. That makes sense when you think about it. Because you can’t use a final
class as the base class for another class, no class can possibly be in a position to
override any of the methods in the final class. Thus all the methods of a final class
are final methods.
 */
package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_07_using_final.final_classes;

public final class BaseBall {
    // members for the BaseBall class go here...
}
