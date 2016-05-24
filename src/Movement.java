
/**
 * this class represent a vehicle's movement.
 * @author Rivoire, Mahe
 */
public class Movement
{
	
	/**
	 * direction of the vehicle
	 */
	private Direction direction;
	/**
	 * one of the positions of the vehicle chose for the movement 
	 */
	private Position position;
	/**
	 * number of cell for move forward or move back
	 */
	private int deplacement;
	
	
	/**
	 * A getter on the attribute direction
	 * @return a Direction
	 */
	public Direction getDirection() {
		return this.direction;
	}

	/**
	 * A getter on the attribute position
	 * @return a Position
	 */
	public Position getPosition() {
		return this.position;
	}

	/**
	 * A getter on the attribute deplacement
	 * @return a Deplacement
	 */
	public int getDeplacement() {
		return this.deplacement;
	}


	/**
	 * Constructor for a Movement
	 * @param position : one of the positions of the vehicle
	 * @param direction  : the direction of the vehicle
	 * @param deplacement : a number of cell for move (positiv for move forward and negatif for move back) 
	 */
	public Movement(Position position, Direction direction, int deplacement)
	{
		this.direction = direction;
		this.position = position;
		this.deplacement = deplacement;
	}	
}
