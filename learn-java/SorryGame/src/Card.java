
public class Card {
	private int value;
	
	public Card(int value) {
		this.value = value;
	}
	
	public void move(Piece piece) {
		System.out.println("Playing card of value "+value);
		
		Square position = piece.getPosition();
		for(int i=0; i<this.value; i++){
			position = position.getNextSquare();
		}
		piece.setPosition(position);
		
		piece.printLocation();
	}
}
