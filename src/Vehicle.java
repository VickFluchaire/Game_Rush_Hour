
/**
 * This class represent a Vehicle, car or truck
 * @author RIVOIRE Gaspard, MAHE Florian
 *  
 */
public class Vehicle
{
	
	/**
	 * Color of the vehicle (value taken from constants above)
	 */
	private Color color;
	
	public Color getColor()
	{
		return color;
	}


	/**
	 * vehicle's positions (2 for cars, 3 for trucks).
	 */
	private Position[] positions;
	
	private Direction direction;
	

	public Direction getDirection() {
		return direction;
	}


	public Position[] getPositions()
	{
		return positions;
	}


	/**
	 * create a new vehicle with his color and his positions on the board
	 * @param color Color of the vehicle
	 * @param positions positions of the vehicle
	 */
	public Vehicle(Color color, Position[] positions, Direction direction)
	{
		this.color = color;
		this.positions = positions;
		this.direction = direction;
	}
}	