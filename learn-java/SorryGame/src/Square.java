
public class Square {
	private int number;
	private Square nextSquare;
	
	public Square(int theNumber) {
		number = theNumber;
	}
	
	public Square getNextSquare() {
		return nextSquare;
	}

	public void setNextSquare(Square nextSquare) {
		this.nextSquare = nextSquare;
	}

	public int getNumber() {
		return number;
	}
}
