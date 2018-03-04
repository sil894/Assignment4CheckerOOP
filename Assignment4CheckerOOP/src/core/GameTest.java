package core;

public class GameTest {

	public static void main(String[] args) {
		
		Board board = new Board();
		Player player = new Player(1);
		Movement move = new Movement();
		
		while(true) {
			board.displayBoard();
			
			move.askMovement(player);
			
			move.movement(board, player);
			
			player.changePlayer();
		}
		
		

	}

}
