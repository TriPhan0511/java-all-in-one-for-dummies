/*
NOTE:
You already know about the this keyword: It provides a way to refer to the current
object instance. It’s often used to distinguish between a local variable or a parameter
and a class field with the same name. For example:

    public class Ball {
        private int velocity;

        public void setVelocity(int velocity) {
            this.velocity = velocity;
        }
    }
 */

package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_05_using_this_and_super_in_your_subclasses;

public class Ball {
    private int velocity;

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void hit() {
        System.out.println("You hit me a mile!");
    }
}
