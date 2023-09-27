package Snap;

import Commands.CommandRunner;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Snap extends CardGame {
    Scanner scanner = new Scanner(System.in);
    CommandRunner commandRunner = new CommandRunner();
    boolean playAgain;

    public void doFirstTurn(Player player1, Player player2) {
        Optional<Card> player1Card = player1.dealCard(player1.getIndex());
        Optional<Card> player2Card = player2.dealCard(player2.getIndex());

        if (player1Card.isPresent() && player2Card.isPresent()) {
            System.out.println(player2.getName() + " puts down their first card:");
            System.out.println(player2Card.get());
            System.out.println(player1Card.get());
            System.out.println(player1.getName() + " puts down their first card:");
        }
}

    public void runAgainstComputer() {
        do {
            sortDeck(CardSorting.SHUFFLE);

            List<Card> userDeck = getDeckOfCards().subList(0, 25);
            List<Card> computerDeck = getDeckOfCards().subList(26, 51);
            HumanPlayer player1 = new HumanPlayer(userDeck, "Player 1");
            ComputerPlayer computer = new ComputerPlayer(computerDeck, "Computer");

            boolean outOfCards = false;

            doFirstTurn(player1, computer);

            do {
                player1.increaseIndex();
                if (player1.takeTurn(player1, computer)) {
                    player1.setGamesWon(player1.getGamesWon() + 1);
                    break;
                }

                computer.increaseIndex();
                if (computer.takeTurn(computer, player1)) {
                    break;
                }

                outOfCards = (player1.getIndex() >= userDeck.size());
            } while (!outOfCards);
            System.out.println(player1.getName() + ": " + player1.getGamesWon());
            System.out.println(computer.getName() + ": " + computer.getGamesWon());
            playAgain = playAgain();
        } while(playAgain);
    }
    public void runAgainstPlayer() {
        do {
            sortDeck(CardSorting.SHUFFLE);
            List<Card> userDeck = getDeckOfCards().subList(0, 25);
            List<Card> computerDeck = getDeckOfCards().subList(26, 51);
            HumanPlayer player1 = new HumanPlayer(userDeck, "Player 1");
            HumanPlayer player2 = new HumanPlayer(computerDeck, "Player 2");

            boolean outOfCards = false;
            doFirstTurn(player1, player2);

            do {
                player1.increaseIndex();
                if (player1.takeTurn(player1, player2)) {
                    player1.setGamesWon(player1.getGamesWon() + 1);
                    break;
                }

                player2.increaseIndex();
                if (player2.takeTurn(player2, player1)) {
                    player1.setGamesWon(player2.getGamesWon() + 1);
                    break;
                }

                outOfCards = (player1.getIndex() >= userDeck.size());
            } while (!outOfCards);
            System.out.println("Score:");
            System.out.println(player1.getName() + ": " + player1.getGamesWon());
            System.out.println(player2.getName() + ": " + player2.getGamesWon());
            playAgain = playAgain();
        } while(playAgain);
    }
    public boolean playAgain(){
        Scanner scanner = new Scanner(System.in);
        String choice;
        do{
            System.out.println("Do you want to play again? (y/n)");
            choice = scanner.nextLine().toLowerCase();
        } while (!choice.equals("y") && !choice.equals("n"));
        if (choice.equals("y")){
            System.out.println("Okay lets do it!");
            return true;
        } else{
            System.out.println("Thanks for playing! See you next time");
            return false;
        }
    }
}