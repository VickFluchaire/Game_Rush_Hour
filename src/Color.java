import java.util.Random;


public enum Color
{
	RED,
	BLUE,
	YELLOW,
	GREEN,
	ORANGE,
	BLACK,
	PURPLE,
	BROWN;
	
	public Color aleaColor()
	{
		return Color.values()[new Random().nextInt(Color.values().length)];
	}		
}

