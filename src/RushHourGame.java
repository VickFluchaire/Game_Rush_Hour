
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
	
	// TODO rename field, update comment
	/**
	 * Tab of all vehicle of a game
	 */
	private Vehicle[] vehicle;
	
	// TODO detail comment (what is the plan?)
	/**
	 * Creates a new Rush Hour game, ready to be played 
	 * (all the cars and trucks are placed on the board, to place vehicles we use a plan )
	 */
	public RushHourGame()
	{
		this.board = new Board();
		this.vehicle = new Vehicle(***,***); //need to understand how we can use the atribut "color"
	}
	

	// TODO  clarify algorithm (ask for advice) 
	/**
	 * In each turn, the player can move just one vehicle, a new  movement will add one turn to the score  
	 * the vehicles can only move forward and backward, in all free cells. 
	 * The game ends when the player car escapes the traffic jam.
	 * 
	 * while(Game != Win)
	 * {
	 *		ask to player a movement
	 *		if(movement = ok)
	 *		{
	 * 			do movement
	 * 			Lap=Lap+1
	 * 		}
	 * 		else{return message impossible}
	 * }
	 */
	public void play()
	{
		// TODO write code here according to algorithm described in method comment
	}

}
