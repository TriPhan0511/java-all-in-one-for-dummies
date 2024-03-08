package sample1;
public class Hearts implements Playable, CardGame{
    @Override
    public void play() {
        // Implementation of the play() method
        System.out.println("Playing the game from the Hearts class.");
    }
    
    @Override
    public void shuffle() {
        // Implementation of the shuffle() method
    }
}
