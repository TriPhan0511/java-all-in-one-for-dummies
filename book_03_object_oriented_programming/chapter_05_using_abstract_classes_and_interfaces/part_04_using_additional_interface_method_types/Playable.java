/*
NOTE:
In addition to abstract methods, you can include the following
types of methods in an interface:

    * default methods: Provide a default implementation that is used if the
        method is not overridden.

    * static methods: Like static methods for a class, provide methods that are
        invoked apart from an instance of a class implementing the interface. Static
        methods cannot be overridden.

    * private methods: Provide for methods that can be called only by default
        methods or other private interface methods. A private method cannot be
        overridden or accessed by an implementing class.

    * private static methods: Similar to private methods but are static and
        can be called only by static interface methods or other private static
        interface methods. A private static method cannot be overridden or
        accessed by an implementing class.
 */

public interface Playable {
    void play();

    // Default method
    default void quit() {
        System.out.println("Quitting a game");
    }

    // Static method
    static void print() {
        System.out.println("Printing a game");
    }

    // Private method
    private void log() {
        System.out.println("Logging a game");
    }

    // Private static method
    private static void display(String message) {
        System.out.println(message);
    }
}