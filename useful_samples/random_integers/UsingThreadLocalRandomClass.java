// Using java.util.concurrent.ThreadLocalRandom (from Java 1.7 onwards):

package useful_samples.random_integers;

import java.util.concurrent.ThreadLocalRandom;

public class UsingThreadLocalRandomClass {
    public static void main(String[] args) {
        UsingThreadLocalRandomClass usingMathClass = new UsingThreadLocalRandomClass();
        int min = 10;
        int max = 20;
        int randomInt = usingMathClass.getRandomInt(min, max);
        System.out.println(randomInt);
    }

    private int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);  // Generate random integers in range 10 to 50
    }
}
