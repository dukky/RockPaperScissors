
public abstract class Player {
	private int score;
	
	public Player() {
		this.score = 0;
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
	
	public void result(Move move) {
		
	}
	
	public abstract Move getMove();
}
