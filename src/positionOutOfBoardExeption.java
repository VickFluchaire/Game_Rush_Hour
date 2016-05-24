
/**
 * @author rivoireg, mahef
 * creat a new exeption if the position is out of the board 
 */
public class positionOutOfBoardExeption extends Exception
{
	/**
	 * generate a message if a exeption is find 
	 */
	public positionOutOfBoardExeption()
	{
		System.out.println("la position choisis dépasse du tableau, elle doit être comprise entre 0 et 6");
	}
}
