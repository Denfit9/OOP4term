package memento;

public class GameMemento {
	public int Field[][] = new int[3][3];
	public int MoveNumber;
	public GameMemento(int field[][], int moveNumber ) {
		for (int i =0; i<field.length;i++)
		{
			for (int j =0; j<field.length;j++) 
			{
				this.Field[i][j]=field[i][j];
			}
		}	
		this.MoveNumber=moveNumber;
	}
}
