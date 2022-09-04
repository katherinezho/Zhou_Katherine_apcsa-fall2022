//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned="";
		
		for(int i=0, i<str.length(), i++){
			if(sentence.indexOf[i] == lookFor){
			}
			else{
				cleaned = cleaned + sentence.substring(i,i+1);
			}
		}
		return cleaned;

	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + " = " + removeLetters();
;
	}
}
