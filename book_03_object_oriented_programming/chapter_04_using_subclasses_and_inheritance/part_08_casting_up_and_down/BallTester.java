package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_08_casting_up_and_down;

public class BallTester {
    public static void hit(Ball ball) {
        System.out.println("You hit the ball.");
    }

    public static void toss(BaseBall baseBall) {
        System.out.println("You toss the ball.");
    }

    public static void main(String[] args) {
        // BaseBall b1 = new BaseBall();
        // hit(b1);
        // Ball b2 = b1;
        // hit(b2);

        // BaseBall b1 = new Ball(); // error: incompatible types: Ball cannot be converted to BaseBall

        // Ball b = new BaseBall();
        // // toss(b); // error: incompatible types: Ball cannot be converted to BaseBall
        // toss((BaseBall) b); // Explicit cast the the b varibale to a BaseBall object

        // Ball b = new SoftBall();
        // toss((BaseBall) b); // Error: Exception in thread "main" java.lang.ClassCastException

        // What if you want to call a method that’s defined by a subclass from an object
        // that’s referenced by a variable of the superclass? Suppose that the SoftBall class
        // has a method named riseBall that isn’t defined by the Ball class. How can you
        // call it from a Ball variable? One way to do that is to create a variable of the subclass
        // and then use an assignment statement to cast the object:

        // Ball b = new SoftBall();
        // SoftBall s = (SoftBall) b; // cast the Ball to a SoftBall
        // s.riseBall();

        // But there’s a better way: Java lets you cast the Ball object to a SoftBall and call
        // the riseBall method in the same statement. All you need is an extra set of parentheses,
        // like this:
        
        Ball b = new SoftBall();
        ((SoftBall) b).riseBall(); // cast the Ball to a SoftBall and call the riseBall method
    }
}
