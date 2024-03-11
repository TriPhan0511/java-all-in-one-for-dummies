package book_03_object_oriented_programming.chapter_07_using_inner_classes_anonymous_classes_and_lambda_expressions.part_04_using_lambda_expressions;

public class LambdaBall {
    public static void main(String[] args) {
        Ball ball = () -> System.out.println("You hit it!");
        ball.hit();
    }

    private interface Ball {
        void hit();
    }
}
