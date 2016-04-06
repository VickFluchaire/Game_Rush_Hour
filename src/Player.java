import java.util.Scanner;

/**
 * this class represent the player.
 * @author Rivoire, Mahe
 */
public class Player
{
	
	/**
	 * Take the value of the vehicle's color choose by the player on keyboard
	 * @return the color of the car choose by the player
	 */ 
	public int playerColor()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la couleur du véhicule a deplacer  :");

		int color = sc.nextInt();

		System.out.println("Vous avez saisi : " + color);
		return color;
	}
	
	/**
	 * Take the value of the vehicle's position choose by the player on keyboard
	 * @return the positions of the car choose by the player
	 */
	public Position[] playerPosition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la position souhaité  :");

		int postionChoose = sc.nextInt();

		System.out.println("Vous avez saisi : " + postionChoose);
	
		return postionChoose;
	}
}
