import java.util.Scanner;

public class HumanPlayer extends Player {
	Scanner s;

	public HumanPlayer() {
		super();
		this.s = new Scanner(System.in);
	}

	@Override
	public Move getMove() {
		System.out.print("What is your move? (r/p/s): ");
		while (true) {
			String move = s.nextLine();
			move = move.toUpperCase();
			if (!(move.equals("R") || move.equals("P") || move.equals("S"))) {

			}
			if ("R".equals(move)) {
				return Move.ROCK;
			} else if ("P".equals(move)) {
				return Move.PAPER;
			} else if ("S".equals(move)) {
				return Move.SCISSORS;
			} else {
				System.out.print("Invalid input, please enter only 'r', 'p' or 's': ");
			}
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println(new HumanPlayer().getMove());
		}
	}
}
