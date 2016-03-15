// TODO (done) this class is not used elsewhere ... consider deleting it or using it

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
	
	/**
	 * This tab store position of a vehicles, he have 2(for cars) or 3(for trucks) values.
	 * They are a tab for each vehicles. 
	 */
	private int[] Position;

	/**
	 * create a new vehicle with his color and his position on the tab.
	 * @param color Color of the vehicle
	 * @param position position of the vehicle
	 */
	public Vehicle(int color, int[] position)
	{
		this.color = color;
		this.Position = position;
	}
	
	// TODO (done) if not all cars have three positions, consider using inheritance
	// to represents three-positions cars, or think about a different way
	// to handle positions
	
	
	
	
	
}	