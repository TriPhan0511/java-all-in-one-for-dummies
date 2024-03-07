package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_02_creating_subclasses;

public class BallTester {
    public static void main(String[] args) {
        // BouncingBall boucingBall = new BouncingBall(50, 50.5, "red");
        BouncingBall boucingBall = new BouncingBall(50, 50.5);
        System.out.println("Size: " + boucingBall.getSize());
        System.out.println("Weight: " + boucingBall.getWeight());
        boucingBall.bounce();
        System.out.println(boucingBall);
        boucingBall.throwBall();
        System.out.println("Color: " + boucingBall.getColor());
        boucingBall.setColor("blue");
        System.out.println("Color: " + boucingBall.getColor());
    }
}
