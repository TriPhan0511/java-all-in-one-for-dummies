package book02chapter02programingbasics05convertingandcastingnumericdata;

public class HelloApp {
    public static void main(String[] args) {
        // Automatic type conversion
        // int i = 100;
        // float f = i;
        // System.out.println(f); // 100.0
        /*
         * NOTE:
            Whenever you perform a mathematical operation on two values that aren’t of the
            same type, Java automatically converts one of them to the type of the other. Here
            are the rules Java follows when doing this conversion:

            1. If one of the values is a double, the other is converted to a double.
            2. If no double is involved, but one of the values is a float, the other is 
               converted to a float.
            3. If no double or float is involved, but one of the values is a long, the other 
               is converted to a long.
            4. If no double, float, or long is involved, both values are converted to an int.
         */

        // Type casting (Explicit type conversion)
        double pi = 3.14159;
        int iPi = (int) pi;
        System.out.println(iPi); // 3
        /*
         * NOTE:
            When you cast a floating-point number to an integer, the number is truncated to 
            the integer portion of the value. In other words, the decimal portion of the 
            number is simply lopped off. This is true whether the number is positive or 
            negative. For example, if you cast 3.14159 to an int, you get 3. If you cast 
            –3.14159 to an int, you also get -3. The value is simply truncated, not rounded.
         */
        double d = -3.14159;
        int i = (int) d;
        System.out.println(i); // -3
        d = 3.99999;
        i = (int) d;
        System.out.println(i); // 3

        // Use the round method of the Math class to round a floating-point number
        i = (int) Math.round(3.99999); // 4
        i = (int) Math.round(3.5);  // 4
        i = (int) Math.round(3.49999); // 3
    }
}
