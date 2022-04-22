package tictactoe;

import java.util.Scanner;
import memento.*;

public class TicTacToe {
int field [][] = new int[][] {{2,2,2},
							  {2,2,2},
							  {2,2,2}};
int moveNumber = 0;

Scanner scanner = new Scanner(System.in);

public void showField() 
{
	for (int i = 0 ; i <= 2; i++)
	{
		for (int j = 0; j <= 2 ; j++)
		{
			if(j <2)
			{
			System.out.print(field[i][j]==1? "0|" :field[i][j]==0?"x|":" |");
			}else { 
				System.out.print(field[i][j]==1? "0" :field[i][j]==0?"x":" ");
			}
		}
		if (i<2) 
		{
		System.out.print("\n-----\n");
		}
	}
}
	
public void enterSymbol() 
{
	int entered = 0;
	boolean correctInput = false;
	while (correctInput == false)
	{
		entered = scanner.nextInt();
		
		switch(entered)
		{
			case 1:
				if (field[0][0]==2) 
				{
					field[0][0]=moveNumber%2;
					correctInput = true;
				}else {
					System.out.print("This place is already occupied\n");
				}
				break;
			case 2:
				if (field[0][1]==2) 
				{
					field[0][1]=moveNumber%2;
					correctInput = true;
				}else {
					System.out.print("This place is already occupied\n");
				}
				break;
			case 3:
				if (field[0][2]==2) 
				{
					field[0][2]=moveNumber%2;
					correctInput = true;
				}else {
					System.out.print("This place is already occupied\n");
				}
				break;
			case 4:
				if (field[1][0]==2) 
				{
					field[1][0]=moveNumber%2;
					correctInput = true;
				}else {
					System.out.print("This place is already occupied\n");
				}
				break;	
			case 5:
				if (field[1][1]==2) 
				{
					field[1][1]=moveNumber%2;
					correctInput = true;
				}else {
					System.out.print("This place is already occupied\n");
				}
				break;
			case 6:
				if (field[1][2]==2) 
				{
					field[1][2]=moveNumber%2;
					correctInput = true;
				}else {
					System.out.print("This place is already occupied\n");
				}
				break;
			case 7:
				if (field[2][0]==2) 
				{
					field[2][0]=moveNumber%2;
					correctInput = true;
				}else {
					System.out.print("This place is already occupied\n");
				}
				break;
			case 8:
				if (field[2][1]==2) 
				{
					field[2][1]=moveNumber%2;
					correctInput = true;
				}else {
					System.out.print("This place is already occupied\n");
				}
				break;
			case 9:
				if (field[2][2]==2) 
				{
					field[2][2]=moveNumber%2;
					correctInput = true;
				}else {
					System.out.print("This place is already occupied\n");
				}
				break;
			default:
				System.out.print("Somethig happened with your input\n");
				break;
	}
	}
}
public boolean checkWin() 
{
	if (field [0][0]== field[0][1] && field[0][1] ==  field[0][2] && field[0][0]!=2) 
	{
		if(field[0][0]==0) 
		{
			System.out.print("Player one won\n");
			showField();
			return true;
		}else {
			System.out.print("Player two won\n");
			showField();
			return true;}
	}else if (field [0][0]== field[1][0] && field[1][0] ==  field[2][0] && field[0][0]!=2)
	{
		if(field[0][0]==0) 
		{
			System.out.print("Player one won\n");
			showField();
			return true;
		}else {
			System.out.print("Player two won\n");
			showField();
			return true;}
	}else if (field [0][0]== field[1][1] && field[1][1] ==  field[2][2] && field[0][0]!=2)
	{
		if(field[0][0]==0) 
		{
			System.out.print("Player one won\n");
			showField();
			return true;
		}else {
			System.out.print("Player two won\n");
			showField();
			return true;}
	}else if (field [2][0]== field[2][1] && field[2][1] ==  field[2][2] && field[2][0]!=2)
	{
		if(field[2][0]==0) 
		{
			System.out.print("Player one won\n");
			showField();
			return true;
		}else {
			System.out.print("Player two won\n");
			showField();
			return true;}
	}else if (field [0][2]== field[1][2] && field[1][2] ==  field[2][2] && field[0][2]!=2)
	{
		if(field[0][2]==0) 
		{
			System.out.print("Player one won\n");
			showField();
			return true;
		}else {
			System.out.print("Player two won\n");
			showField();
			return true;}
	}else if (field [2][0]== field[1][1] && field[1][1] ==  field[0][2]&& field[2][0]!=2)
	{
		if(field[2][0]==0) 
		{
			System.out.print("Player one won\n");
			showField();
			return true;
		}else {
			System.out.print("Player two won\n");
			showField();
			return true;}
	}else if (field [1][0]== field[1][1] && field[1][1] ==  field[1][2]&& field[1][0]!=2)
	{
		if(field[1][0]==0) 
		{
			System.out.print("Player one won\n");
			showField();
			return true;
		}else {
			System.out.print("Player two won\n");
			showField();
			return true;}
	}else if (field [0][1]== field[1][1] && field[1][1] ==  field[2][1]&& field[1][1]!=2)
	{
		if(field[0][1]==0) 
		{
			System.out.print("Player one won\n");
			showField();
			return true;
		}else {
			System.out.print("Player two won\n");
			showField();
			return true;}
	}else if(moveNumber == 9) 
	{
		System.out.print("Draw\n");
		showField();
		return true;
	}else {return false;}
	
}
public GameMemento saveState() 
{
	return new GameMemento(field,moveNumber);
}
public void restoreState(GameMemento memento)
{
	this.field = memento.Field;
	this.moveNumber = memento.MoveNumber;
	System.out.print("\nGame restored\n");
}
}
