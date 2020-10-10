
public class Square {
	private int number;
	private Square nextSquare;
	private Square previousSquare;
	
	public Square(int theNumber) {
		number = theNumber;
	}
	
	public Square getNextSquare() {
		return nextSquare;
	}

	public void setNextSquare(Square nextSquare) {
		this.nextSquare = nextSquare;
		nextSquare.setPreviousSquare(this);
	}

	public int getNumber() {
		return number;
	}

	public Square getPreviousSquare() {
		return previousSquare;
	}

	public void setPreviousSquare(Square previousSquare) {
		this.previousSquare = previousSquare;
	}
}
