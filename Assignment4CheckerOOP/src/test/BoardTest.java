package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import core.Board;

public class BoardTest {
	

	@Test
	public void testBoard() {
		Board board = new Board();
		assertNotNull(board.board);
	}

	@Test
	public void testDisplayBoard() {
		Board board = new Board();
		board.displayBoard();		
	}

}
