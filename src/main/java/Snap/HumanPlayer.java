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
    public void takeTurn(List<Card> playerDeck, List<Card> opponentDeck, Player player1, Player player2) {
        System.out.println(getName() + ", Press Enter to take your turn");
        String input = scanner.nextLine();
        if (!input.isEmpty()) {
            System.out.println("Okay badman. All you had to do was press enter");
        }

        Optional<Card> playerCard = dealCard(0);
        Optional<Card> opponentCard = opponentDeck.stream().findFirst();

        if (playerCard.isPresent() && opponentCard.isPresent()) {
            System.out.println(player1.getName() + "'s Card");
            System.out.println(playerCard.get());
            System.out.println(opponentCard.get());
            System.out.println(player2.getName() + "'s Card");

            if (checkMatch(playerCard.get(), opponentCard.get())) {
                System.out.println(getName() + " Wins!");
                gameOver = true;
            }
        } else {
            System.out.println("No cards left for " + getName());
        }
    }

    @Override
    public boolean checkMatch(Card card1, Card card2) {
        return card1.getValue() == card2.getValue();
    }
}
