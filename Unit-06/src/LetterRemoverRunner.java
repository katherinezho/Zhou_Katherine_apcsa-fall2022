//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter String to Edit :: ");
		String s = keyboard.next();
		
		System.out.println("Enter Letter to Remove :: ");
		char rem = keyboard.next().charAt(0);
		
		LetterRemover letterRemove = new LetterRemover(s, rem);
		System.out.println(letterRemove);
	}
}
