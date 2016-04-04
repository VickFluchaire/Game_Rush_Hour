
/**
 * This class reresents the board
 * // ...
 * @author RIVOIRE Gaspard, MAHE Florian 
 */
public class Board
{
	
	/**
	 * Default values of the board
	 */
	private final static int DEFAULT_SIZE = 6;
	/**
	 * Default value of a empty case of the board, represent by a 0
	 */
	private final static int DEFAULT_CASE = 0;
		

	/**
	 * Tab board who represent the support of the game. Fill of 1 or 0.
	 * 
	 */
	private int[][] board;

	/**
	 * Create the board, 6 by 6, with all cell initialize at 0.
	 */
	public Board()
	{
		this.board = new int[DEFAULT_SIZE][DEFAULT_SIZE];

		for (int indexX = 0; indexX < DEFAULT_SIZE; indexX++)
		{
			for (int indexY = 0; indexY < DEFAULT_SIZE; indexY++)
			{
				this.board[indexX][indexY] = DEFAULT_CASE;
			}
		}
	}

}
