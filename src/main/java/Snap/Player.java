package Snap;

import Snap.Card;

import java.util.List;
import java.util.Optional;

public abstract class Player {
    private List<Card> deck;
    private String name;

    public Player(List<Card> deck, String name) {
        this.deck = deck;
        this.name = name;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Card> dealCard(int index) {
        if (index < deck.size()) {
            return Optional.of(deck.get(index));
        }
        return Optional.empty();
    }

}