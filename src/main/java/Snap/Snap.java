package Snap;

import Commands.CommandRunner;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Snap extends CardGame {
    Scanner scanner = new Scanner(System.in);
    CommandRunner commandRunner = new CommandRunner();

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
        sortDeck(CardSorting.SHUFFLE);
        List<Card> userDeck = getDeckOfCards().subList(0, 25);
        List<Card> computerDeck = getDeckOfCards().subList(26, 51);
        HumanPlayer player1 = new HumanPlayer(userDeck, "Player 1");
        ComputerPlayer computer = new ComputerPlayer(computerDeck, "Computer");

        boolean outOfCards = false;

        doFirstTurn(player1, computer);
        player1.increaseIndex();
        computer.increaseIndex();

        do {
            if(player1.takeTurn(player1, computer)){
                break;
            }
            player1.increaseIndex();

            if(computer.takeTurn(computer, player1)){
                break;
            }
            computer.increaseIndex();

            outOfCards = (player1.getIndex() >= userDeck.size());
        } while (!outOfCards);
        System.out.println("Game Over! Do you want to play again? \n(1: Yes \n 2: No)");
        int playAgainChoice = scanner.nextInt();
        if (playAgainChoice == 1) {
            commandRunner.chooseCommands(); // Restart the game
        } else {
            System.out.println("Thank you for playing!");
            System.exit(0); // Exit the program
        }
    }
    public void runAgainstPlayer(){
        sortDeck(CardSorting.SHUFFLE);
        List<Card> userDeck = getDeckOfCards().subList(0, 25);
        List<Card> computerDeck = getDeckOfCards().subList(26, 51);
        HumanPlayer player1 = new HumanPlayer(userDeck, "Player 1");
        HumanPlayer player2 = new HumanPlayer(computerDeck, "Player 2");

        boolean outOfCards = false;
        doFirstTurn(player1, player2);
        player1.increaseIndex();
        player2.increaseIndex();

        do {
            if(player1.takeTurn(player1, player2)){
                break;
            }
            player1.increaseIndex();

            if(player2.takeTurn(player2, player1)){
                break;
            }
            player2.increaseIndex();

            outOfCards = (player1.getIndex() >= userDeck.size());
        } while (!outOfCards);
        System.out.println("Game Over! Do you want to play again? (1: Yes \n 2: No)");
        int playAgainChoice = scanner.nextInt();
        if (playAgainChoice == 1) {
            commandRunner.chooseCommands();
        } else {
            System.out.println("Thank you for playing!");
            System.exit(0);
        }
    }

}