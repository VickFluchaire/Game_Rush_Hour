import java.util.Random;


public enum Direction
{
	VERTICAL,
	HORIZONTAL;
	
	public static Direction aleaDirection()
	{
		return Direction.values()[new Random().nextInt(Direction.values().length)];
	}		
}
