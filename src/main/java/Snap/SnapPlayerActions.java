package Snap;

import java.util.List;

public interface SnapPlayerActions {

    void takeTurn(List<Card> playerDeck, List<Card> opponentDeck, Player player1, Player player2);
    boolean checkMatch(Card card1, Card card2);
}
    
