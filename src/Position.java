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
	 * @throws positionOutOfBoardExeption exeption if X or Y are out of the board 
	 */
	public Position(int x0, int y0)
	{
	/*	if(y0<0 || y0>MAX_SIZE || x0<0 || x0>MAX_SIZE)
		{
			throw new positionOutOfBoardExeption();
		}
		else
		{
			this.x = x0;
			this.y = y0;
		}*/
		this.x = x0;
		this.y = y0;
	}

	/**
	 * @return a random Position
	 * @throws positionOutOfBoardExeption 
	 */
	public static Position aleaPosition() throws positionOutOfBoardExeption
	{
		int x = new Random().nextInt(MAX_SIZE);
		int y = new Random().nextInt(MAX_SIZE);
		
		Position position = new Position(x,y);
		return position;
	}
	
	
	
	/**
	 * a setter on the attribute X
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * a setter on the attribute Y
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * a getter on the attribute X
	 * @return the X of the position
	 */
	public int getX()
	{
		return this.x;
	}
	/**
	 * a getter on the attribute Y
	 * @return the Y of the position
	 */
	public int getY()
	{
		return this.y;
	}
	
	/**
	 * @param posi a position
	 * @return true if the two position are equal (they are equali if the their X are equal and their Y too)
	 */
	public boolean equals(Position posi)
	{
		if(posi.getX() == this.x && posi.getY() == this.y)
		{
			return true;
		}
		else {return false;}
	}
	
}