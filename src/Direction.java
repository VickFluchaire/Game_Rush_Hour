import java.util.Random;


public enum Direction
{
	HAUT,
	BAS,
	DROITE,
	GAUCHE;
	
	public Direction aleaDirection()
	{
		return Direction.values()[new Random().nextInt(Direction.values().length)];
	}		
}
