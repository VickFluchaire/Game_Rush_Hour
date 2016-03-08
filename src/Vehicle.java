
/**
 * @author RIVOIRE Gaspard
 * @author MAHE Florian
 * This class represent a Vahicle, car or truck 
 */
public class Vehicle
{
	/**
	 * Color of the vehicle
	 */
	private int color;
	
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
