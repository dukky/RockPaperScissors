import java.util.Collections;
import java.util.List;

/**
* A class that implements an ai player that uses information in the history
* of moves to attempt to predict the move the opponent is going to play and
* play the move that will beat it.
*/
public class HistoryAiPlayer extends AiPlayer {

	@Override
	public Move getMove() {
		//System.out.println(getHistory().size());
		Move randMove = super.getMove();
		if (getHistory().size() > 5 && Math.random() > 0.01) {
			int offset = (Math.min(getHistory().size(), 5));
			List<Move> lastFive = getHistory().subList(
					getHistory().size() - offset, getHistory().size());
			int pos = Collections.indexOfSubList(
					getHistory().subList(0, getHistory().size() - offset),
					lastFive);
			//System.out.println(pos);
			if (pos == -1) {
				return randMove;
			} else {
				return Move.beats(getHistory().get(pos + offset));
			}
		} else {
			return randMove;
		}
	}

}
