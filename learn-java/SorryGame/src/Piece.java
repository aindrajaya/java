
public class Piece {
	private int number;
	private Square position;
	
	public Piece(int number, Square thePosition) {
		this.number = number;
		this.position = thePosition;	
	}
	
	public void printLocation() {
		System.out.println("Piece "+number+" is on square "+position.getNumber());
	}

	public Square getPosition() {
		return position;
	}

	public void setPosition(Square position) {
		this.position = position;
	}
}
