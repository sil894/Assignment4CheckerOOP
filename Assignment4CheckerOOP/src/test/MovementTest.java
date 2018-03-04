package test;

import core.Movement;
import core.Player;
import core.Board;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovementTest {

	@Test
	public void testSetCoord() {
		Movement move = new Movement();
		int[] expectedCoord = {1,2,3,4};
		move.setCoord(expectedCoord);
		int[] actualCoord = move.getCoord();
		assertEquals(expectedCoord[0], actualCoord[0] );
		assertEquals(expectedCoord[1], actualCoord[1] );
		assertEquals(expectedCoord[2], actualCoord[2] );
		assertEquals(expectedCoord[3], actualCoord[3] );
	}


	@Test
	public void testAskMovement() {
		Movement move = new Movement();
		Player player = new Player(1);
		
		move.askMovement(player);
		
		assertNotNull(move);
		//Introduce Coord Y = 5
		assertEquals(move.getCoord()[0], 5);	
	}

	@Test
	public void testMovementValid() {
		
		int[] validCoord = {3,2,4,3};
		
		Board board = new Board();
		Player player = new Player(1);
		Movement move = new Movement();
		
		move.setCoord(validCoord);
		move.movement(board, player);
		
	    assertEquals((board.board[move.getCoord()[3]][move.getCoord()[2]]),player.getPlayerNum());
		
	}
	
	@Test
	public void testMovementValidPlayer2() {
		
		int[] validCoord = {0,5,1,4};
		
		Board board = new Board();
		Player player = new Player(2);
		Movement move = new Movement();
		
		move.setCoord(validCoord);
		move.movement(board, player);
		
	    assertEquals((board.board[move.getCoord()[3]][move.getCoord()[2]]),player.getPlayerNum());
		
	}
	
	@Test
	public void testMovementNotValid() {
		
		int[] validCoord = {0,0,0,1};
		
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
		
		Board board = new Board();
		Player player = new Player(1);
		Movement move = new Movement();
		
		move.setCoord(validCoord);
		move.movement(board, player);
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				assertEquals(board.board[i][j], check[i][j]);
			}
		}
	    
	}
	
	@Test
	public void testMovementNotValidNewCoordOccupied() {
		
		int[] validCoord = {0,1,1,2};
		
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
		
		Board board = new Board();
		Player player = new Player(1);
		Movement move = new Movement();
		
		move.setCoord(validCoord);
		move.movement(board, player);
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				assertEquals(board.board[i][j], check[i][j]);
			}
		}
	    
	}

	@Test
	public void testMovementNotValidMoveNotDiagonal() {
		
		int[] validCoord = {0,1,0,2};
		
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
		
		Board board = new Board();
		Player player = new Player(1);
		Movement move = new Movement();
		
		move.setCoord(validCoord);
		move.movement(board, player);
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				assertEquals(board.board[i][j], check[i][j]);
			}
		}
	    
	}

	@Test
	public void testMovementNotValidMoveLongerThan1Step() {
		
		int[] validCoord = {1,2,3,4};
		
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
		
		Board board = new Board();
		Player player = new Player(1);
		Movement move = new Movement();
		
		move.setCoord(validCoord);
		move.movement(board, player);
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				assertEquals(board.board[i][j], check[i][j]);
			}
		}
	    
	}
	
	@Test
	public void testMovementNotValidPlayer2() {
		
		int[] validCoord = {0,5,2,3};
		
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
		
		Board board = new Board();
		Player player = new Player(2);
		Movement move = new Movement();
		
		move.setCoord(validCoord);
		move.movement(board, player);
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				assertEquals(board.board[i][j], check[i][j]);
			}
		}
	    
	}
	
	@Test
	public void testMovementNotValidPlayer3() {
		
		int[] validCoord = {0,5,2,3};
		
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
		
		Board board = new Board();
		Player player = new Player(3);
		Movement move = new Movement();
		
		move.setCoord(validCoord);
		move.movement(board, player);
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				assertEquals(board.board[i][j], check[i][j]);
			}
		}
	    
	}
}
