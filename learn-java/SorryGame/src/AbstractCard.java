
public abstract class AbstractCard implements Card{
	private int value;
	
	public AbstractCard(int v) {
		this.value = v;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public void move(Piece piece) {
		System.out.println("Playing card of value "+value);
		
		Square position = piece.getPosition();
		for(int i=0; i<this.value; i++){
			position = findFollowingSquare(position);
		}
		piece.setPosition(position);
		
		piece.printLocation();
	}
	
	protected abstract Square findFollowingSquare(Square position);
}
