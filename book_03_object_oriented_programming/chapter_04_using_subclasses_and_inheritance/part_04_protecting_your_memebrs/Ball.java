/*
NOTE:
You’re already familiar with the public and private keywords, which are used
to indicate whether class members are visible outside the class or not. When you
inherit a class, all the public members of the superclass are available to the subclass,
but the private members aren’t.

Java provides a third visibility option that’s useful when you create subclasses:
protected. A member with protected visibility is available to subclasses and
classes in the same package, but not to classes outside of the package. Consider
this example:

    public class Ball {
        private double weight;

        protected double getWeight() {
            return weight;
        }

        protected void setWeight(double weight) {
            this.weight = weight;
        }
    }

    public class BaseBall extends Ball{
        public BaseBall() {
            setWeight(5.125);
        }
    }

Here, the getWeight and setWeight methods are declared with protected access,
which means that they’re visible in the subclass BaseBall. These methods aren’t
visible to classes that don’t extend Ball, however.    
*/

package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_04_protecting_your_memebrs;

public class Ball {
    private double weight;

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
}
