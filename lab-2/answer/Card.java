public class Card
{
  // I realy dont know why they want to use a zero card
  public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR", "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
  private String suit; 
  private int face;

  // default constructor
  public Card()
  {
     face = 0;
     suit = "ZERO";
  }
  
  // the underscores before the variable are just a little naming scheme
  // they are not necisary
  public Card(int _face, String _suit)
  {
    face = _face;
    suit = _suit;
  }


  // Setter methods
  public void setSuit(String _suit) { suit = _suit; }
  public void setFace(int _face) { face = _face; }

  // Getter methods
    public String getSuit() { return suit; }
    public int getFace() { return face; } // this actualy make me want to kill myself

  public int getValue()
  {
    return face;
  }

  //equals method
  public boolean equals(Object obj)
  {
      // I know this is unsafe
      Card c = (Card)obj;
      return (c.suit == suit && c.face == face);
  }

  public String toString()
  {
    return FACES[face] + " of " + getSuit() + " | value = " + getValue();
  }
}


