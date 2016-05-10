
/**
 * @author RIVOIRE Gaspard, MAHE Florian
 *This class represent the position of the vehicle
 */
public class Position
{

	/**
	 * the position x of the vehicle
	 */
	private int x;
	/**
	 * the position y of the vehicle
	 */
	private int y;
	
	/**
	 * @param x0 represent the x position choose by the player
	 * @param y0 represent the y position choose by the player
	 * Create a new position for a vehicle
	 */
	public Position(int x0, int y0)
	{
		this.x = x0;
		this.y = y0;
	}

	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}
	
	public boolean equals(Position posi)
	{
		if(posi.getX() == this.x && posi.getY() == this.y)
		{
			return true;
		}
		else {return false;}
	}
	
}
