import java.util.*;

public class Deck {
    List<Card> cards = new ArrayList<Card>();

    public Deck() {
        // for four suits, instantiate cards 2- 14
        for (int i = 2; i < 15; i++) {
            cards.add(new Card(i, "Diamonds"));
        }
        for (int i = 2; i < 15; i++) {
            cards.add(new Card(i, "Hearts"));
        }
        for (int i = 2; i < 15; i++) {
            cards.add(new Card(i, "Spades"));
        }
        for (int i = 2; i < 15; i++) {
            cards.add(new Card(i, "Clubs"));
        }
    }

    public void shuffle() {
        Random r = new Random();
        for (int i = (cards.size()) - 1; i > 0; i--) {
            // pick random index
            int randInd = r.nextInt(cards.size() - 1);
            // starting with the last card grab the card that
            // is at index, store
            Card temp = cards.get(i);
            // set card to be the same as card at another randIndex
            cards.set(i, cards.get(randInd));
            // change card at randIndex to be the card previously found
            // at index completing the "swap"
            cards.set(randInd, temp);
        }
    }

    public Card draw() {
        Card drawnCard = cards.get(0);
        cards.remove(0);
        return drawnCard;
    }

    //extra method I used in testing to make sure the deck was created correctly
    public void printDeck(){
        for (Card c : cards){
            c.describe();
        } 
        
    }
    //extra method to find the size of the deck, made to make code responsive to changes in
    //deck
    public int deckSize(){
        return cards.size();
    }
}
