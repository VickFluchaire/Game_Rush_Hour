import java.util.Random;

/**
 * this class represent the player.
 * @author Rivoire, Mahe
 */
public class Player
{
	
	/**
	 * direction of the vehicle
	 */
	private Direction direction;
	/**
	 * one of the positions of the vehicle chose for the movement 
	 */
	private Position position;
	/**
	 * number of cell for move forward or move back
	 */
	private int deplacement;


	/**
	 * Take the value of the vehicle's color and the final positions choose by the player on keyboard
	 * @return the color and the positions of the car choose by the player
	 * @throws positionOutOfBoardExeption 
	 */ 
	public Movement aleaMovement() throws positionOutOfBoardExeption
	{		
		 
		this.direction = Direction.aleaDirection();
		this.position = Position.aleaPosition();
		Random deplacement = new Random();
		this.deplacement = -4 + deplacement.nextInt(8);
		Movement mvt = new Movement(this.position, this.direction, this.deplacement);
		return mvt;
		
	}
	
		
	/**
	 * @param positions : a position of a existing vehicle
	 * @return the head of the vehicle
	 * We suppose : for the vehicle who have a horizontal position : the head is  the position who have the highter X
	 * 				for the vehicle who have a vertical position : the head is  the position who have the highter Y
	 */
	public Position posiMax(Position[] positions)
	{
		Position positionMax = positions[0];
		for(int i=1; i<positions.length;i++)
		{
			if(positions[i].getX() == positionMax.getX())
			{
				if(positions[i].getY() > positionMax.getY())
				{
					positionMax = positions[i];
				}
			}
			else
			{
				if(positions[i].getX() > positionMax.getX())
				{
					positionMax = positions[i];
				}
			}
		}
		return positionMax;
	}
	
	
	/**
	 * @param positions : a position of a existing vehicle
	 * @return the bottom of the vehicle
	 * We suppose : for the vehicle who have a horizontal position : the bottom is  the position who have the lower X
	 * 				for the vehicle who have a vertical position : the bottom is  the position who have the lower Y
	 */
	public Position posiMin(Position[] positions)
	{
		Position positionMin = positions[0];
		for(int i=1; i<positions.length;i++)
		{
			if(positions[i].getX() == positionMin.getX())
			{
				if(positions[i].getY() < positionMin.getY())
				{
					positionMin = positions[i];
				}
			}
			else
			{
				if(positions[i].getX() < positionMin.getX())
				{
					positionMin = positions[i];
				}
			}
		}
		return positionMin;
	}
	
	
	
	/**
	 * @param position : a position of a existing vehicle
	 * @param deplacement : number of cell for move forward or move back
	 * @param vehicles : the tab of all vehicles
	 * @return true if the movement(position,  VERITCAL, deplacement) is available
	 * @throws positionOutOfBoardExeption 
	 */
	public boolean testmvtver(Position position, int deplacement, Vehicle[] vehicles) throws positionOutOfBoardExeption
	{
		if(deplacement>0)
		{
			for(int i = 1; i <= deplacement; i++)
			{
				Position posicurr = new Position(position.getX(), position.getY()+i);
				if(posicurr.getY()>=6)
				{
					return false;
				}
				else
				{
					for(int j=0; j<vehicles.length; j++)
					{
						Position positionsCurr[] = vehicles[j].getPositions();
						for(int k=0; k<positionsCurr.length;k++)
						{
							if(posicurr.equals(positionsCurr[k]))
							{
								return false;
							}
						}
					}
				}
			}
			return true;
		}
		else
		{
			for(int i = -1; i >= deplacement; i--)
			{
				Position posicurr = new Position(position.getX(), position.getY()+i);
				if(posicurr.getY()<0)
				{
					return false;
				}
				else
				{
					for(int j=0; j<vehicles.length; j++)
					{
						Position positionsCurr[] = vehicles[j].getPositions();
						for(int k=0; k<positionsCurr.length;k++)
						{
							if(posicurr.equals(positionsCurr[k]))
							{
								return false;
							}
						}
					}
				}
			}
			return true;
		}
	}
	
	/**
	 * @param position : a position of a existing vehicle
	 * @param deplacement : number of cell for move forward or move back
	 * @param vehicles : the tab of all vehicles
	 * @return true if the movement(position, HORIZONTAL, deplacement) is available
	 * @throws positionOutOfBoardExeption 
	 */	
	public boolean testmvthor(Position position, int deplacement, Vehicle[] vehicles) throws positionOutOfBoardExeption
	{
		if(deplacement>0)
		{
			for(int i = 1; i <= deplacement; i++)
			{
				Position posicurr = new Position(position.getX()+i, position.getY());
				if(posicurr.getX()>=6)
				{
					return false;
				}
				else
				{
					for(int j=0; j<vehicles.length; j++)
					{
						Position positionsCurr[] = vehicles[j].getPositions();
						for(int k=0; k<positionsCurr.length;k++)
						{
							if(posicurr.equals(positionsCurr[k]))
							{
								return false;
							}
						}
					}
				}
			}
			return true;
		}
		else
		{
			for(int i = -1; i >= deplacement; i--)
			{
				Position posicurr = new Position(position.getX()+i, position.getY());
				if(posicurr.getX()<0)
				{
					return false;
				}
				else
				{
					for(int j=0; j<vehicles.length; j++)
					{
						Position positionsCurr[] = vehicles[j].getPositions();
						for(int k=0; k<positionsCurr.length;k++)
						{
							if(posicurr.equals(positionsCurr[k]))
							{
								return false;
							}
						}
					}
				}
			}
			return true;
		}
	}
	

	
}