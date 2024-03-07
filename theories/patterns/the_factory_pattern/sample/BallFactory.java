package theories.patterns.the_factory_pattern.sample;

public class BallFactory {
    public static Ball getBall(String ballType) {
        if (ballType.equalsIgnoreCase("BaseBall")) {
            return new BaseBall();
        } 
        if (ballType.equalsIgnoreCase("SoftBall")) {
            return new SoftBall();
        }
        return null;
    }
}
