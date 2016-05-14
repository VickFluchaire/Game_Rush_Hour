import java.util.Random;

/**
 * this class represent the player.
 * @author Rivoire, Mahe
 */
public class Player
{
	
	private Direction direction;
	private Position position;
	private int deplacement;


	/**
	 * Take the value of the vehicle's color and the final positions choose by the player on keyboard
	 * @return the color and the positions of the car choose by the player
	 */ 
	public Movement aleaMovement()
	{		
		 
		this.direction = direction.aleaDirection();
		this.position = position.aleaPosition();
	
		Random deplacement = new Random();
		this.deplacement = -6 + deplacement.nextInt(12);
	
		Movement mvt = new Movement(this.position, this.direction, this.deplacement);
		return mvt;
	}
	
		
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
	
	
	
	public boolean testmvtver(Position position, int deplacement, Vehicle[] vehicles)
	{
		if(deplacement>0)
		{
			for(int i = 1; i <= deplacement; i++)
			{
				Position posicurr = new Position(position.getX(), position.getY()+i);
				if(posicurr.getY()>6)
				{
					return false;
				}
				else
				{
					for(int j=0; j<vehicles.length; j++)
					{
						Position positionsCurr[] = vehicles[i].getPositions();
						for(int k=0; k<positionsCurr.length;k++)
						{
							if(posicurr == positionsCurr[k])
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
				if(posicurr.getY()<-6)
				{
					return false;
				}
				else
				{
					for(int j=0; j<vehicles.length; j++)
					{
						Position positionsCurr[] = vehicles[i].getPositions();
						for(int k=0; k<positionsCurr.length;k++)
						{
							if(posicurr == positionsCurr[k])
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
	
	
	public boolean testmvthor(Position position, int deplacement, Vehicle[] vehicles)
	{
		if(deplacement>0)
		{
			for(int i = 1; i <= deplacement; i++)
			{
				Position posicurr = new Position(position.getX()+i, position.getY());
				if(posicurr.getX()>6)
				{
					return false;
				}
				else
				{
					for(int j=0; j<vehicles.length; j++)
					{
						Position positionsCurr[] = vehicles[i].getPositions();
						for(int k=0; k<positionsCurr.length;k++)
						{
							if(posicurr == positionsCurr[k])
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
				if(posicurr.getX()<-6)
				{
					return false;
				}
				else
				{
					for(int j=0; j<vehicles.length; j++)
					{
						Position positionsCurr[] = vehicles[i].getPositions();
						for(int k=0; k<positionsCurr.length;k++)
						{
							if(posicurr == positionsCurr[k])
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

