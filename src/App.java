import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to War!\n");
        System.out.print("To start enter a name for Player 1: ");
        Scanner s = new Scanner(System.in);
        String nameBuffer = s.next();
        Player p1 = new Player(nameBuffer);
        System.out.print("Next enter a name for Player 2: ");
        nameBuffer = s.next();
        Player p2 = new Player(nameBuffer);
        s.close();
        
        //instantiate deck
        Deck deck = new Deck();      
        
        //shuffle the deck
        System.out.println("\nNow shuffling the deck...");
        deck.shuffle();

        //deal the cards
        System.out.println("\nNow dealing the deck...");
        for (int i = 0; i < deck.deckSize(); i++){
            if (i % 2 != 0) {
                p1.draw(deck);
            } else if (i % 2 == 0){
                p2.draw(deck);
            }
        }

        System.out.println("\nNow beginning the game!\n");
        //play through hands
        int startingHandSize = p1.handSize();
        for (int i = 0; i < startingHandSize; i++){
            //call flip for each player
            Card p1Card = p1.flip();
            System.out.println(p1.getName() + " played " + p1Card.describe());
            Card p2Card = p2.flip();
            System.out.println(p2.getName() + " played " + p2Card.describe());
            //compare cards
            if (p1Card.getValue() > p2Card.getValue()){
                System.out.println("Player 1 wins this round!\n");
                p1.incrementScore();
            } else if (p2Card.getValue() > p1Card.getValue()){
                System.out.println("Player 2 wins this round!\n");
                p2.incrementScore();
            } else {
                System.out.println("This round is a draw\n");
            }
        }
        
        //game results
        System.out.println("===========GAME OVER=============");
        if (p1.getScore() > p2.getScore()){
            System.out.println("Player 1 won the game with a score of " + p1.getScore());
        } else if (p2.getScore() > p1.getScore()){
            System.out.println("Player 2 won the game with a score of " + p2.getScore());
        } else if (p1.getScore() == p2.getScore()) {
            System.out.println("The game was a tie!");
        }


    }
    
}
