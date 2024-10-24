public class Player
{
    private ArrayList<Card> hand;
    private int winCount;

    public Player ()
    {
        //initialize the instance variables
    }

    // add the card to the hand ArrayList
    public void addCardToHand( Card temp )
    {
    }

    // empty the hand
    public void resetHand( )
    {
        //there is a clear() method in ArrayList
    }

    public void setWinCount( int numwins )
    {
    }

    public int getWinCount() {
        return 0;
    }

    //number of the cards in hand
    public int getHandSize() {
        return 0;
    }
    //the total value of the cards in hand
    public int getHandValue()
    {
        return 0;
    }

    public boolean hit( )
    {
        return false; //replace it with player’s hit logic
    }

    public String toString()
    {
        return "";
    }
}