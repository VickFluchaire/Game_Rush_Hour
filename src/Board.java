
/**
 * @author RIVOIRE Gaspard
 * @author MAHE Florian This class represent the class of the board
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
	 * Default value of a vehicle on the board, represent by a 1
	 */
	private final static int DEFAULT_VEHICLES = 1;
	// TODO (done) fix comment
	// TODO (done) explain what kind of value is stored in array cells
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
		// TODO (done) use constants
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
