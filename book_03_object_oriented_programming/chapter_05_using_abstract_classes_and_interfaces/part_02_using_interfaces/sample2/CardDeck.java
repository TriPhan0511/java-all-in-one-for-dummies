package sample2;

public class CardDeck implements Dealable {
    @Override
    public void deal(int numCards) {
        // Implementation of the deal method goes here
        System.out.println("Dealing " + numCards + " cards from CardDeck class.");
    }
}
