
/**
 * This class represent a rush hour game
 * (https://fr.wikipedia.org/wiki/Rush_hour_%28casse-t%C3%AAte%29)
 * @author Rivoire, Mahe
 *
 */
public class RushHourGame
{
	/**
	 * The game board
	 */
	private Board board;
		
	/**
	 * Player of the game
	 */
	private Player player;
	
	// TODO (done)detail comment (what is the plan?)
	/**
	 * Creates a new Rush Hour game, ready to be played  
	 * (all the cars and trucks are placed on the board and the player is ready. To place the vehicles we use a default plan)
	 * http://www.thinkfun.com/wp-content/uploads/1996/09/rush-hour-howtoplay.jpg*/
	public RushHourGame()
	{		
		this.board = new Board();
		this.player = new Player();
	}
	

	/**
	 * Test if the game is over
	 * @return true if the game is over
	 */
	public boolean gameIsOver()
	{
		// TODO to be completed
		return false;
	}
	
	/**
	 * Test if the movement choose by the player  can be realize 
	 * @param color of a vehicle
	 * @param position of a vehicle
	 * @return true if the movement is allow 
	 */
	public boolean mouvementTest(int color, Position[] position)
	{
		int indice = 0;
		while(color != Vehicles.Vehicle.color[indice])
		{
			indice++;
		}
		
		
		return true;
	}
	/**
	 * In each turn, the player can move just one vehicle, a new  movement will add one turn to the score  
	 * the vehicles can only move forward and backward, in all free cells. 
	 * The game ends when the player car escapes the traffic jam.
	 * 
	 * while(<Game != Win>)
	 * {
	 * 		do
	 * 		{
	 *			<ask to player a movement>
	 *		} 
	 *		while (<movement is not valid>)
	 *		
	 *		<do the movement>
	 * 		<count the laps>
	 * }
	 */
	public void play()
	{
		while(!gameIsOver() )
		{
			do 
			{
			

				
	
			}
			while(mouvementTest())
				
		}
		// TODO write code here according to algorithm described in method comment
	}

}
