import java.util.Random;

public class RandomNumber 
{
	Random random = new Random();
	
	public int RNG(int Max)
	{
		return random.nextInt(Max)+1;
	}
}
