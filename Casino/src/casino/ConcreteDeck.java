package casino;



public class ConcreteDeck  implements Deck{

	private Card[] cards = null; 
	private int index = 0;
	
	/*
	 * public Constructor with arguments.
	 */
	public ConcreteDeck() {
		
		this.cards = new Card[52];
		for (int suit = 0; suit < 4; suit++){
			for (int rank = 1; rank < 14; rank++){
				cards[(suit * 13) + rank - 1] = new Card(suit,rank); 
				
				
			}
		}
	} 

	
	/*
	 * returns a String representation of the array of Card
	 * e.g Ace of Clubs, Two of Clubs, Three of Clubs,..
	 */
	public String toString(){
		String cardNames = "";
		for(int i =0; i< cards.length; i++){
			cardNames += cards[i].toString() +", ";
		}
		return cardNames;
	}
	
	
	@Override
	public void shuffle(){
		//TODO 
		//To get a random position in the deck you could use the math.random() function
		
		for(int i =0; i< cards.length; i++){
			int pos1 = (int)(Math.random()*52);
			Card temp = cards[i];
			cards[i] = cards[pos1];
			cards[pos1] = temp;	
		}
		
		
	}
	
	
	@Override
	public Card removeTopCard(){
		
		
		return cards[index++];
	}
	
}


