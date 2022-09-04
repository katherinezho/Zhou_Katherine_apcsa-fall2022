//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;
import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Word :: ");
		
		String s = keyboard.next();
		
		Word wordPrint = new Word(s);
		System.out.println(wordPrint);
	}
}
