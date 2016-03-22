
/**
 * @author RIVOIRE Gaspard
 * @author MAHE Florian This class represent the class of the board
 */
public class Board
{

	// TODO fix comment
	// TODO explain what kind of value is stored in array cells
	/**
	 * Tab board who represent the suppor tof the game.
	 */
	private int[][] board;

	/**
	 * Create the board, 6 by 6, with all cell initialize at 0.
	 */
	public Board()
	{
		// TODO use constants
		this.board = new int[6][6];

		for (int indexX = 0; indexX < 6; indexX++)
		{
			for (int indexY = 0; indexY < 6; indexY++)
			{
				this.board[indexX][indexY] = 0;
			}
		}
	}

}
