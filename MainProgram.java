import java.util.Scanner;

public class MainProgram implements GuessANumber
{
	boolean done = false;
	boolean replay = false;
	Scanner input = new Scanner(System.in);
	String word;
	int guess;
	int win;
	int lose;
	int tie;
	int user;
	int dealer;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MainProgram main = new MainProgram();		
		boolean replay = false;
		while(!main.replay)
		{
			main.Game();
			main.PlayAgian();
		}
	}
	
		public void Game(){
			System.out.println("Do you want to play with Dice or do you want to play Blackjack? Please Type Dice or Blackjack: ");
			word = input.next();	
			switch(word.toLowerCase()) 
			{
				case"dice":
				{
					System.out.println("Do you want to roll 1 or 2 dice? Please type 1 or 2: ");
					guess = input.nextInt();
					if(guess == 1){					
					GuessANumber1();
					break;
				}
				else if(guess == 2){		
					GuessANumber2();
					break;
				}
				else
				{
					System.out.println("You did not type 1 or 2.");
					Game();
					break;
				}
				}
				case"blackjack":
				{
					BlackJack();
					break;
				}
			}
		}
		
		public void GuessANumber1() 
		{
			System.out.println("Guess the number the dice will land on: ");
			guess = input.nextInt();

			if(guess == dice.GetValue())
			{
				System.out.println("Correct");
				win++;
			}
			else{
				System.out.println("Wrong, the answer was "+dice.GetValue());
				lose++;
			}
		}

		public void GuessANumber2() 
		{
			System.out.println("Guess the total the dice will land on: ");
			guess = input.nextInt();

			if(guess == dubDice.GetValue())
			{
				System.out.println("Correct");
				win++;
			}
			else
			{
				System.out.println("Wrong, the answer was "+dubDice.GetValue());
				lose++;
			}
		}

		public void PlayAgian()
		{
			System.out.println("Your score is Wins:"+win+"Loses: "+lose+"Ties: "+tie);
			System.out.println("Do you want to play agian? yes or no: ");
			word = input.next();

			switch(word.toLowerCase()) 
			{

			case"no":
			{
				replay=true;

				break;
			}
			case"yes":
			{
				replay=false;

				break;
			}
			default:
			{
				System.out.println("You did not choose yes or no.");						
				PlayAgian();
			}

			}

		}
		
		public void BlackJack(){
			done = false;
			CardStart();
			while(!done)
			{
				ShowHand();

				System.out.println("Do you want to Hit or stay?");
				word = input.next();
				switch(word.toLowerCase()) 
				{
				case"hit":
				{
					Hit();			
				}
				}

				DealerPlay();
				Score();

			}
		}
		public void Hit(){
			user += card.Throw();
		}
		public void Score(){
			if(user == 21 && dealer != 21)
			{
				ShowHand();
				System.out.println("correct");
				win++;
				done = true;
			}
			else if(user <21 && dealer > 21){
				ShowHand();
				System.out.println("Correct");
				win++;
				done = true;
			}
			else if( (user >21 && dealer > 21)||(user == 21 && dealer == 21))
			{
				ShowHand();
				System.out.println("Tie");
				tie++;
				done = true;
			}
			else if(user > 21 && dealer <= 21 )
			{
				ShowHand();
				System.out.println("Lose");
				lose++;
				done = true;
			}

		}
		public void CardStart(){
			user = card.Throw(); 
			user += card.Throw();
			dealer = card.Throw();
			dealer += card.Throw();
		}
		public void ShowHand(){
			System.out.println("Your hand adds up to "+user);
			System.out.println("My hand adds up to "+dealer);
		}
		public void DealerPlay(){
			if(dealer<21 && user > dealer)
				DHand += card.Throw();

			else if(dealer<21 && user<17)
				dealer += card.Throw();
		}

}
