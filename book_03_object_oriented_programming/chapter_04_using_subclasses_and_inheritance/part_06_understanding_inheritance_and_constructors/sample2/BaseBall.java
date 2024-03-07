/*
NOTE:
If you want, you can explicitly call a base class constructor from a subclass by
using the super keyword. Because Java automatically calls the default constructor
for you, the only reason to do this is to call a constructor of the base class that
uses a parameter. Here’s a version of the Ball and BaseBall classes in which the
BaseBall constructor calls a Ball constructor that uses a parameter:

    public class Ball {
        private double weight;

        public Ball(double weight) {
            this.weight = weight;
        }
    }

    public class BaseBall extends Ball {
        public BaseBall() {
            super(5.125);
        }
    }

Here the BaseBall constructor calls the Ball constructor to supply a default
weight for the ball.    
 */
package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_06_understanding_inheritance_and_constructors.sample2;

public class BaseBall extends Ball {
    public BaseBall() {
        super(5.125);
    }
}
