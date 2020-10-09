
public class SorryGame {
	private Player player;
	private Deck deck;
	private Square[] squares;
	
	public SorryGame(){
		this.deck = new Deck();
		createSquares();
		this.player = new Player("blue", squares[0]);
	}
	
	private void createSquares(){
		squares = new Square[60];
		
		//instantiate the squares
		for(int i=0; i<squares.length; i++) {
			squares[i] = new Square(i);
		}
		
		//set the "netxSquare" property
		for(int i=0; i<squares.length-1; i++) {
			Square currentSquare = squares[i];
			Square nextSquare = squares[i+1];
			currentSquare.setNextSquare(nextSquare);
		}
		squares[squares.length - 1].setNextSquare(squares[0]);
	}
	
	public void play() {
		for(int i=0; i<5; i++) {
			player.takeTurn(deck);
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args){
		SorryGame game = new SorryGame();
		game.play();
	}
}
