package Snap;

import Snap.Card;

import java.util.List;
import java.util.Optional;

public abstract class Player {
    private List<Card> deck;
    private String name;
    private int index;
    private int gamesWon;

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Player(List<Card> deck, String name) {
        this.deck = deck;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Optional<Card> dealCard(int index) {
        if (index < deck.size()) {
            return Optional.of(deck.get(index));
        }
        return Optional.empty();
    }

}