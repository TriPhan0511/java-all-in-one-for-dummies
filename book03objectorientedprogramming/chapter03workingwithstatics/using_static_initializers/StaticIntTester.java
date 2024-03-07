package book03objectorientedprogramming.chapter03workingwithstatics.using_static_initializers;

public class StaticIntTester {
    public static void main(String[] args) {
        System.out.println("StaticInt.x: " + StaticInt.x);
    }
    // Output:
    // StaticInt.x: 32
}

/*
NOTE:
This example is pretty trivial. In fact, you can achieve the same effect just by
assigning the value 32 to the variable when it is declared. If, however, you had to
perform a complicated calculation to determine the value of x, a static initializer
could be very useful.
*/