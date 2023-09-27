package Snap;

import java.util.List;
import java.util.Optional;

public class ComputerPlayer extends Player implements SnapPlayerActions{
    boolean gameOver = false;
    int gamesWon = 0;

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public ComputerPlayer(List<Card> deck, String name) {
        super(deck, name);
    }
    @Override
    public boolean takeTurn(Player player1, Player player2) {

        Optional<Card> playerCard = dealCard(getIndex());
        Optional<Card> opponentCard = player2.dealCard(player2.getIndex());

        if (playerCard.isPresent() && opponentCard.isPresent()) {
            System.out.println(player1.getName() + "'s Card");
            System.out.println(playerCard.get());
            System.out.println(opponentCard.get());
            System.out.println(player2.getName() + "'s Card");

            if (checkMatch(playerCard.get(), opponentCard.get())) {
                player1.setGamesWon(player1.getGamesWon() + 1);

                System.out.println(getName() + " Wins!");
                gameOver = true;
            }
        } else {
            System.out.println("No cards left for " + getName());
        }
        return gameOver;
    }

    @Override
    public boolean checkMatch(Card card1, Card card2) {
        return card1.getValue() == card2.getValue();
    }

    @Override
    public void increaseIndex() {
        setIndex(getIndex() + 1);
    }
}

