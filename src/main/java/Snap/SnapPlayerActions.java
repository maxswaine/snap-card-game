package Snap;

import java.util.List;

public interface SnapPlayerActions {

    boolean takeTurn(Player player1, Player player2);
    boolean checkMatch(Card card1, Card card2);
    void increaseIndex();

}
    
