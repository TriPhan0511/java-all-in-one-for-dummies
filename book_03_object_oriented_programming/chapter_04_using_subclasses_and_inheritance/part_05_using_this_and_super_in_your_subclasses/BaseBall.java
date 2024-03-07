/*
NOTE:
If you need to refer to a field or method that belongs to a base class? To
do that, you use the super keyword. It works similarly to `this` but refers to the
instance of the base class rather than the instance of the current class.

Consider these two classes:

    public class Ball {
        public void hit() {
            System.out.println("You hit me!");
        }
    }

    public class BaseBall extends Ball {
        @Override
        public void hit() {
            System.out.println("You tore the cover off!");
            super.hit();
        }
    }

Here the hit method in the BaseBall class calls the hit method of its base class
object. Thus, if you call the hit method of a BaseBall object, the following two
lines are displayed on the console:

    You tore the cover off!
    You hit me!

You can also use the super keyword in the constructor of a subclass to explicitly
call a constructor of the superclass. For more information, see the next section.    
*/

package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_05_using_this_and_super_in_your_subclasses;

public class BaseBall extends Ball {
    @Override
    public void hit() {
        System.out.println("You tore the cover off!");
        super.hit();
    }
}
