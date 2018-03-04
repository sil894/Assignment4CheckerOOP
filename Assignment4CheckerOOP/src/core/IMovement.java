package core;

public interface IMovement {
	
	public void askMovement(Player player);
	
	public int[][] movement(Board board, Player player);

}
