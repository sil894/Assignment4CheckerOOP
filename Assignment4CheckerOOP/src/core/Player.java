package core;

public class Player implements IPlay {
	
	private int playerNum;
	
	public Player(int playerNum) {
		this.playerNum = playerNum;
	}

	public int getPlayerNum() {
		return this.playerNum;
	}
	
	public void changePlayer() {
		
		if (this.playerNum == 1) {
			this.playerNum = 2; } else {
				this.playerNum = 1; }

	}
}
