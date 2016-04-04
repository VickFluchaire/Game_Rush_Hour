
/**
 * This class represent a Vehicle, car or truck
 * @author RIVOIRE Gaspard, MAHE Florian
 *  
 */
public class Vehicle
{
	// TODO use an enumeration called Color
	public final static int RED = 1;
	public final static int BLUE = 2;
	public final static int YELLOW = 3;
	public final static int GREEN = 4;
	public final static int ORANGE = 5;
	public final static int BLACK = 6;
	public final static int PURPLE = 7;
	public final static int BROWN = 8;
	
	/**
	 * Color of the vehicle (value taken from constants above)
	 */
	private int color;
	
	
	// TODO (done) consider gathering x/y in an object rather than in an array
	/**
	 * vehicle's positions (2 for cars, 3 for trucks).
	 */
	private Position[] positions;

	/**
	 * create a new vehicle with his color and his positions on the board
	 * @param color Color of the vehicle
	 * @param positions positions of the vehicle
	 */
	public Vehicle(int color, Position[] positions)
	{
		this.color = color;
		this.positions = positions;
	}
}	