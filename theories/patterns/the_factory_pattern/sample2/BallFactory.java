package theories.patterns.the_factory_pattern.sample2;

public class BallFactory {
    public static Ball getBall(BallType ballType) {
        switch (ballType) {
            case BASEBALL:
                return new BaseBall();
            case SOFTBALL:
                return new SoftBall();
            default:
                return null;
        }
    }
}
