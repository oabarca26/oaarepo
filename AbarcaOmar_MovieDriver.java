import java.util.Scanner;
public class AbarcaOmar_MovieDriver {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Movie movieData = new Movie();
		String movieTitle, movieRating;
		int movieTickets;
		char yesOrNo;
		
		System.out.println("By Omar Abarca");
		do{		
		System.out.println("Enter the name of a movie");
		movieTitle = userInput.nextLine();
		movieData.setTitle(movieTitle);
		
		System.out.println("Enter the rating of the movie");
		movieRating = userInput.nextLine();
		movieData.setRating(movieRating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		movieTickets = userInput.nextInt();
		movieData.setSoldTickets(movieTickets);
		
		System.out.println(movieData.toString());
		
		userInput.nextLine(); 
		
		System.out.println("\nDo you want to enter another? (y or n)");
		yesOrNo = userInput.next().charAt(0);
		
		userInput.nextLine();
		
		System.out.println();
		}while(yesOrNo == 'y');
		
		userInput.close();
	}

}
