//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player.toUpperCase();
		int select = (int)Math.floor(Math.random() * 3);
		if(select == 0)
			compChoice = "S";
		if(select == 1)
			compChoice = "P";
		if(select == 2)
			compChoice = "R";
	}

	public String determineWinner()
	{
		String winner = "";
		if((compChoice.equals("R") && playChoice.equals("S")) || (compChoice.equals("S") && playChoice.equals("P")) || (compChoice.equals("P") && playChoice.equals("R")))
			winner="!Computer wins";
		if((compChoice.equals("R") && playChoice.equals("P")) || (compChoice.equals("S") && playChoice.equals("R")) || (compChoice.equals("P") && playChoice.equals("S")))
			winner = "!Player wins";
		else
			winner = "!Draw Game";
		return winner;
	}

	public String toString()
	{
		String output="player had " + playChoice + "\n" + "computer had " + compChoice + "\n" +determineWinner();
		return output;
	}
}