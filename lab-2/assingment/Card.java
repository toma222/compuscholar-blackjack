public class Card
{
    public static final String FACES[] = {
        "ZERO","ACE","TWO","THREE","FOUR", "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"
    };

    private String suit;
    private int face;
    
    //constructors

    //set methods

    //get methods

    public int getValue()
    {
        return face;
    }

    //equals method

    public String toString()
    {
        return FACES[face] + " of " + getSuit() + " | value = " + getValue();
    }
}