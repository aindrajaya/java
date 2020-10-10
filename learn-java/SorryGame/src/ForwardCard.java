
public class ForwardCard extends AbstractCard {
	public ForwardCard(int value) {
		super(value);
	}
	
	@Override
	protected Square findFollowingSquare(Square position) {
		return position.getNextSquare();
	}
}
