import java.util.Scanner;
public class RandomNumberGuesser {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String name ="Omar Abarca";
		int randNum, userGuess, highNum = 100, lowNum = 0;
		char yesOrNo = 'y';
		
		while(yesOrNo == 'y')
		{
		RNG.resetCount();
		randNum = RNG.rand(100);
		
		System.out.println("Enter your first guess");
		userGuess = userInput.nextInt();
		System.out.println("Number of guesses is 1");
		
		while(userGuess != randNum){
			if (RNG.getCount()/2 != 0)
			System.out.println("Number of guesses " + (RNG.getCount()/2 + 1));
			while(!RNG.inputValidation(userGuess, lowNum, highNum)){
				userGuess = userInput.nextInt();
			}
			if (userGuess > randNum)
			{
				System.out.println("Your guess is too high");
				highNum = userGuess;
			}
			else if (userGuess < randNum)
			{
				System.out.println("Your guess is too low");
				lowNum = userGuess;
			}
			}
		
		if(userGuess == randNum)
			System.out.println("Congratulations, you guessed correctly");
		
		System.out.println("\nTry again? (y or n)");
		yesOrNo = userInput.next().charAt(0);
		if(yesOrNo == 'n')
		{
			System.out.println("Thanks for playing..."); 
			System.out.println("By: " + name);
			System.exit(0);		
		}
		else
		{
			name = "";
			highNum = 100;
			lowNum = 0;
			main(args);
		}
		System.out.println();
		} 
		userInput.close();
	} 
}