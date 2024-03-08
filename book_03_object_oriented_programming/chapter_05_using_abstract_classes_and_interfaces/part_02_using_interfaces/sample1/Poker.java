package sample1;
public class Poker extends Game
    implements Playable, CardGame {
    // Inherits all members of the Game class,
    // must implement the Playable and CardGame interfaces.

    @Override
    public void start() {
        // Add implementation for the start method
    }
    
    @Override
    public void play() {
        // Add implementation for the play method
        System.out.println("Playing the game from the Poker class.");
    }
    
    @Override
    public void shuffle() {
        // Add implementation for the shuffle method
    }       
}
