import java.util.Random;


/**
 * @author rivoireg, mahef
 *Enumeration who contain all vehicles color
 */
public enum Color
{
	/**
	 * the color of the red car
	 */
	RED,
	
	/**
	 * the color of the blue car
	 */
	BLUE,
	/**
	 * the color of the yellow car
	 */
	YELLOW,
	/**
	 * the color of the green car
	 */
	GREEN,
	/**
	 * the color of the orange car
	 */
	ORANGE,
	/**
	 * the color of the black car
	 */
	BLACK,
	/**
	 * the color of the purple car
	 */
	PURPLE,
	/**
	 * the color of the brown car
	 */
	BROWN;
	
	/**
	 * Methode who return a random color.
	 * @return a Color
	 */
	public Color aleaColor()
	{
		return Color.values()[new Random().nextInt(Color.values().length)];
	}		
}

