package core;

public class Board implements IBoard{
	
	public int[][] board;
	
	//Initial board setup
	public Board() {
		
		int[][] check = {
				{0,1,0,1,0,1,0,1},
				{1,0,1,0,1,0,1,0},
				{0,1,0,1,0,1,0,1},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{2,0,2,0,2,0,2,0},
				{0,2,0,2,0,2,0,2},
				{2,0,2,0,2,0,2,0},
			};
		
		this.board = check;

	}
	
	//Displaying the board
	public void displayBoard() {
		
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				System.out.printf("%5d", board[x][y]);
			      }
			      System.out.println();
			}
		
	}

}
