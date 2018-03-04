package core;
import java.util.Scanner;

public class Movement implements IMovement {

	private int x;
	private int y;
	
	private int x1;
	private int y1;
	
	
	public void setCoord(int[] coord) {
		this.x = coord[1];
		this.y = coord[0];
		this.x1 = coord[3];
		this.y1 = coord[2];
	}
	
	public int[] getCoord() {
		int[] coord = {y, x, y1, x1};
		return coord;
	}
	
	public void askMovement(Player player) {
		
		int playerNum = player.getPlayerNum();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Turn for player: " + playerNum);
		
		System.out.println("Introduce the coordinates of the piece you want to move: ");
		System.out.println("X : ");
		int coordX = s.nextInt();
		System.out.println("Y : ");
		int coordY = s.nextInt();
		
		System.out.println("Introduce the coordinates of the new position: ");
		System.out.println("X : ");
		int coordX1 = s.nextInt();
		System.out.println("Y : ");
		int coordY1 = s.nextInt();
		
		//s.close();
		
		int[] coord = {coordX, coordY, coordX1, coordY1};
		
		setCoord(coord);
	
	}
	
	
	public int[][] movement(Board board_, Player player_) {
		
		int[][] board = board_.board;
		int player = player_.getPlayerNum();
		
		if(this.x>7 || this.y>7 || this.x1>7 || this.y1>7){
			throw new ExceptionIndexOutOfBounds("Coordinates are bigger than the board");
		}
		
		if(this.x<0 || this.y<0  || this.x1<0  || this.y1<0 ){
			throw new ExceptionIndexOutOfBounds("Coordinates are smaller than the board");
		}
		
		//check that the initial coord equal the correct player and that the final are empty
		if ((board[this.x][this.y] == player) && (board[this.x1][this.y1] == 0)) {
			//check that the movement is in diagonal
			if (Math.abs(this.x1 - this.x) == Math.abs(this.y1 - this.y)) {
				//checks that player 1 wants to move one step forward
				if((player == 1) && ((this.x1 - this.x) == 1)) {
					board[this.x][this.y] = 0;
					board[this.x1][this.y1] = player; 
				//checks that player 2 wants to move one step forward
				} else if ((player == 2) && ((this.x1 - this.x) == -1)) {
					board[this.x][this.y] = 0;
					board[this.x1][this.y1] = player; 
				}
			}
		}
		
		return board;		
	}
	
}
