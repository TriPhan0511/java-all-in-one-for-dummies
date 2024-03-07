package theories.patterns.the_factory_pattern.sample2;

public class App {
    public static void main(String[] args) {
        Ball ball = BallFactory.getBall(BallType.BASEBALL);
        System.out.println(ball.intro()); // BaseBall
        ball = BallFactory.getBall(BallType.SOFTBALL);
        System.out.println(ball.intro()); // SoftBall
        // Output:
        // BaseBall
        // SoftBall
    }
}
