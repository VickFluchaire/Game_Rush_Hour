import java.util.Random;

/**
 * @author RIVOIRE Gaspard, MAHE Florian
 *This class represent the position of the vehicle
 */
public class Position
{

	/**
	 * Max values of the board
	 */
	private static final int MAX_SIZE = 6;
	
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

	public Position aleaPosition()
	{
		int x = new Random().nextInt(MAX_SIZE);
		int y = new Random().nextInt(MAX_SIZE);
		
		Position position = new Position(x,y);
		return position;
	}
	
	
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
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
