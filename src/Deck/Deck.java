package src.Deck;

public class Deck {
    private Card[] deck;
    private int currentCard; // Tracks the next card to be dealt

    public Deck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        
        deck = new Card[52];
        currentCard = 0;

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = new Card(rank, suit);
            }
        }
    }

    // Shuffle the deck
    public void shuffle() {
        for (int i = deck.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Deal a card
    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null; // No cards left
        }
    }
}
