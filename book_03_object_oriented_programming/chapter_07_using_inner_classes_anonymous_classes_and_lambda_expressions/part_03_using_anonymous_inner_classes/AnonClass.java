package book_03_object_oriented_programming.chapter_07_using_inner_classes_anonymous_classes_and_lambda_expressions.part_03_using_anonymous_inner_classes;

public class AnonClass {
    public static void main(String[] args) {
        Ball ball = new Ball() {
            @Override
            public void hit() {
                System.out.println("You hit it!");
            }
        };
        ball.hit();
    }

    private interface Ball {
        void hit();
    }
}
