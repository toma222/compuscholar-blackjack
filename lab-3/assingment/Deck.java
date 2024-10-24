public class Deck
{
    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;
    public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};
    private int topCardIndex; // index of the top most card in the deck
    private ArrayList<Card> stackOfCards;

    //constructor
    public Deck()
    {
        //initialize the instance variables
        //one loop to go through all SUITS
        //one loop to go through all FACES
        //add in each new BlackJackCard() to the Deck
    }

    // number of cards left in the deck
    public int numCardsLeft(){
        return 0;
    }

    public void shuffle(){
        //add code to shuffle deck – Collections has a shuffle
        // use the package - import java.util.Collections;
    }

    public Card nextCard(){
        return stackOfCards.get(--topCardIndex);
    }
    
    public String toString(){
        return stackOfCards + " topCardIndex = " + topCardIndex;
    }
}