package test;

import core.Player;
import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testChangePlayer1() {
		Player player = new Player(1);
		player.changePlayer();

		assertEquals(player.getPlayerNum(), 2);
	}
	
	@Test
	public void testChangePlayer2() {
		Player player = new Player(2);
		player.changePlayer();

		assertEquals(player.getPlayerNum(), 1);
	}

}
