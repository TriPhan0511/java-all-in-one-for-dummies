// Using java.util.Random

package useful_samples.random_integers;

import java.util.Random;

public class UsingRandomClass {
    public static void main(String[] args) {
        UsingRandomClass usingMathClass = new UsingRandomClass();
        int min = 10;
        int max = 20;
        int randomInt = usingMathClass.getRandomInt(min, max);
        System.out.println(randomInt);
    }

    private int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;  // Generate random integers in range 10 to 50
    }

}
