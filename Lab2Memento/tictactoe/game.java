package tictactoe;
import memento.*;
import java.util.Scanner;

public class game {
	TicTacToe play = new TicTacToe();
	
	GameHistory gameHistory = new GameHistory();
	
	Scanner scanner = new Scanner(System.in);
	
public void startGame() {
	while(play.checkWin() == false) {
		int entered=' ';
		gameHistory.history.push(play.saveState());
		play.showField();
		play.enterSymbol();
		play.moveNumber++;
		for (int i = 0; i<10; i++) 
		{
			System.out.println();
		}
		
		System.out.print("\nType '1' if you want to take  a step back or '2' if you want to continue playing\n");
		play.showField();
		boolean enteredCorrect = false;
		while(enteredCorrect == false) {
			entered = scanner.nextInt();
		switch(entered) 
		{
		case 1:
			if(gameHistory.history.isEmpty())
			{
				System.out.print("\n\nNo steps back available. The game will be continued\n");
				enteredCorrect = true;
			}else {
			play.restoreState(gameHistory.history.pop());
			enteredCorrect = false;
			System.out.print("\nType '1' if you want to take  a step back or '2' if you want to continue playing\n");
			play.showField();
			}
			break;
		case 2:
			System.out.print("\nGame continued\n\n\n\n");
			enteredCorrect = true;
			break;
		default:
			System.out.print("\nTry again\n");
			break;
		}
		}	
	}
}
}
