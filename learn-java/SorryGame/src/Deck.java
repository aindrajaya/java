import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> drawPile;
	private List<Card> discardPile;
	
	public Deck(){
		drawPile = new ArrayList<>();
		discardPile = new ArrayList<>();
		
		//create the cards
		for(int value = 1; value <=12; value++) {
			for(int i=0; i<4; i++) {
				Card card;
				if(value == 4) {
					card = new ReverseCard(value);
				}else {
					card = new ForwardCard(value);
				}	
				drawPile.add(card);
			}
		}	
		Collections.shuffle(drawPile);
	}
	
	public Card draw(){
		if(drawPile.isEmpty()) {
			reshuffle();
		}
		Card card = drawPile.remove(0);
		discardPile.add(card); 
		return card;
	}

	private void reshuffle() {
		// TODO Auto-generated method stub
		drawPile.addAll(discardPile);
		discardPile.clear();
		Collections.shuffle(drawPile);
	}
}
