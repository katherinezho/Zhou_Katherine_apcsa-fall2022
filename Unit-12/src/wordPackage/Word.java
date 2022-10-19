package wordPackage;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		if(getWord().length() == rhs.getWord().length()) {
			return toString().compareTo(rhs.toString());
		}
		else if(getWord().length() > rhs.getWord().length()) {
			return -1;
		}
		return 1;
	}
	public String getWord() {
		return word;
	}

	public String toString()
	{
		return word;
	}
}