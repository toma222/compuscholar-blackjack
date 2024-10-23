public class Dealer extends Player
{
  //define a deck of cards
  Deck deck;

  public Dealer() 
  {
      deck = new Deck();
  }

  public void shuffle()
  {
    //shuffle the deck
    deck.shuffle();
  }

  //hand the next card to the player
  public Card deal()
  { 
    return deck.nextCard();
  }

  public boolean hit()
  {
    // id say only hit unless the hand value is less than 18
    // this logic does not matter right now so dont worry about it to much
    return (getHandValue() < 18);
  }
}
