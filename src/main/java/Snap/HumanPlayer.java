package Snap;

import Snap.Card;
import Snap.Player;
import Snap.SnapPlayerActions;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class HumanPlayer extends Player implements SnapPlayerActions {
    Scanner scanner = new Scanner(System.in);
    boolean gameOver = false;


    public HumanPlayer(List<Card> deck, String name) {
        super(deck, name);
    }


    @Override
    public boolean takeTurn(Player player1, Player player2) {
        System.out.println(getName() + ", Press Enter to take your turn");
        String input = scanner.nextLine();

        Optional<Card> playerCard = dealCard(getIndex());
        Optional<Card> opponentCard = player2.dealCard(player2.getIndex());

        if (playerCard.isPresent() && opponentCard.isPresent() && input != null) {
            System.out.println(player2.getName() + "'s Card");
            System.out.println(opponentCard.get());
            System.out.println(playerCard.get());
            System.out.println(player1.getName() + "'s Card");

            if (checkMatch(playerCard.get(), opponentCard.get())) {
                System.out.println(getName() + " Wins!");
                gameOver = true;
            }
            increaseIndex();
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
