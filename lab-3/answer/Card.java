public class Card
{
  public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR", "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
  private String suit; 
  private int face;


  //constructors
  public Card(String _suit, int _face) {
      suit = _suit;
      face = _face;
  }
  
  public Card() {
      suit = "ZERO";
      face = 0;
  }

  //set methods
  public String getSuit() { return suit; }
  public int getFace() { return face; }
 
  //get methods

  public int getValue()
  {
    return face;
  }

  //equals method
  public boolean equals(Object obj) {
      Card c = (Card)obj;
      return (c.suit.equals(suit) && c.face == face );
  }

  public String toString()
  {
    return FACES[face] + " of " + getSuit() + " | value = " + getValue();
  }
}


