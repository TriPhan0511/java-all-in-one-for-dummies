public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.play(); // Playing a game
        game.quit(); // Quitting a game
        Playable.print(); // Printing a game
        // Playable.log(); // error: non-static method log() cannot be referenced from a static context
        // game.log(); // error: log() has private access in Playable
        // Playable.display("Hello"); // error: non-static method display(java.lang.String) cannot be referenced from a static context  
    }
}
