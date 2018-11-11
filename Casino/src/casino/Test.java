package casino;

import static org.junit.Assert.*;

import org.junit.Before;

public class Test {
	Deck deck;
	
	@Before
	public void setUp() throws Exception {

		deck = new ConcreteDeck();
	}
	@org.junit.Test
	public void DeckStringtest() {
		String actual = deck.toString();
		String expected = "Ace of Clubs, Two of Clubs, Three of Clubs, Four of Clubs, Five of Clubs, Six of Clubs, Seven of Clubs, Eight of Clubs, Nine of Clubs, Ten of Clubs, Jack of Clubs, Queen of Clubs, King of Clubs, Ace of Diamonds, Two of Diamonds, Three of Diamonds, Four of Diamonds, Five of Diamonds, Six of Diamonds, Seven of Diamonds, Eight of Diamonds, Nine of Diamonds, Ten of Diamonds, Jack of Diamonds, Queen of Diamonds, King of Diamonds, Ace of Hearts, Two of Hearts, Three of Hearts, Four of Hearts, Five of Hearts, Six of Hearts, Seven of Hearts, Eight of Hearts, Nine of Hearts, Ten of Hearts, Jack of Hearts, Queen of Hearts, King of Hearts, Ace of Spades, Two of Spades, Three of Spades, Four of Spades, Five of Spades, Six of Spades, Seven of Spades, Eight of Spades, Nine of Spades, Ten of Spades, Jack of Spades, Queen of Spades, King of Spades, "; 

		assertEquals(actual,expected);
	}

	@org.junit.Test
	public void testShuffle() {
		deck.shuffle();
		String actual = deck.toString();
		String expected = "Ace of Clubs, Two of Clubs, Three of Clubs, Four of Clubs, Five of Clubs, Six of Clubs, Seven of Clubs, Eight of Clubs, Nine of Clubs, Ten of Clubs, Jack of Clubs, Queen of Clubs, King of Clubs, Ace of Diamonds, Two of Diamonds, Three of Diamonds, Four of Diamonds, Five of Diamonds, Six of Diamonds, Seven of Diamonds, Eight of Diamonds, Nine of Diamonds, Ten of Diamonds, Jack of Diamonds, Queen of Diamonds, King of Diamonds, Ace of Hearts, Two of Hearts, Three of Hearts, Four of Hearts, Five of Hearts, Six of Hearts, Seven of Hearts, Eight of Hearts, Nine of Hearts, Ten of Hearts, Jack of Hearts, Queen of Hearts, King of Hearts, Ace of Spades, Two of Spades, Three of Spades, Four of Spades, Five of Spades, Six of Spades, Seven of Spades, Eight of Spades, Nine of Spades, Ten of Spades, Jack of Spades, Queen of Spades, King of Spades, "; 

		assertNotEquals(actual,expected);
	}
	@org.junit.Test
	public void testHand() {
		
		Card[]cards = new Card[52];
		for (int suit = 0; suit < 4; suit++){
			for (int rank = 1; rank < 14; rank++){
				cards[(suit * 13) + rank - 1] = new Card(suit,rank); 
					
			}
		}
		String expected = "Hand: ";
		String actual ="Hand: ";
		for(int n =0; n< 52; n++){
		
		
			
			expected += cards[n].toString() + "; ";
			
			actual += deck.removeTopCard().toString() + "; ";
			assertEquals(expected, actual);	
			
			
		}
		
		
	}
	
}
