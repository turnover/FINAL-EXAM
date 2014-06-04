
public class Dice extends RandomNumber
{
	protected static int Max=6;
	private int Value;
	
	RandomNumber random = new RandomNumber();
	
	public Dice()
	{
		Value = Throw();
	}
	
	public int GetValue()
	{
		return this.Value;
	}
	
	public int Throw()
	{
		return RNG(Dice.Max);
	}
}
