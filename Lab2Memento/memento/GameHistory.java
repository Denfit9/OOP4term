package memento;

import java.util.Stack;

public class GameHistory {
	public Stack<GameMemento> history; 
	
	public GameHistory() {
		history = new Stack<GameMemento>();
	}

	
}
