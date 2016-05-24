
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
	
	/**
	 * @return the color of the vehicle
	 */
	public Color getColor()
	{
		return this.color;
	}


	/**
	 * vehicle's positions (2 for cars, 3 for trucks).
	 */
	private Position[] positions;
	
	/**
	 * vehicle's direction (VERTICAL or HORIZONTAL)
	 */
	private Direction direction;
	

	/**
	 * @return the vehicle's direction
	 */
	public Direction getDirection() {
		return this.direction;
	}


	/**
	 * @return the tab Positions of all position of the vehicle
	 */
	public Position[] getPositions()
	{
		return this.positions;
	}


	/**
	 * create a new vehicle with his color and his positions on the board
	 * @param color Color of the vehicle
	 * @param positions Positions of the vehicle
	 * @param direction Direction of the vehicle
	 */
	public Vehicle(Color color, Position[] positions, Direction direction)
	{
		this.color = color;
		this.positions = positions;
		this.direction = direction;
	}
}	