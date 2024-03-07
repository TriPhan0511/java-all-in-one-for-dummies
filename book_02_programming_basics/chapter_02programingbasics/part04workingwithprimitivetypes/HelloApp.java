package book_02_programming_basics.chapter_02programingbasics.part04workingwithprimitivetypes;

/**
 * HelloApp
 */
public class HelloApp {
    public static void main(String[] args) {
        // Using reference types
        // Ball b1 = new Ball();
        // Ball b2 = b1;
        // b1.setSpeed(50);
        // b2.setSpeed(100);
        // System.out.println(b1.getSpeed()); // 100

        // Using inferred variable types
        // var x = 10;
        var b = new Ball();
        System.out.println(b.getClass().getSimpleName()); // Ball
        if (b.getClass().getSimpleName().equals("Ball")) {
            System.out.println("x is a Ball object.");
        }
        // x is a Ball object.
    }
}

// public class HelloApp {
//     public static void main(String[] args) {
//         // There are 8 primitive data types in Java: 
//         // byte, short, int, long, float, double, char, and boolean.
//         // byte a = 1;
//         // short b = 2;
//         // int c = 3;
//         // long d = 4;
//         // float e = 5.0f;
//         // double f = 6.0;
//         // System.out.println(a);
//         // System.out.println(b);
//         // System.out.println(c);
//         // System.out.println(d);
//         // System.out.println(e);
//         // System.out.println(f);

//         // Integer Types
//         // int xInt = 10;
//         // long yLong = xInt;
//         // System.out.println(yLong);

//         // long xLong = 10;
//         // // int yInt = xLong; // Error: incompatible types: possible lossy conversion from long to int
//         // int yInt = (int) xLong;
//         // System.out.println(yInt);

//         // long x = 58473882;
//         // long y = 58_473_882;
//         // if (x == y) {
//         //     System.out.println("x and y are equal");
//         // }

//         // int x = 10_123_345;
//         // int y = 10123345;
//         // if (x == y) {
//         //     System.out.println("x and y are equal");
//         // }

//         // Floating-Point Types
//         // float f = 10.0f;
//         // System.out.println(f); // 10.0

//         // // double period = 99.0d;
//         // double period = 99.0;
//         // System.out.println(period); // 99.0

//         // The char Type
//         // char ch = 'A';
//         // System.out.println(ch); // A
//         // System.out.println(ch + 1); // 66
//         // System.out.println((char)(ch + 1)); // B
//         // System.out.println((char)66);  // B

//         // You can assign an integer value from 0 to 255 to a char variable.
//         // char c = 0;
//         // System.out.println(c); // (null character)
//         // c = 255;
//         // System.out.println(c); // ÿ (Latin small letter y with diaeresis)
//         // c = 65;
//         // System.out.println(c); // A
//         // c = 97;
//         // System.out.println(c); // a

//         // char ch = '\b';
//         // System.out.println(ch); // (backspace)

//         // The boolean Type
//         // boolean enrolled = true;
//         // boolean credited = false;
        
//         // if (enrolled) {
//         //     System.out.println("The student is enrolled.");
//         // } else {
//         //     System.out.println("The student is not enrolled.");
//         // }   
//         // if (credited) {
//         //     System.out.println("The student is credited.");
//         // } else {
//         //     System.out.println("The student is not credited.");
//         // }

//         // String msg = enrolled ? "The student is enrolled." : "The student is not enrolled.";
//         // String msg2 = credited ? "The student is credited." : "The student is not credited.";
//         // System.out.println(msg);
//         // System.out.println(msg2);
//         // // The student is enrolled.
//         // // The student is not credited.
//     }
// }

// public class HelloApp {

//     static final int BALL_RADIUS = 10;

//     void printBallRadius() {
//         System.out.println(BALL_RADIUS);
//     }

//     public static void main(String[] args) {
//         // Initializing variables using the assignment statements
//         int x;
//         x = 0;
//         System.out.println(x); // 0

//         // Initializing variables with initializers
//         // In effect, the initializer lets you combine the declaration and 
//         // the assignment statement into one concise statement.
//         int y = 0;
//         String name = "John";
//         double radius = 15.4;
//         System.out.println(y); // 0
//         System.out.println(name); // John
//         System.out.println(radius); // 15.4

//         // System.out.println(BALL_RADIUS); // 10
//         System.out.println("The ball radius is " + BALL_RADIUS);
//     }
// }

// public class HelloApp {
//     static String helloMessage; // class variable
//     String message; // instance variable
//     static int x;
//     static boolean b;

//     public static void main(String[] args) {
//         helloMessage = "Hello, world!";
//         System.out.println(helloMessage);

//         String msg = "Good morning!"; // local variable
//         System.out.println(msg);

//         System.out.println(x); // 0
//         System.out.println(b); // false

//         int k;
//         // System.out.println(k); // error

//         // message = "Hello, world!"; // error

//         MyClass myClassObj = new MyClass();
//         myClassObj.printX();
//     }
// }
