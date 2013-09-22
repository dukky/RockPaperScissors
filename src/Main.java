import java.util.Scanner;

public class Main {
	Player human;
	Player computer;
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	public void run() {
		int games = 0;
		boolean keepPlaying = true;
		while(keepPlaying) {
			games++;
			System.out.println("Game " + games + ": ");
			playGame();
			if(games > 100) keepPlaying = false;
//			if(new Scanner(System.in).nextLine().equals("n")) {
//				keepPlaying = false;
//			}
		}
		System.out.println("Human score: " + human.getScore());
		System.out.println("Computer score: " + computer.getScore());
	}
	
	public Main() {
		this.human = new HumanPlayer();
		this.computer = new HistoryAiPlayer();
	}
	
	public void playGame() {
		Move humanMove = null;
		Move computerMove = null;
		String winner = null;
		boolean decided = false;
		while(!decided) {
			humanMove = human.getMove();
			computerMove = computer.getMove();
			int result = humanMove.compareMove(computerMove);
			switch (result) {
			case 1:
				human.incrementScore();
				winner = "Human";
				decided = true;
				human.result(computerMove);
				computer.result(humanMove);
				break;
			case 0:
				decided = false;
				human.result(computerMove);
				computer.result(humanMove);
				break;
			case -1:
				computer.incrementScore();
				winner = "Computer";
				decided = true;
				human.result(computerMove);
				computer.result(humanMove);
				break;
			}
		}
		System.out.println("Human played " + humanMove.toString() + ", Computer played " + computerMove.toString() + ". Winner was " + winner + ". Keep playing? (y/n): ");
	}
}
