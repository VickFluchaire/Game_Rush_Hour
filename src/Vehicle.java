
/**
 * This class represent a Vehicle, car or truck
 * @author RIVOIRE Gaspard, MAHE Florian
 *  
 */
public class Vehicle
{
	/**
	 * Color of the vehicle
	 */
	private int color;
	
	// TODO (done) rename field (not compliant with coding conventions)
	// TODO (done) consider gathering x/y in an object rather than in an array
	/**
	 * This tab store position of a vehicles, he have 2(for cars) or 3(for trucks) values.
	 * They are a tab for each vehicles. 
	 */
	private Position[] positionVehicle;

	/**
	 * create a new vehicle with his color and his position on the tab.
	 * @param color Color of the vehicle
	 * @param position position of the vehicle
	 */
	public Vehicle(int color, Position[] position)
	{
		this.color = color;
		this.positionVehicle = position;
	}
}	