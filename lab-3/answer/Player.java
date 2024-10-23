import java.util.ArrayList;
public class Player
{
  private ArrayList<Card> hand; 
  private int winCount; //

  public Player ()
  {
    //initialize the instance variables
    hand = new ArrayList<Card>();
    winCount = 0;
  }

  //add the card to the hand ArrayList
  public void addCardToHand( Card temp )
  {
      hand.add(temp);
  }

  // empty the hand
  public void resetHand( )
  {
    //there is a clear() method in ArrayList 
    hand.clear();
  }
  
  // Setter method
  public void setWinCount( int numwins ) { winCount = numwins; }

  // Getter methods
  public int getWinCount() { return 0; } 
  //number of the cards in hand
  public int getHandSize() { return hand.size(); } 

  //the total value of the cards in hand
  public int getHandValue() {
      int val = 0;
      for(Card c : hand)
        val += c.getValue();
      return val;
  }

  public boolean hit()
  {
    // id say only hit unless the hand value is less than 18
	// this logic does not really matter right now though so dont worry much about it
    return (getHandValue() < 18);
  }

  public String toString()
  {
    return "HAND " + hand.toString();
  }
}
