
public class ReverseCard extends AbstractCard {
	public ReverseCard(int value) {
		super(value);
	}
	
	@Override
	protected Square findFollowingSquare(Square position) {
		return position.getPreviousSquare();
	}
}
