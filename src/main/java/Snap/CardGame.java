package Snap;

import java.util.ArrayList;
import java.util.List;

public abstract class CardGame {
    private List<Card> deckOfCards = new ArrayList<>();
    public CardGame() {
        String[] suits = {"♥", "♣", "♦", "♠"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String symbol : symbols) {
                int value;
                if (symbol.equals("A")) {
                    value = 14; // Ace has a value of 14
                } else if (symbol.equals("K")) {
                    value = 13;
                } else if (symbol.equals("Q")) {
                    value = 12;
                } else if (symbol.equals("J")) {
                    value = 11;
                } else {
                    value = Integer.parseInt(symbol);
                }

                Card card = new Card(suit, symbol, value);
                deckOfCards.add(card);
            }
        }
    }
}
