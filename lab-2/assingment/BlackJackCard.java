public class BlackJackCard extends Card
{

  //constructors
  public BlackJackCard()
  {
      super();
  }
  
  public BlackJackCard(int _rank, String _suit)
  {
      super(_rank, _suit);
  }
  
  public int getValue()
  {
    //override the Card getValue to build BlackJack logic
    //enables you to build the value for the game into the card
    //this makes writing the whole program a little easier 
    
    if(getFace() >= 11) { //if the card is jack or above return 10
        return 10;
    } else if(getFace() == 1) { // if the card is an ace return 11
        return 11;
    }
    
    // if its not an ace or a face card we return the regular value of the card
    return getFace();
  }
}
