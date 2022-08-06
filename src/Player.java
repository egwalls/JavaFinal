import java.util.*;

public class Player {
    private List<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.score = 0;

    }

    // getters and setters
    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe(Player player) {
        System.out.println("This player is named: " + name + "\nTheir hand contains the following cards: ");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        Card playedCard = hand.get(0);
        hand.remove(0);
        return playedCard;
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    
    }

    public void incrementScore() {
        score++;
    }

    //extra method to find hand size to make code responsive to changes in deck size

    public int handSize(){
        return hand.size();
    }
}
