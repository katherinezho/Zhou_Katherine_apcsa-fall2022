//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
		
	}

	public void setLetter(char c)
	{
		letter = c;

	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public String createTriangle()
	{
		String finalString = "";
		char currentLetter = letter;
		int x = amount;
		for(int k = amount; k > 0; k--) {
			for(int j = k; j>0; j--) {
				
				for(int i = x; i > 0; i--) {
					finalString += currentLetter;
					
				}
				finalString += " ";
				x--;
				if(currentLetter<90)
					currentLetter++;
				else
					currentLetter = 65;
			}
			finalString += "\n";
			currentLetter = letter;
			x = amount;
			
		}
		
		return finalString;
	}
	
	

	public String toString()
	{
		String output= createTriangle();
		return output;
	}
}