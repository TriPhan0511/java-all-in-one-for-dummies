package book_03_object_oriented_programming.chapter_07_using_inner_classes_anonymous_classes_and_lambda_expressions.part_04_using_lambda_expressions;

public class LambdaBallWithParameters {
    public static void main(String[] args) {
        Ball ball = power -> {
            power = power * 2;
            return "You hit it with power " + power + "!";
        };
        System.out.println(ball.hit(10));
    }
    
    private interface Ball {
        String hit(int power);
    }
}
