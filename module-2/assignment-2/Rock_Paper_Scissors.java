
/* 
Rashai Robertson
CSD 402
6/8/20025
Module 2: Assignment 2
 */


import java.util.Scanner;

public class Rock_Paper_Scissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Generating a random integer from 1-3 to play the game. Using math floor to prevent a zero resulting in the user losing.
		int computer = (int) Math.floor((Math.random() * 3) + 1);

		// Get user input to play
		System.out.print("Let's play a game. Enter (1) for rock, (2) for paper, or (3) for scissors: ");
		int user = input.nextInt();

		// Printing the results of the computers generated number using the case statement.
		System.out.print("You chose ");
		switch (user)
		{
			case 1: System.out.println("rock. "); break;
			case 2: System.out.println("paper. "); break;
			case 3: System.out.println("scissors. ");
		}

		System.out.print("The computer got ");
		switch (computer)
		{
			case 1: System.out.println("rock."); break;
			case 2: System.out.println("paper."); break;
			case 3: System.out.println("scissors."); 
		}

		
		// Check for a draw.
		if (user == computer)
			System.out.println("It's a draw!");

		// Check for the winner based on user input using else if. Print results.	
		else if ((user == 1 && computer == 3) ||
				 (user == 2 && computer == 1) || 
				 (user == 3 && computer == 2))
			
			System.out.println(" You win."); 


							  
			
			
			// If the outcome is not one of the results from above the user loses.	
		else 
			System.out.println("Sorry, you lose.");
		
	}
}
