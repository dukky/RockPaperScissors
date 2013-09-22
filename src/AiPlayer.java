import java.util.ArrayList;
import java.util.Random;


public class AiPlayer extends Player {
	
	private ArrayList<Move> history;
	
	public AiPlayer() {
		super();
		this.history = new ArrayList<>();
	}
	
	public Move getMove() {
		Random rand = new Random();
		return Move.values()[rand.nextInt(Move.values().length)];
		
	}
	
	public void result(Move oppMove) {
		history.add(oppMove);
	}
	
	public ArrayList<Move> getHistory() {
		return history;
	}
	
	public static void main(String[] args) {
		AiPlayer aiplayer = new AiPlayer();
	
	}
}

