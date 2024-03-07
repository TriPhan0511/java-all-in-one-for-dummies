
/*
NOTE:
Sometimes you want to create a class that can’t be instantiated at all. Such a class
consists entirely of static fields and methods. A good example in the Java API is
the Math class. Its methods provide utility-type functions that aren’t really associated
with a particular object. You may need to create similar classes yourself
occasionally. You might create a class with static methods for validating input
data, for example, or a database access class that has static methods to retrieve
data from a database. You don’t need to create instances of either of these classes.

You can use a simple trick to prevent anyone from instantiating a class. To create
a class instance, you have to have at least one public constructor. If you don’t provide
a constructor in your class, Java automatically inserts a default constructor,
which happens to be public.

All you have to do to prevent a class instance from being created, then, is provide
a single private constructor, like this:

    public final class Validation {
        private Validation() {} // prvent instances
        // static methods and fields go here
    }

Now, because the constructor is private, the class can’t be instantiated. And
because it’s final, the class can’t be extended, thwarting anyone who would try to
foil your plans by simply inheriting your class and then instantiating it.
*/

package book03objectorientedprogramming.chapter03workingwithstatics.preventing_instances;

public final class Validation {
    private Validation() {} // prvent instances
    // static methods and fields go here
}
