/**
 * An application that launches a Rush Hour game.
 * @author Rivoire, Mahe
 */
public class RushHourApp
{
	/**
	 * Application's main
	 * @param args command-line arguments (unused)
	 * @throws positionOutOfBoardExeption 
	 */
	public static void main(String[] args) throws positionOutOfBoardExeption
	{
		new RushHourGame().play();
	}

}
