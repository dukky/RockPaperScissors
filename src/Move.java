
public enum Move {
	ROCK, PAPER, SCISSORS;
	
	public int compareMove(Move otherMove) {
		if(this.equals(otherMove)) {
			return 0;
		} else {
	        switch (this) {
	        case ROCK:
	            return (otherMove == SCISSORS ? 1 : -1);
	        case PAPER:
	            return (otherMove == ROCK ? 1 : -1);
	        case SCISSORS:
	            return (otherMove == PAPER ? 1 : -1);
	        }
		}
		return 0;
	}
	
	public static Move beats(Move move) {
		switch (move) {
		case PAPER:
			return SCISSORS;
		case ROCK:
			return PAPER;
		case SCISSORS:
			return ROCK;		
		}
		
		//should never happen
		return move;
	}
	
	public static void main(String[] args) {
		System.out.println(Move.ROCK.compareMove(Move.PAPER));
	}
}
