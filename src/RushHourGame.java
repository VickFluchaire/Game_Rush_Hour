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
	
	/**
	 * Creates a new Rush Hour game, ready to be played  
	 * (all the cars and trucks are placed on the board and the player is ready. To place the vehicles we use a default plan)
	 * http://www.thinkfun.com/wp-content/uploads/1996/09/rush-hour-howtoplay.jpg
	 * @throws positionOutOfBoardExeption  */
	public RushHourGame() throws positionOutOfBoardExeption
	{		
		this.board = new Board();
		this.player = new Player();
	}
	
	/**
	 * @param movement : a movement
	 * @return true if the movement available
	 * @throws positionOutOfBoardExeption 
	 */
	public boolean movementTest(Movement movement) throws positionOutOfBoardExeption
	{
		Vehicle[] vehicles = this.board.getVehicles();
		Position position = movement.getPosition();		
		for(int i=0; i<vehicles.length; i++)
		{
			Position positionCurrs[] = vehicles[i].getPositions();
			
			for(int j = 0; j<positionCurrs.length; j++)
			{
				if(positionCurrs[j].equals(position))
				{ 
					if(movement.getDirection() == vehicles[i].getDirection())
					{
						if(movement.getDeplacement() > 0)
						{
							Position posimax = this.player.posiMax(positionCurrs); 
													
							if(movement.getDirection() == Direction.VERTICAL)
							{
								return this.player.testmvtver(posimax, movement.getDeplacement(), vehicles);
							}
							else
							{
								return this.player.testmvthor(posimax, movement.getDeplacement(), vehicles);
							}
						}
						if(movement.getDeplacement() < 0)
						{
							Position posimin = this.player.posiMin(positionCurrs);
							if(movement.getDirection() == Direction.VERTICAL)
							{
								return this.player.testmvtver(posimin, movement.getDeplacement(), vehicles);
							}
							else
							{
								return this.player.testmvthor(posimin, movement.getDeplacement(), vehicles);
							}															
						}
					}
				}
			}
		}
		return false;
	}
	
	
	/**
	 * Methode for update the position of a vehicle on the board 
	 * @param movement : a movement
	 * @return true if the movement is update
	 */
	public boolean updateMovement(Movement movement)
	{
		Vehicle[] vehicles = this.board.getVehicles();
		Position positionCurr = movement.getPosition();
		
		for(int i=0; i<vehicles.length; i++)
		{
			Position tabPositions[] = vehicles[i].getPositions();
			for(int j = 0; j<tabPositions.length; j++)
			{
				if(tabPositions[j].equals(positionCurr))
				{
					if(movement.getDirection() == Direction.HORIZONTAL)
					{
						for(int k = 0; k<tabPositions.length; k++)
						{
							tabPositions[k].setX(tabPositions[k].getX() + movement.getDeplacement());
						}
					this.board.toString();
					return true;
					}
					
					if(movement.getDirection() == Direction.VERTICAL)
					{
						for(int k = 0; k<tabPositions.length; k++)
						{
							tabPositions[k].setY(tabPositions[k].getY() + movement.getDeplacement());
						}
					 this.board.toString();
					 return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * In each turn, the player can move just one vehicle, a new movement will add one turn to the score  
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
	 * @throws positionOutOfBoardExeption 
	 */
	public void play() throws positionOutOfBoardExeption
	{
		int laps = 0;
		this.board.toString();	
		//Position posi =  new Position(5,4);
		//Movement test = new Movement(posi, Direction.VERTICAL,1);
		while(this.board.redCarOnExit() != true )
		{
			
			Movement movementPlayer = this.player.aleaMovement();
			while(movementTest(movementPlayer) == false)
			{
				movementPlayer = this.player.aleaMovement();
			}
			updateMovement(movementPlayer);
			laps ++;
		}
		System.out.println("Vous avez gagné en "+laps+"coups");
	}

	
}