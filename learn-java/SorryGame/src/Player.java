
public class Player {
	private String color;
	private Piece piece;
	
	public Player(String color, Square startSquare) {
		this.color = color;
		this.piece = new Piece(1, startSquare);
	}
	
	public void takeTurn(Deck deck) {
		System.out.println("Player "+color+" is starting its turn");
		
		Card card = deck.draw();
		card.move(piece);
	}
}
