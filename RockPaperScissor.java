import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		//Display Game Rules
		System.out.println("Welcome to the Rock-Paper-Scissor Game!");
		System.out.println("Rules: Rock beats Scissors, Scissors beats Paper, Paper beats Rock.");
		
		//Game Loop
		while(true) {
			//Get User's Choice
			System.out.println("Enter your choice (rock, paper, scissors): ");
			String userChoice = sc.nextLine().toLowerCase();	//convert to lowercase
			
			//Validate User's Choice
			if(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
				System.out.println("Invalid Choice. Please enter rock, paper, scissors.");
				continue;
			}
			
			//Generate computer's choice
			int computerChoiceIndex = rd.nextInt(3); //0-2
			String[] choices = {"rock", "paper", "scissors"};
			String computerChoice = choices[computerChoiceIndex];
			
			//Display computer's choice
			System.out.println("User's choice: " + userChoice);
			System.out.println("Computer's Choice: " + computerChoice);
			
			//Determine the winner
			String result;
			
			if (userChoice.equals(computerChoice)) {
				result = "It's a Tie!";
			} else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) || 
					   (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
					   (userChoice.equals("paper") && computerChoice.equals("rock"))) {
				result = "You Win!";
			} else {
				result = "Computer Win!";
			}
			
			//Display the result
			System.out.println(result);
			
			
			System.out.println("Do you want to play again? (yes/no): ");
			String playAgain = sc.nextLine().toLowerCase();
			
			if(!playAgain.equals("yes")) {
				break;
			}
			System.out.println();
		}
		System.out.println("Thank you for playing Rock-Paper-Scissors Game!");
		sc.close();
	}
}