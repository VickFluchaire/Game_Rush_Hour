
/**
 * This class reresents the board
 * // ...
 * @author RIVOIRE Gaspard, MAHE Florian 
 */
public class Board
{
	/**
	 * size of the board
	 */
	private static final int BOARD_SIZE = 6;
	
	/**
	 * Number of vehicles of the game
	 */
	private static final int NUMBER_OF_VEHICLES = 8;

	/**
	 *  General size of car
	 */
	private static final int SIZE_CAR = 2;
	
	/**
	 * General size of truck
	 */
	private static final int SIZE_TRUCK = 3;
	
	/**
	 * Position of the exit
	 */
	private static final Position POSITION_EXIT = new Position(5,2);
	
	/**
	 * Vehicles (including red one)
	 */
	private Vehicle[] vehicles;
	
	public Vehicle[] getVehicles() {
		return this.vehicles;
	}


	/**
	 * Test if the game is over
	 * @return true if the game is over
	 */
	public boolean redCarOnExit()
	{
		int i=0;
		while(this.vehicles[i].getColor() != Color.RED)
		{
			i++;
		}
		Position positionCurr[] = this.vehicles[i].getPositions();
		for(int j=0;j<positionCurr.length;j++)
		{
			if(positionCurr[j].equals(POSITION_EXIT)==true)
			{
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Create a tab with who contain with all vehicle with their positions. 
	 */
	public Board()
	{		
		this.vehicles = new Vehicle[NUMBER_OF_VEHICLES];
		
		Position[] positionsV1 = new Position[SIZE_CAR];
		positionsV1[0] = new Position(1,2);
		positionsV1[1] = new Position(2,2);
		this.vehicles[0] = new Vehicle(Color.RED,positionsV1,Direction.HORIZONTAL);
		
		Position[] positionsV2 = new Position[SIZE_CAR];
		positionsV2[0] = new Position(1,4);
		positionsV2[1] = new Position(2,4);
		this.vehicles[1] = new Vehicle(Color.BLUE,positionsV2, Direction.HORIZONTAL);
		
		Position[] positionsV3 = new Position[SIZE_TRUCK];
		positionsV3[0] = new Position(5,3);
		positionsV3[1] = new Position(5,4);
		positionsV3[2] = new Position(5,5);
		this.vehicles[2] = new Vehicle(Color.YELLOW,positionsV3,Direction.VERTICAL);
		
		Position[] positionsV4 = new Position[SIZE_CAR];
		positionsV4[0] = new Position(1,0);
		positionsV4[1] = new Position(2,0);
		this.vehicles[3] = new Vehicle(Color.GREEN,positionsV4, Direction.HORIZONTAL);
		
		Position[] positionsV5 = new Position[SIZE_CAR];
		positionsV5[0] = new Position(0,4);
		positionsV5[1] = new Position(0,5);
		this.vehicles[4] = new Vehicle(Color.ORANGE,positionsV5, Direction.VERTICAL);
		
		Position[] positionsV6 = new Position[SIZE_TRUCK];
		positionsV6[0] = new Position(3,1);
		positionsV6[1] = new Position(3,2);
		positionsV6[2] = new Position(3,3);
		this.vehicles[5] = new Vehicle(Color.BLACK,positionsV6, Direction.VERTICAL);
		
		Position[] positionsV7 = new Position[SIZE_TRUCK];
		positionsV7[0] = new Position(0,0);
		positionsV7[1] = new Position(0,1);
		positionsV7[2] = new Position(0,2);
		this.vehicles[6] = new Vehicle(Color.PURPLE,positionsV7, Direction.VERTICAL);
		
		Position[] positionsV8 = new Position[SIZE_TRUCK];
		positionsV8[0] = new Position(2,5);
		positionsV8[1] = new Position(3,5);
		positionsV8[2] = new Position(4,5);
		this.vehicles[7] = new Vehicle(Color.BROWN,positionsV8, Direction.HORIZONTAL);
	}


	public String toString()
	{ 
		
		String resultat = "";
		for(int y=0; y<BOARD_SIZE; y++)
		{
			for(int x=0; x<BOARD_SIZE; x++)
			{
				
				boolean etat =  false;
				Position pos = new Position(x,y);
				for(int i=0; i<this.vehicles.length; i++)
				{
					Position positionCurrs[] = this.vehicles[i].getPositions();
					for(int j = 0; j<positionCurrs.length; j++)
					{
						if(positionCurrs[j].getX() == pos.getX() && positionCurrs[j].getY() == pos.getY())
						{
							resultat = resultat + " " + i + " ";
							etat = true;
						}
					}
				}
				if(etat == false)
				{
					resultat = resultat + " " + "*" + " ";
				}
				if(x==5)
				{
					resultat = resultat + "\n";
				}
			}
		}
		System.out.println(resultat);
		return resultat;
	}
	
	
}