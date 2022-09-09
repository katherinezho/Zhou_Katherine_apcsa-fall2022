//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char playAgain;
		
		//add in a do while loop after you get the basics up and running
		
	do {	
			out.print("Rock-Paper-Scissors - pick you weapon [R,P,S] :: ");
			
			//read in the player value
			String player = keyboard.next().substring(0,1);
	
			RockPaperScissors game = new RockPaperScissors(player);
			System.out.println(game);
			
			out.print("Do you want to play again? ");
			playAgain = keyboard.next().charAt(0);
	}while(playAgain == 'y');
			
	}
}



