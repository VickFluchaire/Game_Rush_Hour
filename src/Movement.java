
public class Movement
{
	
	private Direction direction;
	private Position position;
	private int deplacement;
	
	
	public Direction getDirection() {
		return direction;
	}


	public Position getPosition() {
		return position;
	}


	public int getDeplacement() {
		return deplacement;
	}


	public Movement(Position position, Direction direction, int deplacement)
	{
		this.direction = direction;
		this.position = position;
		this.deplacement = deplacement;
	}	
}
