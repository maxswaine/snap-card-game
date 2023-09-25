package Snap;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Snap extends CardGame {
    private Scanner scanner;
    private int player1Index = 0;
    private int player2Index = 0;
    private boolean gameOver = false;

    public Snap() {
        scanner = new Scanner(System.in);
    }

    public void takeTurn(List<Card> playerDeck, List<Card> opponentDeck, Player player1, Player player2) {
        System.out.println(player1.getName() + ", Press Enter to take your turn");
        String input = scanner.nextLine();
        if (!input.isEmpty()) {
            System.out.println("Okay badman. All you had to do was press enter");
        }

        Optional<Card> playerCard = player1.dealCard(player1.getDeck(), player1Index);
        Optional<Card> opponentCard = player2.dealCard(player2.getDeck(), player2Index);

        if (playerCard.isPresent() && opponentCard.isPresent()) {
            System.out.println("Player 1's Card");
            System.out.println(playerCard.get());
            System.out.println(opponentCard.get());
            System.out.println("Player 2's Card");

            if (checkMatch(playerCard.get(), opponentCard.get())) {
                System.out.println(player1.getName() + " Wins!");
                gameOver = true;
            }
        } else {
            System.out.println("No cards left for " + player1.getName());
        }
    }



    public void run(Player player1, Player player2) {
        sortDeck(CardSorting.SHUFFLE);
        List<Card> userDeck = getDeckOfCards().subList(0, 25);
        List<Card> computerDeck = getDeckOfCards().subList(26, 51);

        player1.setDeck(userDeck);
        player2.setDeck(computerDeck);

        do {
            takeTurn(userDeck, computerDeck, player1, player2);
            if (gameOver) break;
            player1Index++;

            takeTurn(userDeck, computerDeck, player1, player2);
            player2Index++;
        } while (!gameOver);
    }
}
