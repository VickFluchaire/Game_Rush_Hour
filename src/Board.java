// TODO (done) this class is not used elsewhere ... consider deleting it or using it
/**
 * @author RIVOIRE Gaspard
 * @author MAHE Florian 
 *This class represent the class of the board
 */
public class Board
{

	private int[][] board;
	
	
public Board() 
{
	this.board = new int[6][6];
	
	for(int indexX = 0; indexX<6; indexX++)
	{
		for(int indexY = 0; indexY<6; indexY++)
		{
			this.board[indexX][indexY]= 0;
		}
	}
}
	
	
}
