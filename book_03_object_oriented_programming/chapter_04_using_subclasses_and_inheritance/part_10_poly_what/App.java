package book_03_object_oriented_programming.chapter_04_using_subclasses_and_inheritance.part_10_poly_what;

public class App {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new BetterPlayer();
        playTheGame(p1, p2);
    }

    private static void playTheGame(Player p1, Player p2) {
        p1.move();
        p2.move();
    }

    // Output:
    // The basic player says:
    // I'll take the first open square!

    // The better player says:
    // I'm looking for a good move...
}

/*
NOTE:
Java knows to call the move method of the BetterPlayer subclass because it uses
a technique called late binding. Late binding simply means that when the compiler
can’t tell for sure what type of object a variable references, it doesn’t hard-wire
the method calls when the program is compiled. Instead, it waits until the program
is executing to determine exactly which method to call.
 */