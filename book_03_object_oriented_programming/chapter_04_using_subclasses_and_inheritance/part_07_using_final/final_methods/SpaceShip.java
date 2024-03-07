/*
NOTE:
A final method is a method that can’t be overridden by a subclass. To create a
final method, you simply add the keyword final to the method declaration. For
example:

    public class SpaceShip {
        private int velocity;

        public final int getVelocity() {
            return this.velocity;
        }
    }

Here the method getVelocity is declared as final. Thus, any class that uses the
SpaceShip class as a base class can’t override the getVelocity method. If it tries,
the compiler issues the error message ("Overridden method is final").

Here are some additional details about final methods:

    * Final methods execute more efficiently than nonfinal methods because the
    compiler knows at compile time that a call to a final method won’t be overridden
    by some other method. The performance gain isn’t huge, but for applications
    in which performance is crucial, it can be noticeable.

    * Private methods are automatically considered to be final because you can’t
    override a method you can’t see.
*/

package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_07_using_final.final_methods;

public class SpaceShip {
    private int velocity;

    public final int getVelocity() {
        return this.velocity;
    }
}
