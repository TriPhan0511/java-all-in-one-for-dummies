// Using the Math class

package useful_samples.random_integers;

public class UsingMathClass {
    public static void main(String[] args) {
        UsingMathClass usingMathClass = new UsingMathClass();
        int min = 10;
        int max = 20;
        int randomInt = usingMathClass.getRandomInt(min, max);
        System.out.println(randomInt);
    }

    private int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
