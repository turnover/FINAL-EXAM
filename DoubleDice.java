
public class DoubleDice extends Dice
{
	private int Value;
	
	public DoubleDice()
	{
		Value = Throw()+Throw();
	}
}
