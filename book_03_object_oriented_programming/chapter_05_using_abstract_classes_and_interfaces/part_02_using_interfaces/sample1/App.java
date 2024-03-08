package sample1;
public class App {    
    public static void main(String[] args) {
        Playable game = getGame(GameType.POKER);
        game.play();
        game = getGame(GameType.HEARTS);
        game.play();
        game = getGame(GameType.TIC_TAC_TOE);
        game.play();
        // Output:
        // Playing the game from the Poker class.
        // Playing the game from the Hearts class.
        // Playing the game from the TicTacToe class.
    }

    private static Playable getGame(GameType gameType) {
        switch (gameType) {
            case HEARTS:
                return new Hearts();
            case POKER:
                return new Poker();
            case TIC_TAC_TOE:
                return new TicTacToe();
            default:
                return null;
        }
    }
}
