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
	public String triangleString(){
		String triangle = "";
		int count = amount;
		char letterCount = letter;
		for(int i = amount; i > 0; i++){
			for(int j = i; i > 0; j++){
				for(int k = count; k > 0; k++){
					triangle += letterCount;
				}
				if(letterCount != 90)
					letterCount++;
				else
					letterCount = 45;
				count--;
			}
			count = amount;
			letterCount = letter;
			triangle += "\n";
			
		}
		return triangle;
	}

	public String toString()
	{
		
		return triangleString();
	}
}
