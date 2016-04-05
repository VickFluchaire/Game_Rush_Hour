
/**
 * This class represent a rush hour game
 * (https://fr.wikipedia.org/wiki/Rush_hour_%28casse-t%C3%AAte%29)
 * @author Rivoire, Mahe
 *
 */
public class RushHourGame
{
	private static final int NUMBER_OF_VEHICLES = 8;

	private static final int NUMBER_POSITION_CAR = 2;
	
	private static final int NUMBER_POSITION_TRUCK = 3;

	/**
	 * The game board
	 */
	private Board board;
	
	/**
	 * Vehicles (including red one)
	 */
	private Vehicle[] vehicles;
	
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
		Position RedCarposition1 = new Position(0,0);
		Position RedCarposition2 = new Position(0,2);
		Position[] positionsRedCar;
		//positionRedCar = new Position[NUMBER_POSITION_CAR];		
		Position positionRedCar[] = {RedCarposition1,RedCarposition2};
		
		this.board = new Board();
		this.vehicles = new Vehicle[NUMBER_OF_VEHICLES];
		Vehicle redCar = new Vehicle(1,positionRedCar);
		this.player = new Player();
	}
	

	public boolean gameIsOver()
	{
		// TODO to be completed
		return false;
	}
	
	public boolean mouvementValide(int color, Position[] position)
	{
		while(color != Vehicles.Vehicle.color[int indice = 0])
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
			
			int color = player.playerColor();
			int position = player.playerPosition();

				
	
			}
			while(mouvementValide())
				
		}
		// TODO write code here according to algorithm described in method comment
	}

}
