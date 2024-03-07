package book_02_programming_basics.chapter03workingwithnumbersandexpressions.part07usingthemathclass;

public class DiceApp {
    static int randomInt(int low, int high) {
        return (int)(Math.random() * (high - low + 1)) + low;
    }
    public static void main(String[] args) {
        System.out.println("Here are 100 random rolls of a six-sided die:");
        for (int i = 0; i < 100; i++) {
            System.out.print(randomInt(1, 6) + " ");
        }
    }
}
