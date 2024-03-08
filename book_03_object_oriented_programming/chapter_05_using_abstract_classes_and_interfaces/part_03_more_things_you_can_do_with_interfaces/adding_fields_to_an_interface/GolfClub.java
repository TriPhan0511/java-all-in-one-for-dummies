/*
Adding fields to an interface

Besides abstract methods, an interface can include final fields — that is, constants.
Interface fields are used to provide constant values that are related to the
interface. For example:

    public interface GolfClub {
        int DRIVER = 1;
        int SPOON = 2;
        int NIBLICK = 3;
        int MASHIE = 4;
    

Here any class that implements the GolfClub interface has these four fields (that
is, constants) available.

Note that interface fields are automatically assumed to be static, final, and
public. You can include these keywords when you create interface constants, but
you don’t have to.
*/

package book_03_object_oriented_programming.chapter_05_using_abstract_classes_and_interfaces.part_03_more_things_you_can_do_with_interfaces.adding_fields_to_an_interface;

public interface GolfClub {
    int DRIVER = 1;
    int SPOON = 2;
    int NIBLICK = 3;
    int MASHIE = 4;
}
