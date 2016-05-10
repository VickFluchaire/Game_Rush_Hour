
public class Movement
{
	
	private int direction;
	private Position position;
	private Movement movement;
	
	public Movement(Position position, int direction, Movement movement)
	{
		this.direction = direction;
		this.position = position;
		this.movement = movement;
	}	
}
