package sample2;

public class App {
    public static void main(String[] args) {
        // Dealable d = new CardDeck();
        // Because the CardDeck class implements the Dealable interface, 
        // it can be passed as a parameter to the startGame method.
        CardDeck d = new CardDeck();
        startGame(d, "poker");
        startGame(d, "hearts");
        startGame(d, "gin");
        // Output:
        // Dealing 5 cards from CardDeck class.
        // Dealing 5 cards in poker
        // Dealing 13 cards from CardDeck class.
        // Dealing 13 cards in hearts
        // Dealing 10 cards from CardDeck class.
        // Dealing 10 cards in gin
    }

    private static void startGame(Dealable deck, String game) {
        if (game.equalsIgnoreCase("poker")) {
            deck.deal(5);
            System.out.println("Dealing 5 cards in " + game);
        } else if (game.equalsIgnoreCase("hearts")) {
            deck.deal(13);
            System.out.println("Dealing 13 cards in " + game);
        } else if (game.equalsIgnoreCase("gin")) {
            deck.deal(10);
            System.out.println("Dealing 10 cards in " + game);
        }
    }
}
