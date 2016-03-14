// TODO this class is not used elsewhere ... consider deleting it or using it

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
	
	// TODO if not all cars have three positions, consider using inheritance
	// to represents three-positions cars, or think about a different way
	// to handle positions
	/**
	 *First position of vehicle  
	 */
	private int pos1; 
	
	/**
	 * Second position of vehicle
	 */
	private int pos2;
	
	/**
	 * Third position of the vehicle, only for trucks
	 */
	private int pos3;

	/**
	 * Creat a car
	 * @param color Color of the car
	 * @param p1 First position of the car
	 * @param p2 Second position of the car
	 */
	public Vehicle(int color, int p1, int p2)
	{
		this.color = color;
		this.pos1 = p1;
		this.pos2 = p2;		
	}
	
	/**
	 * Creat a truck
	 * @param color
	 * @param p1 First position of the truck
	 * @param p2 Second position of the truck
	 * @param p3 Third position of the truck
	 */
	public Vehicle(int color, int p1, int p2, int p3)
	{
		this.color = color;
		this.pos1 = p1;
		this.pos2 = p2;	
		this.pos3 = p3;
	}
	
}
