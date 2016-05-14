import java.util.Random;


public enum Direction
{
	VERTICAL,
	HORIZONTAL;
	
	public Direction aleaDirection()
	{
		return Direction.values()[new Random().nextInt(Direction.values().length)];
	}		
}
