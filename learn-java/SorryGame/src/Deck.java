
public class Deck {
	private Card card;
	
	public Deck(){
		card = new Card(3);
	}
	
	public Card draw(){
		return card;
	}
}
