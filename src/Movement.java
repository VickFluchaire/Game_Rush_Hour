
public class Movement
{
	private static final int HAUT = 1 ;
	private static final int BAS = 2;
	private static final int DROITE = 3;
	private static final int GAUCHE = 4;
	
	private int direction;
	private Position position;
	private int movement;
	
	public Movement(Position position, int direction, int movement)
	{
		this.direction = direction;
		this.position = position;
		this.movement = movement;
	}	
}
