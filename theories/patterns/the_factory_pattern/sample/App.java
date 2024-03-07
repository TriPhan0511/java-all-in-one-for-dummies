package theories.patterns.the_factory_pattern.sample;

public class App {
    public static void print(Ball ball) {
        if (ball == null) {
            System.out.println("null");
        } else {
            System.out.println(ball.intro());
        }
    }

    public static void main(String[] args) {
        String userChoice = "BaseBall";
        Ball ball = BallFactory.getBall(userChoice);
        Ball ball1 = BallFactory.getBall("BaseBall");
        Ball ball2 = BallFactory.getBall("SoftBall");
        Ball ball3 = BallFactory.getBall("");

        print(ball1); // BaseBall
        print(ball2); // SoftBall
        print(ball3); // null
    }
}
