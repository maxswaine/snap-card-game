package Snap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public abstract class CardGame {
    protected List<Card> deckOfCards = new ArrayList<>();
    protected String name;
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

    public void printAllCards() {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }
    }
    public List<Card> getDeckOfCards() {
        return (List<Card>) deckOfCards;
    }

    public void setDeckOfCards(List<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void sortDeck(CardSorting cardSorting) {
        switch (cardSorting) {
            case BY_SUIT:
                deckOfCards.sort((a, b) -> a.getSuit().compareTo(b.getSuit()));
                break;
            case BY_NUMBER:
                deckOfCards.sort((a,b) -> a.getValue() - b.getValue());
                break;
            case SHUFFLE:
                Collections.shuffle(deckOfCards);
                break;
        }
    }
}
