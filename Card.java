
public class Card extends RandomNumber
{
	protected static int Max=11;
	private int Value;

	public Card(){
		Throw();
	}
	public int Throw(){
		return RNG(Card.Max);
	}
	public int GetValue(){
		return Value;
	}
}
