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

  public void setWinCount( int numwins ) { winCount = numwins; }

  public int getWinCount() { return winCount; } 

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
    Scanner in = new Scanner(System.in);
    System.out.print("Do you want to hit? [Y/N] ");
  
    if(in.nextLine().equals("y")) {
        return true;
    } else {
        return false;
    }
  }

  public String toString()
  {
    return "HAND " + hand.toString();
  }
}
