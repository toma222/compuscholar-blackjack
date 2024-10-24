public class BlackJackCard extends Card
{

  //constructors
  public BlackJackCard() {
      super();
  }
  
  public BlackJackCard(String _suit, int _face) {
      super(_suit, _face);
  }

  public int getValue()
  {
    //override the Card getValue to build BlackJack logic
    //enables you to build the value for the game into the card
    //this makes writing the whole program a little easier 
    if(getFace() >= 11){
        return 10;
    }else if(getFace() == 1){
        return 11;
    }
    
    return getFace();
  }
}
