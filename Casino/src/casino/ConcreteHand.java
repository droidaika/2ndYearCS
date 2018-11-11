package casino;

public class ConcreteHand  implements Hand{
	
	private Card[] cards;
	int index;
	

	public ConcreteHand(int n){
		
		this.cards = new Card[n];
		index = 0;
		
	}
	
	
	/*
	 * This method adds a Card to the cards array
	 */
	
	public void addCard(Card card){
		//TODO you need to insert a Card to the array
		//You'll need to have kept track of how many cards have been added already
		//so that you add the card in the right place (i.e. immediately after the last added one)
		cards[index++] = card;
	}
	
	/*
	 * This method prints out the hand
	 * e.g. Ace of Clubs, 3 of Diamonds, Jack of Hearts, etc
	 */
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.print("Hand: ");
		for(int i = 0; i < cards.length; i++){
			System.out.print(cards[i].toString() + "; ");
		}
		System.out.println();
	}

}
