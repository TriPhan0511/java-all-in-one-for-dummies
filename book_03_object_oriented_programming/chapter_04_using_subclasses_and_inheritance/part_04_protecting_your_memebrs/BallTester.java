package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_04_protecting_your_memebrs;

public class BallTester {
    public static void main(String[] args) {
        Ball baseBall = new BaseBall();
        // BaseBall baseBall = new BaseBall();
        System.out.println("The weight of the base ball is: " + baseBall.getWeight());
        // Output: 
        // The weight of the base ball is: 5.125
    }
}
