import java.util.Random;

/**
 * @author rivoireg, mahef
 *Enumeration who contain all direction of vehicles 
 */
public enum Direction
{
	/**
	 * the vertical direction
	 */
	VERTICAL,
	
	/**
	 * the horizontal direction
	 */
	HORIZONTAL;
	
	/**
	 * Methode who return a random direction
	 * @return a Direction
	 */
	public static Direction aleaDirection()
	{
		return Direction.values()[new Random().nextInt(Direction.values().length)];
	}		
}
